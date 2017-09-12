package hello.Models;

import hello.Entity.Product;

public class ProductInfo {
    private String name;
    private String code;
    private double price;

    public ProductInfo() {
    }

    public ProductInfo(Product product){
        this.code = product.getCode();
        this.name = product.getName();
        this.price = product.getPrice();
    }

    public ProductInfo(String name, String code, double price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
