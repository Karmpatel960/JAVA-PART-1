/*Prepared By PATEL KARM HITESHKUMAR(21CE095)*/
package Practical4;

public class CheckingAccount
            extends Account {
        // Data fields
        private double overdraftLimit;

        public CheckingAccount() {
            super();
            overdraftLimit = -20;
        }

        public CheckingAccount(int id, double balance, double overdraftLimit) {
            super(id, balance);
            this.overdraftLimit = overdraftLimit;
        }


        public void setOverdraftLimit(double overdraftLimit) {
            this.overdraftLimit = overdraftLimit;
        }

        public double getOverdraftLimit() {
            return overdraftLimit;
        }

        public void withdraw(double amount) {
            if (getBalance() - amount > overdraftLimit) {
                setBalance(getBalance() - amount);
            }
            else
                System.out.println("Error! Amount exceeds overdraft limit.");
        }

        public String toString() {
            return super.toString() + "\nOverdraft limit: " +
                    String.format("%.2f", overdraftLimit);
        }

    }
