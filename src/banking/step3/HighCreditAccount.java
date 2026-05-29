package banking.step3;

class HighCreditAccount extends Account {
	// 자식에서 멤버변수 확장
	double basicInterest; // 기본이자
	String creditGrade; // 신용등급(A,B,C)

	// 생성자
	public HighCreditAccount(String accountNum, String customerName,
    		int balanceMoney, double basicInterest, String creditGrade) {
        //부모클래스 생성자 호출
		super(accountNum, customerName, balanceMoney);
		//자신의 멤버 초기화 
        this.basicInterest = basicInterest;
        this.creditGrade = creditGrade;
	}
	

	@Override
	public void calculatedBalance(int money) {
		//신용계좌 : 잔고 + (잔고 * 기본이자) + (잔고 * 추가이자) + 입금액
		
		/////////////////////////////////////////////////
		/*
		문제의조건]
			A,B,C 등급별로 각각 기본이율에 7%, 4%, 2%의 이율을 추가로 제공한다.
		 */
		if(creditGrade.equals("A")) {
			//이 회원이 A등급이라면 아래 계산식에 의해 계산된다. 
			//-잔고 + (잔고 * 기본이자) + (잔고 * 추가이자(7%)) + 입금액
			//이 회원이 B등급이라면
			//이 회원이 C등급이라면
			
			balanceMoney = balanceMoney + (int)((balanceMoney * basicInterest))
					+ (balanceMoney * (7/100)) 
					+ money;
				    
		} else if (creditGrade.equals("B")) {
			//이 회원이 A등급이라면 아래 계산식에 의해 계산된다. 
			//-잔고 + (잔고 * 기본이자) + (잔고 * 추가이자(4%)) + 입금액
			balanceMoney = balanceMoney + (int)((balanceMoney * basicInterest)) 
					+ (balanceMoney * (4/100)) 
					+ money;
			
		} else if (creditGrade.equals("C")) {
			//이 회원이 A등급이라면 아래 계산식에 의해 계산된다. 
			//-잔고 + (잔고 * 기본이자) + (잔고 * 추가이자(2%)) + 입금액
			balanceMoney = balanceMoney + (int)(balanceMoney * (basicInterest)) 
					+ (balanceMoney * (2/100))
					+ money;
					
		}
		
	
	}
}
