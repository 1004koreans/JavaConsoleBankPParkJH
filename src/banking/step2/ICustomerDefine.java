package banking.step2;
 
public interface  ICustomerDefine {
	
	   public static Scanner scan = new Scanner(System.in);
       void showAllInfo();
       void AddInterest();
       
       class NormalAccount implements ICustomerDefine {
    	   String accountNum;
    	   String customerName;
    	   int balanceMoney;
    	   public NormalAccount( String accountNum,String customerNmae, int balanceMoney)
    	   { this.accountNum=accountNum;
    	   this.customerName = customerName;
    	   this.balanceMoney =balanceMoney;
    	   }
    	   @Override
    	   public void openAcc() {
    		   System.out.println("-----신규계좌개설-----");
   	        System.out.println("1.보통계좌");
   	        System.out.println("2.신용계좌");
   	        int choice = scan.nextInt();
   	        scan.nextLine();
   	        
    		   System.out.print("계좌번호:");
   	        String accountNum = scan.nextLine();

   	        System.out.print("고객이름:");
   	        String customerName = scan.nextLine();

   	        System.out.print("초기잔고:");
   	        int balanceMoney = scan.nextInt();
   	        scan.nextLine();

       }
       
       
	    public static void main(String[] args) {
	        System.out.println("-----신규계좌개설-----");
	        System.out.println("1.보통계좌");
	        System.out.println("2.신용계좌");
	        int choice = scan.nextInt();
	        scan.nextLine();

	        System.out.print("계좌번호:");
	        String accountNum = scan.nextLine();

	        System.out.print("고객이름:");
	        String customerName = scan.nextLine();

	        System.out.print("초기잔고:");
	        int balanceMoney = scan.nextInt();
	        scan.nextLine();

	        Account acc = null;

	        if (choice == 1) {
	            acc = new NormalAccount(accountNum, customerName, 
	            		balanceMoney);
	        } else if (choice == 2) {
	            System.out.println("신용등급 선택");
	            System.out.println("1.A등급");
	            System.out.println("2.B등급");
	            System.out.println("3.C등급");
	            int grade = scan.nextInt();

	            double extraInterest = 0.0;
	            if (grade == A) {
	                extraInterest = 0.07;
	            } else if (grade == B) {
	                extraInterest = 0.04;
	            } else if (grade == C) {
	                extraInterest = 0.02;
	            }

	            acc = new HighCreditAccount(accountNum, customerName, 
	            		balanceMoney, extraInterest);
	        }

	        if (acc != null) {
	            acc.showAllInfo();
	        }
	    }
	}
	
   class HighCreditAccount implements IAccount {
    	    String accountNum;
    	    String customerName;
    	    int balanceMoney;
    	    double extraInterest;
       
       public HighCreditAccount(String accountNum, String customerName, int balanceMoney, double extraInterest) {
           this.accountNum = accountNum;
           this.customerName = customerName;
           this.balanceMoney = balanceMoney;
           this.extraInterest = extraInterest;
       }

       @Override
       public void showAllInfo() {
           System.out.println("계좌번호: " + accountNum);
           System.out.println("고객이름: " + customerName);
           System.out.println("잔고: " + balanceMoney);
       }

       @Override
       public void addInterest() {
           balanceMoney += (int)(balanceMoney * 0.02 + balanceMoney * extraInterest);
       }
   }
//	
//	
//	int makeAccount = 1;
//	int depositMoney = 2;
//	int withdrawMoney = 3;
//	int showAccInfo = 4;
//////////////////////////////////////////// 
//	int Interest2 =7;
//	int Interest5 =8;
//	int Interest7 =9;
////////////////////////////////////////////
///  
}
