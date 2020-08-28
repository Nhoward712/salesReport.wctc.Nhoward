package salesReport.iface;
import org.springframework.stereotype.Component;
import salesReport.Customers;
import java.util.ArrayList;


public interface SalesReport {
    void generateReport(ArrayList<Customers> salesList);
}
