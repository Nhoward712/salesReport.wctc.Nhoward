package salesReport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import salesReport.iface.SalesInput;
import salesReport.iface.SalesReport;
import salesReport.iface.ShippingPolicy;
import salesReport.impl.*;

@Configuration
@ComponentScan("salesReport")

public class AppConfig {
    @Bean
    public SalesInput salesInput(){
        return new FileInput();
    }
    @Bean
    public SalesReport report(){return new SummarySalesReport();}
    @Bean
    public ShippingPolicy policy(){
        return new TenPercentShipping();
    }



}
