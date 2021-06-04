public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int MonthPaymentOneYear = (int) service.calculatePayment( 1000000, 0.008325,12);
        System.out.println(MonthPaymentOneYear);


       int  MonthPaymentTwoYear = (int) service.calculatePayment(1000000, 0.008325, 24);
        System.out.println(MonthPaymentTwoYear);


        int MonthPaymentThreeYear = (int) service.calculatePayment(1000000, 0.008325, 36);
        System.out.println(MonthPaymentThreeYear);


    }
}