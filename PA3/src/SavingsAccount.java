public class SavingsAccount {
    private double savingsBalance=0;
    private double annualInterestRate=0;

    public SavingsAccount(){
        savingsBalance = 0;
        annualInterestRate = 0;
    }

    public SavingsAccount(double savingsBalance){
        this.savingsBalance = savingsBalance;
        annualInterestRate = 0;
    }

    public SavingsAccount(double savingsBalance, double annualInterestRate ){
        this.savingsBalance = savingsBalance;
        this.annualInterestRate = annualInterestRate;
    }

    public void calculateMonthlyInterest(){
        double monthlyInterest = savingsBalance * annualInterestRate / 12;
        this.savingsBalance += monthlyInterest;
    }

    public void modifyInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public void printBalance(){
        System.out.printf("Current Balace : $%.2f\n", savingsBalance);
    }

    public static void main(String[] args){
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        saver1.modifyInterestRate(0.04);
        saver2.modifyInterestRate(0.04);

        for (int i=0; i<12; ++i){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }

        saver1.printBalance();
        saver2.printBalance();

        saver1.modifyInterestRate(0.05);
        saver2.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("");

        saver1.printBalance();
        saver2.printBalance();


    }
}
