package org.example.homework_nr_6;

public class Invoice {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Xiaomi", "P50", 3, 2000.99);
        double amount = invoice.getAmount();
        System.out.println(amount);
    }
    String name;
    String model;
    int quantity;
    double price;

    public Invoice(String name, String model, int quantity, double price) {
        this.name = name;
        this.model = model;
        this.quantity = quantity;
        this.price = price;
    }
    //вычисление и возврат суммы

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getQuantity() {
        return quantity ;
    }

    public void setQuantity(int quantity) {
        //this.quantity = (quantity > 0) ? quantity : 0;
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
       // this.price = (price > 0.0) ? price : 0.0;
        if (price >= 0) {
            this.price = price;
        } else {
            this.price = 0.0;
        }
    }
    public double getAmount() {
        return quantity * price;

    }



}
