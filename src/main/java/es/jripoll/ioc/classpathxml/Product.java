package es.jripoll.ioc.classpathxml;

public class Product {

    private String sku;
    private String name;
    private int stock;

    // Constructor, getters, setters, toString

    public Product() { }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "sku='" + sku + '\'' +
                ", name='" + name + '\'' +
                ", stock=" + stock +
                '}';
    }
}
