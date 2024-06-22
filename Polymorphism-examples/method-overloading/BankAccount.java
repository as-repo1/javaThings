public class BankAccount{
    private double balance;

    public BankAccount(double initBalance){
        this.balance = initBalance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void deposit(double amount, String currency){
        if(currency.equals("Rupees")){
            balance += amount;
        }else if(currency.equals("USD")){
            balance += amount*80;
        }
    }

    public void deposit(double amount, String currency, double exchangeRare){
        balance += amount * exchangeRare;

    }

    public double getBalance(){return balance;}

    public static void main(String[] args){
        BankAccount account = new BankAccount(500);

        account.deposit(100);
        System.out.println("Balance after deposit: "+account.getBalance());

        account.deposit(10, "USD");
        System.out.println("Balance after deposit USD: "+account.getBalance());

        account.deposit(200, "Taka", 1.41);
        System.out.println("Balance after Exchange Rate: "+account.getBalance());
    }
}
