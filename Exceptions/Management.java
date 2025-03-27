class InsufficientBalanceException extends Exception {

  public InsufficientBalanceException(String message) {
    super(message);
  }
}

class Bank {
  private String name;
  private double bal;

  Bank(String name, double bal) {
    this.name = name;
    this.bal = bal;
  }

  public String getName() {
    return name;
  }

  public double getBal() {
    return bal;
  }

  void withdraw(double amt) throws InsufficientBalanceException {
    try {
      if (amt > bal) {
        throw new InsufficientBalanceException("Insufficient balance!");
      }
      double X = getBal() - amt;
      System.out.println("Withdrawal successful, new balance: " + X);

    } catch (IllegalArgumentException e) {
      System.err.println("Amt is negative");
    } catch (InsufficientBalanceException e) {
      System.err.println("Insufficient balance!");
    }
  }
}

class Management {
  public static void main(String[] args) throws InsufficientBalanceException {
    Bank b1 = new Bank("HDFC", 20000);
    b1.withdraw(110000) ;
  }
}
