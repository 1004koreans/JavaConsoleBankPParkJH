package dummy.step11;

import java.util.Scanner;

import banking.step1.Account;

public class BankingSystemMain11 {
	private static final String Interger = null;
	private static Account[] accounts;
	private static int numOfAccount;
	private static String customerName;

	public static void main(String[] args0) {
		accounts = new Account[10];
		while (true) {
			showMenu();
			System.out.println("선택");
			int choice = scan.nextInt();
			scan.nextLine();
		
			switch (choice){
			case 1:
				makeAccount();
				break;
//					
//				case2:
//		//			depositMoney();
//				break
//				
//			case3:
//				withdrawlMoney();
//				break
//				case4:
//					showAccInfo();
//				break
//				case 5:
//					return
//							

		
	}

	public static void showMenu() {
		System.out.println("1.계좌개설");
		System.out.println("2.입금");
		System.out.println("3.출금");
		System.out.println("4.계정정보출력");
		System.out.println("5.프로그램종료");

		/////////////////////////////
	}

	public static void makeAccount() {
		System.out.println("신규계좌개설");
		System.out.println("계좌번호");
		String accountNum = scan.nextLine();

		System.out.println("고객이름: ");
		String scan = scan.nextLine();

		System.out.println("잔고");
		String balanceMoney = scan.nextLine();

		Account11 p = new Account11(accountNum, customerName, Interger.valueOf(balanceMoney));
		System.out.println(p.accountNum);
		System.out.println(p.customerName);
		System.out.println(p.balanceMoney);
		accounts[numOfAccount++] = p;

	}

	// 계좌출력정보
	public static void showACCiNFO() {
		System.out.println("계좌번호: " = acc.accountNum);
		System.out.println("고객이름: " + acc.customerName);
		System.out.println(" 잔고: " + acc.balanceMoney);
	}

	}

	// 입금 2
	public static void depositMoney() {
	 			System.out.println("===입금===");
	 			System.out.println(" 게좌번호와 임금할 금액을 넣으시오");
	 			System.out.println("계좌번호");
	 			String accNo= scan.nextLine();
	 			System.out.println("임금액");
	 		String addMoney =scan.nextLine();
	 		System.out.println("입금완료되었습니다");
	 		for ( int i=0; i< numOfAccount: i++) {
	 			Account acc= accounts[i];
	 			if (acc.accountNum.equals((accNo))) {
	 				acc.balanceMoney =acc.balanceMoney + Integer.valueOf(AddMoney))
break;
//출금3
public static void withdrawlMoney() {
	System.out.println("계좌번호와 출금할 금액을 넣으세요");
	System.out.println("계좌번호: ");
	String accNo= scan.nextLine();
	System.out.println("출금액");
	String subMoney = scan.nextLine();
	System.out.println("출금인 완료되었습니다");
	for (int i=0; i< numofAccount; i++) {
		Account acc = account[i];
		if(acc.accountNum.equals(accNo)) {
			acc.balanceMoney = acc.balanceMoney - Integer.valueOf(subMoney);
break;

		}
	}
	
}


	 			}
	 		}
	 		
	 			
	 			
	 		}}

	private static Scanner scan = new Scanner(System.in)

}
