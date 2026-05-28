package banking.step2;

//부모클래스(추상클래스로 정의) 
abstract class Account {
	//멤버변수
    String accountNum; //계좌번호
    String customerName; //예금주
    int balanceMoney; //잔고

    public Account(String accountNum, String customerName, int balanceMoney) {
        this.accountNum = accountNum;
        this.customerName = customerName;
        this.balanceMoney = balanceMoney;
    }
    
    //계정정보출력
    public void showAllInfo() {
        System.out.println("계정번호: " + accountNum);
        System.out.println("고객이름: " + customerName);
        System.out.println("잔고: " + balanceMoney);
    }

    //이자계산을 위한 추상메서드로 정의. 오버라이딩이 목적. 
    public abstract void calculatedBalance(int money);
}
		
	
	 
	 
