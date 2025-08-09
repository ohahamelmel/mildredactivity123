package banking2;

public class main2{
    
    private int accNo;
    private float balance;
    private int pin;
    
    public float getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }
    
    public void setBalance(float balance) {
        this.balance = balance;
    }            
       
    public void setPin(int pin) {
        this.pin = pin;
    }
    
    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }
    
    public int getAccNo() {
        return accNo;
    }
           
    public boolean verifyAccount(int accn, int pn) {
        return (accNo == accn && pin == pn);
    }    
    
    public void deposit(float amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    
    public void withdraw(float amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            System.out.println("New Balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}

            
    
   
    

