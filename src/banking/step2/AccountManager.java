package banking.step2;

//메니져 클래스 정의
public class AccountManager {

	//멤버변수
	// Account 로 만든 배열통의 이름이 "accounts"이다
	private Account[] accounts; 
	private int numOfAccount;
		
	//생성자
	public AccountManager() {
		// accounts = 10개 Account 배열 정의
		accounts = new Account[10];
		numOfAccount = 0;
	}
	
	
	public void showAccu() {
		System.out.println("계좌종류를 선택하세요.");
		System.out.println("1.보통계좌");
		System.out.println("2.신용계좌");
	}

	//계좌개설1
	public void makeAccount() {
		System.out.println("##계좌개설##");
		showAccu();
		int aaa = BankingSystemMain.scan.nextInt();
		if(aaa==1) { //보통계좌 개설
			System.out.println("보통계좌를 개설합니다.");
		}
		else if(aaa==2) { //신용신뢰계좌 개설
			System.out.println("신용신뢰계좌를 개설합니다.");
		}
	}
//	public void makeAccount() {
//		System.out.println("신규계좌개설");
//		System.out.print("계좌번호: ");
//		String accountNum = scan.nextLine();//계좌번호 다음을 읽어온다
//
//		System.out.print("고객이름: ");
//		String customerName = scan.nextLine();
//
//		System.out.print("잔고: ");
//		String balanceMoney = scan.nextLine();
//
//		//Account 클라스에서 만든 p,계좌객체를 참조변수로 만들어 3개를 묶어서 이동한다 왜? 편리함
//		Account startAcc = new Account(accountNum, customerName, Integer.valueOf(balanceMoney));
//		System.out.println(startAcc.accountNum);//객체,p 의 accountNum이다
//		System.out.println(startAcc.customerName);
//		System.out.println(startAcc.balanceMoney);
//		accounts[numOfAccount++] = startAcc;//문자열 입력값,1씩 증가하면서 계좌객체를 배열에 저장
//	}
	//계좌정보출력4
	public void showAccInfo() {
		System.out.println("##계좌정보전체출력##");
	}
//	public void showAccInfo() {
//		System.out.println("#### 계좌정보출력 ###");
//		for (int i = 0; i < numOfAccount; i++) {
//			System.out.println("계좌번호: " + accounts[i].accountNum);
//			//acc(accounts[i])의 accountNum이다
//			//System.out.println("계좌번호: " + accounts[i].accountNum);
//			System.out.println("고객이름: " + accounts[i].customerName);
//			System.out.println("잔고: " + accounts[i].balanceMoney);
//		}
//	}
	// 입금2
	public void depositMoney() {
		System.out.println("##입금처리##");
	}
//	public void depositMoney() {
//		System.out.println("####입금#####");
//		System.out.println("계좌번호와 입금할 금액을 입력하세요");
//		System.out.println("계좌번호: ");
//		String accNo = scan.nextLine();
//		System.out.println("입금액: ");
//		String addMoney = scan.nextLine();
//		System.out.println("입금액이 완료되었습니다");
//		for (int i = 0; i < numOfAccount; i++) {
//			if (accounts[i].accountNum.equals(accNo)) {
//				//acc (accounts 배열)의 accountNum이
//				//입력한 accNo와 같은가? 확인요
//				//if(accounts[i].accountNum.equals(accNo)와 같다.
//				accounts[i].balanceMoney = accounts[i].balanceMoney + Integer.valueOf(addMoney);
//				break;
//			}
//		}
//	}
	//출금3
	public void withdrawMoney() {
		System.out.println("##출금처리##");
	}
//	public void withdrawMoney() {
//		System.out.println("계좌번호와 출금할 금액을 입력하세요");
//		System.out.println("계좌번호: ");
//		 String  accNo=scan.nextLine();
//		 System.out.println("출금액: ");
//		 String subMoney=scan.nextLine();
//		 System.out.println("출금이 완료되었습니다.");
//		 for (int i=0; i < numOfAccount; i++) {
//			 
//			 if (accounts[i].accountNum.equals(accNo)) {
//				 accounts[i].balanceMoney = accounts[i].balanceMoney - Integer.valueOf(subMoney);
//				 break;
//			 }
//		 }
//	}
}
