package banking.step3;
 
public interface  ICustomerDefine {	
	//MAKE=1
	//DEPOSIT=2
	//WITHDRAW=3
	//INQUIRE=4
	//EXIT=5
	//메뉴선택을 위한 상수
	int MAKE = 1;
	int DEPOSIT = 2;
	int WITHDRAW = 3;
	int INQUIRE = 4;
	int EXIT = 5;
	
	//신용등급에 따른 추가 이자율
	int InterA = 7;
	int InterB = 4;
	int InterC = 2;
}
