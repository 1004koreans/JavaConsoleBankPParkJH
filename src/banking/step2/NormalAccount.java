package banking.step2;

import java.util.Scanner;
//보통계좌 : 일반적인 이자율 계산방식 사용 
class NormalAccount extends Account {
    
	double basicInterest; //기본이자

	//생성자
    public NormalAccount(String accountNum, String customerName, int balanceMoney, 
    		int basicInterest) {
    	//부모클래스 초기화
        super(accountNum, customerName, balanceMoney);
        //이자율 초기화 
        this.basicInterest = basicInterest;
    }

    //이자 계산 
    @Override
    public void calculatedBalance(int money) {
    	//일반계좌 : 잔고 + (잔고 * 기본이자) + 입금액
    	balanceMoney = balanceMoney + 
    			(int)(balanceMoney * (basicInterest/100)) + money;
    } 
}