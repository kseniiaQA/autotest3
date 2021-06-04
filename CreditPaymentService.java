public class CreditPaymentService {
    public double calculatePayment (int loanSum, double interestMonth, int months) {


       double MonthPaymentOneYear;


        MonthPaymentOneYear= (int) loanSum * (interestMonth + (interestMonth /((Math.pow(1+interestMonth, months)) - 1)));
        System.out.println(MonthPaymentOneYear);
        return MonthPaymentOneYear;
    }

}