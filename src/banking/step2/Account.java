package banking.step2;

abstract class Account {
    String accountNum;
    String customerName;
    int balanceMoney;

    public Account(String accountNum, String customerName, int balanceMoney) {
        this.accountNum = accountNum;
        this.customerName = customerName;
        this.balanceMoney = balanceMoney;
    }

    public void showAllInfo() {
        System.out.println("계정번호: " + accountNum);
        System.out.println("고객이름: " + customerName);
        System.out.println("잔고: " + balanceMoney);
    }

    public abstract void addInterest();
}
		
	
	 
	 
