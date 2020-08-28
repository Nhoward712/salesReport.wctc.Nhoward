package salesReport;

public class Customers {
    //name, country, amount, tax, shipping

    private String name;
    private String country;
    private double amount;
    private double tax;
    private double shipping;

    public Customers(String name, String country, double amount, double tax) {
        this.name = name;
        this.country = country;
        this.amount = amount;
        this.tax = tax;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setShipping(double shipping) {
        this.shipping = shipping;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public double getAmount() {
        return amount;
    }

    public double getTax() {
        return tax;
    }

    public double getShipping() {
        return shipping;
    }
}
