package banking.step2;

import java.util.Scanner;

class NormalAccount extends Account {
    double basicInterest = 0.02;

    public NormalAccount(String accountNum, String customerName, int balanceMoney, 
    		int basicInterest) {
        super(accountNum, customerName, balanceMoney);
    }

    @Override
    public void addInterest(int money) {
    	balanceMoneyG = (int) (balanceMoney + (balanceMoney * 0.02) +
			       (money * basicInterest));
    }
}