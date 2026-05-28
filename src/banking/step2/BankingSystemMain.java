package banking.step2;

import java.util.Scanner;

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
	
	public static void main(String[] args) {
		
		//메니져 클래스의 인스턴스 생성
		AccountManager mgr = new AccountManager();
		
		//무한루프
		while (true) {
			//첫번째로 메뉴를 보여준다. 
			showMenu();
			System.out.print("메뉴선택:");
			int choice = scan.nextInt();//정수로 읽고 choice 라 하자
			scan.nextLine();//남은 enter 제거함

			switch (choice) {
			case ICustomerDefine.MAKE: //계좌개설
				mgr.makeAccount();
				break;
			case ICustomerDefine.DEPOSIT: //입금
				mgr.depositMoney();
				break;
			case 3: //출금
				mgr.withdrawMoney();
				break;
			case 4: //계좌정보전체출력
				mgr.showAccInfo();
				break;
			case 5: //종료
				return;
			}
		}
	}
}
