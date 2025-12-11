import java.util.*;
class Loan{
    private double principalAmount;
    private int years;
    private double rateOfInterest;

    public Loan(double principalAmount, int years, double rateOfInterest){
        this.principalAmount=principalAmount;
        this.years=years;
        this.rateOfInterest=rateOfInterest;
    }

    public double getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(double principalAmount) {
        this.principalAmount = principalAmount;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public double calculateInterest(){
        return (principalAmount * years * rateOfInterest)/100;
    }
    public void LoanDetails(){
        System.out.println("Principal Amount           : "+principalAmount);
        System.out.println("Years                      : "+years);
        System.out.println("Rate Of Interest           : "+rateOfInterest);
        System.out.println("Interest                   : "+this.calculateInterest());
    }
}
class PersonalLoan extends Loan{
    private double processingFee;

    public PersonalLoan(double principalAmount, int years, double rateOfInterest, double processingFee){
        super(principalAmount, years, rateOfInterest);
        this.processingFee=processingFee;
    }
    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    @Override
    public double calculateInterest(){
        return super.calculateInterest()+this.processingFee;
    }

    @Override
    public void LoanDetails(){
        System.out.println("----------------------------------------");
        System.out.println("Loan Details:");
        System.out.println("----------------------------------------");
        super.LoanDetails();
        System.out.println("Processing Fee             : "+this.processingFee);
        System.out.println("Total Amount To Pay        : "+(getPrincipalAmount()+this.calculateInterest()));
    }

}
public class LoanProcess {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the principal Amount : ");
        double principalAmount=in.nextDouble();
        System.out.print("Enter the years            : ");
        int years=in.nextInt();
        System.out.print("Enter the RateOfInterest   : ");
        double rateOfInterest=in.nextDouble();
        System.out.print("Enter the Processing Fee   : ");
        double processingFee=in.nextDouble();
        PersonalLoan loan=new PersonalLoan(principalAmount, years, rateOfInterest, processingFee);
        loan.LoanDetails();
    }
}
