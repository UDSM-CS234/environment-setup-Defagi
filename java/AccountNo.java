public class AccountNo {
    private String accountName;
    private int accountno;
    private double balance;

    AccountNo( String accName, int accno){
        accountName = accName;
        accountno = accno;
        balance = 0;
    }
    public void deposit(double amount){
        if(amount>=150.00){
            balance= balance+amount;
        }
        else{
            System.out.println("enter the system amount");
    }
}
    public void withdraw(double amount){
        if(amount< this.balance){
            double newbalance = balance - amount;
            balance=newbalance;
            System.out.println("WITHDRAWAL SUCCESSFUL");
        }
    
        else{
              System.out.println("INSUFFICIENT FUND");
        
    }
    }
    public int getaccountno(){
        return accountno;
    }
    public String getaccountName(){
        return accountName;
    }
    public double getbalance(){
        return balance;
    }

   public static void main(String[] args){
       AccountNo acc1 = new AccountNo("KANDINDI", 123451);
       AccountNo acc2 = new AccountNo("HAPPY", 654321);
       /* System.out.printf("accountno #%s%nName: %s%initial balance of Tsh%.2f",
        acc1.getaccountno(), acc1.getaccountName(), acc1.getbalance());
        System.out.printf("accountno #%s%nName: %s%initial balance of Tsh%.2f",
        acc2.getaccountno(), acc2.getaccountName(), acc2.getbalance());*/

       acc1.deposit(456.00);
       acc1.withdraw(200.00);
       acc2.deposit(500.00);
       acc2.withdraw(100);
   } 
}
