package banking.step2;

class HighCreditAccount extends Account {
	double extraInterestC =0.02, double extraInterestB =0.04, 
			double extraInterestA =0.07;

	public HighCreditAccount(String accountNum, String customerName,
    		int balanceMoney, double extraInterest) {
        super(accountNum, customerName, balanceMoney);
        this.extraInterest = extraInterest;
    }

	@Override
	public void addInterest(int money) {

		balanceMoneyC = (int) (balanceMoney + (balanceMoney * 0.02) +
				       (money * extraInterestC));
		balanceMoneyB = (int)(balanceMoney + (balanceMoney * 0.02) + 
				        (money * extraInterestB));
		balanceMoneyA = (int)(balanceMoney + (balanceMoney * 0.02) + 
				       (money * extraInterestA));
		
	}

	 