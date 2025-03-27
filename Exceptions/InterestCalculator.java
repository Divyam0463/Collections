class InterestCalculator {

  // Method signature includes 'throws' to propagate exception
  public static double calculateInterest(double amount, double rate, int years)  {
      if (amount < 0 || rate < 0) {
          // 'throw' is used to explicitly throw an exception
          throw new IllegalArgumentException("Amount and rate must be positive");
      }
      return (amount * rate * years) / 100;
  }

  public static void main(String[] args) {
      try {
          double interest = calculateInterest(1000, 5, 3);
          System.out.println("Calculated Interest: " + interest);

          // Testing with invalid input
          double invalidInterest = calculateInterest(-500, 5, 3);
          System.out.println("Calculated Interest: " + invalidInterest);
          
      } catch (IllegalArgumentException e) {
          System.out.println("Invalid input: " + e.getMessage());
      }
  }
}
