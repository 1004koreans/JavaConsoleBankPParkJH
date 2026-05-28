package banking.step1;

import java.util.Scanner;

public class BankingSystemMain {

	private static Scanner scan = new Scanner(System.in);
	private static Account[] accounts; // Account로 만든 배열통의 이름이 "accounts"이다
	private static int numOfAccount;

	public static void main(String[] args) {
		accounts = new Account[10];// accounts = 10개 Account 배열 정의
	 
		while (true) {

			showMenu();
			System.out.print("선택: ");
			int choice = scan.nextInt();//장수를 읽은걸 choice라 하자
			scan.nextLine();//남은 enter 제거

			switch (choice) {
			case 1:
				makeAccount();
				break;
			case 2:
				depositMoney();
				break;
			case 3:
				withdrawMoney();
				break;
			case 4:
				showAccInfo();
				break;
			case 5:
				return;

			}
		}
	}

	public static void showMenu() {
		System.out.println("1.계좌개설");
		System.out.println("2.입금");
		System.out.println("3.출금");
		System.out.println("4.계좌정보출력");
		System.out.println("5.프로그램종료");
	}

////////////////////////////////////////////

//계좌개설1
	public static void makeAccount() {
		System.out.println("신규계좌개설");
		System.out.print("계좌번호: ");
		String accountNum = scan.nextLine();//계좌번호 다음을 읽어온다

		System.out.print("고객이름: ");
		String customerName = scan.nextLine();

		System.out.print("잔고: ");
		String balanceMoney = scan.nextLine();

		//Account클라스에서 만든 p,계좌객체를 참조변수로 만들어 3개를 묶어서 이동한다 왜? 편리함
		Account p = new Account(accountNum, customerName, Integer.valueOf(balanceMoney));
		System.out.println(p.accountNum);//객체,p의 accountNum이다
		System.out.println(p.customerName);
		System.out.println(p.balanceMoney);
		accounts[numOfAccount++] = p;//문자열 입력값,1씩 증가하면서 계좌객체를 배열에 저장
	}

//계좌정보출력4
	public static void showAccInfo() {
		System.out.println("#### 계좌정보출력 ###");
		for (int i = 0; i < numOfAccount; i++) {
			Account acc = accounts[i];//중요

			System.out.println("계좌번호: " + acc.accountNum);
			//acc(accounts[i])의 accountNum이다
			//System.out.println("계좌번호: " + accounts[i].accountNum);
			System.out.println("고객이름: " + acc.customerName);
			System.out.println("잔고: " + acc.balanceMoney);
		}
	}

	// 입금2
	public static void depositMoney() {
		System.out.println("####입금#####");
		System.out.println("계좌번호와 입금할 금액을 입력하세요");
		System.out.println("계좌번호: ");
		String accNo = scan.nextLine();
		System.out.println("입금액: ");
		String addMoney = scan.nextLine();
		System.out.println("입금액이 완료되었습니다");
		for (int i = 0; i < numOfAccount; i++) {
			Account acc = accounts[i];
			if (acc.accountNum.equals(accNo)) {
				//acc (accounts배열)의 accountNum이
				//입력한 accNo와 같은가? 확인요
				//if(accounts[i].accountNum.equals(accNo)와 같다.
				acc.balanceMoney = acc.balanceMoney + Integer.valueOf(addMoney);
				break;
			}
		}
	}

	
	//출금3
	public static void withdrawMoney() {
		System.out.println("계좌번호와 출금할 금액을 입력하세요");
		System.out.println("계좌번호: ");
		 String  accNo=scan.nextLine();
		 System.out.println("출금액: ");
		 String subMoney=scan.nextLine();
		 System.out.println("출금이 완료되었습니다.");
		 for (int i=0; i < numOfAccount; i++) {
			 Account acc = accounts[i];
			 if (acc.accountNum.equals(accNo)) {
				 acc.balanceMoney = acc.balanceMoney - Integer.valueOf(subMoney);
				 break;
			 }
		 }
	}
	
	

}
