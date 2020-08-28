package salesReport;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import salesReport.impl.FileInput;
import salesReport.iface.SalesInput;

import java.io.FileNotFoundException;

public class MyApp {
    public static void main(String[] args) throws FileNotFoundException {
        //Use different shipping policies to determine the shipping amount for an order.
        //For example: free shipping, flat-rate domestic shipping, free shipping for orders over $X
        //Read sales data from a file or from the console
        //Produce a detailed sales report or a summary report by country

//        public interface SalesInput {
//            List<Sale> getSales();
//        }
//
//        public interface SalesReport {
//            void generateReport(List<Sale> salesList);
//        }
//
//        public interface ShippingPolicy {
//            double getShippingCost(Sale sale);
//        }

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

//        FileInput salesList = (FileInput)context.getBean("fileInput");

        Reports report =(Reports)context.getBean("reports");
        report.runReport();



        context.close();
    }
}
