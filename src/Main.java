public class Main
{
    public static void main(String[] args)
    {
        double ccBalance = 5000.00;
        double INTEREST_RATE = 0.17;
        double interestDue;

        System.out.println("Credit Card Balance$" + String.format("%,.2f", ccBalance));
        System.out.println("CC Interest Rate " + (INTEREST_RATE * 100) + "%");

        interestDue = ccBalance * (INTEREST_RATE/12);
        ccBalance = ccBalance + (ccBalance * INTEREST_RATE/12);

        // After 1 Month
        System.out.println("Interest due after 1 month is $" + String.format("%,.2f", interestDue));
        System.out.println("New Balance is $" + String.format("%,.2f",  ccBalance));

        interestDue = ccBalance * (INTEREST_RATE/12);
        ccBalance = ccBalance + (ccBalance * (INTEREST_RATE/12));

        // After 2 months
        System.out.println("New Balance after 2 months is $" + String.format("%,.2f", interestDue));
        System.out.println("New Balance Due is $" + String.format("%,.2f", ccBalance));
    }
}
