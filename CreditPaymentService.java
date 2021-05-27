public class CreditPaymentService {
    public int calculatePayment (int loanSum, double interestMonth, double degree) {


        int MonthPaymentOneYear;

        MonthPaymentOneYear= (int) ((loanSum * (interestMonth * (degree)) / (degree) - 1));
        System.out.println(MonthPaymentOneYear);
        return MonthPaymentOneYear;
    }

}
