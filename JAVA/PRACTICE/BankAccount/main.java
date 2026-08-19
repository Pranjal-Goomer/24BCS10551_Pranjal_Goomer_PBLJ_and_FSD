import java.util.*;

class bankAccount{
  private String accountNumber;
  private double balance;

  bankAccount(String accountNumber, double balance){
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public double getBalance(){
    return balance;
  }

  public double setBalance(double amount){
    if(amount >= 0){
      this.balance = amount;
    }
    return balance;
  }

  public double withdraw(double amount){
    if(amount > 0){
      if(this.balance > 0 && this.balance > amount){
        this.balance = balance - amount;
      }
    }
    return balance;
  }

  public double deposit(double amount){
    if(amount > 0){
      this.balance = balance + amount;
    }
    return balance;
  }
}

public class main {
    public static void main(String[] args) {
      bankAccount obj = new bankAccount("Pranjal", 1000);

      System.out.println(obj.deposit(1100));
      System.out.println(obj.withdraw(500));
      System.out.println(obj.setBalance(12000));
      System.out.println(obj.getBalance());
    }
}