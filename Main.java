public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int MonthPaymentOneYear = service.calculatePayment(12, 1000000, 0.008325,1.1046035141003447);
        System.out.println(MonthPaymentOneYear);


        int MonthPaymentTwoYear = service.calculatePayment(24, 1000000, 0.0041625,7.31984553109);
        System.out.println(MonthPaymentTwoYear);


        int MonthPaymentThreeYear = service.calculatePayment(36, 1000000, 0.002775,9.06708210720 );
        System.out.println(MonthPaymentThreeYear); 


    }
}