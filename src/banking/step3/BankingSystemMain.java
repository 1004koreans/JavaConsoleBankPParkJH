package banking.step3;

import java.util.Scanner;
import java.util.InputMismatchException;



public class BankingSystemMain {

	//프로그램 전체에서 딱 하나만 생성해서 사용하는 정적변수 
	public static Scanner scan = new Scanner(System.in);
	
	public static void showMenu() {
		System.out.println("1.계좌개설");
		System.out.println("2.입금");
		System.out.println("3.출금");
		System.out.println("4.계좌정보출력");
		System.out.println("5.프로그램종료");		
	}
	
	// 개발자 정의 예외 클래스
	public class InvalidMenuNumberException extends Exception {
	    public InvalidMenuNumberException(String message) {
	        super(message);
	    }
	}
	
	public static void main(String[] args) {
		
		//메니져 클래스의 인스턴스 생성
		AccountManager mgr = new AccountManager();
		
		//무한루프
		while (true) {
			//첫번째로 메뉴를 보여준다. 
			showMenu();
			System.out.print("메뉴선택:");
			
			int choice = 0;
            
            // try~catch: 문자 입력 시 예외 처리 (InputMismatchException)
            try {
                choice = scan.nextInt();
                scan.nextLine(); // 남은 enter 제거
                
                // 조건문: 지정된 정수(1~5) 이외의 숫자 입력 시 개발자 정의 예외 발생
                if (choice < ICustomerDefine.MAKE || choice > ICustomerDefine.EXIT) {
                    throw new InvalidMenuNumberException
                    ("지정된 메뉴(1~5)만 입력할 수 있습니다.");
                }
                
            } catch (InputMismatchException e) {
                // 메뉴선택할때 문자를 입력할 수 없다.
                System.out.println("메뉴선택할때 문자를 입력할 수 없다.");
                scan.nextLine(); // 잘못 입력된 문자 제거
                continue; // 무한루프 다시 시작
            } catch (InvalidMenuNumberException e) {
                // 개발자 정의 예외 처리
                System.out.println(e.getMessage());
                continue; // 무한루프 다시 시작
            }
            
            switch (choice) {
                case ICustomerDefine.MAKE:   // 계좌개설(1)
                    mgr.makeAccount();
                    break;
                case ICustomerDefine.DEPOSIT: // 입금(2)
                    mgr.depositMoney();
                    break;
                case ICustomerDefine.WITHDRAW: // 출금(3)
                    mgr.withdrawMoney();
                    break;
                case ICustomerDefine.INQUIRE: // 계좌정보전체출력(4)
                    mgr.showAccInfo();
                    break;
                case ICustomerDefine.EXIT:   // 종료 (5)
                    System.out.println("프로그램을 종료합니다.");
                    return;
            } // switch
        } // while
    } // main

			
			
//			int choice = scan.nextInt();//정수로 읽고 choice 라 하자
//			scan.nextLine();//남은 enter 제거함

//			switch (choice) {
//			case ICustomerDefine.MAKE: //계좌개설
//				mgr.makeAccount();
//				break;
//			case ICustomerDefine.DEPOSIT: //입금
//				mgr.depositMoney();
//				break;
//			case ICustomerDefine.WITHDRAW: //출금
//				mgr.withdrawMoney();
//				break;
//			case ICustomerDefine.INQUIRE: //계좌정보전체출력
//				mgr.showAccInfo();
//				break;
//			case 5: //종료
//				return;
			}//switch
		//showMenu
	//AccountManager
//public static Scanner
