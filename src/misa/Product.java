package misa;

public class Product {
    public static void main(String[] args) {
        
        Product product1 = new Product(101, "Laptop", 49999.99, 50, 10);
        Product product2 = new Product(102, "Smartphone", 29999.99, 0, 20);
        Product product3 = new Product(103, "Headphones", 1999.99, 150, 80);

        
        System.out.printf("%-10s %-15s %-10s %-10s %-10s %-10s %-10s %-15s\n", 
                "ID", "Name", "Price", "Stocks", "Sold", "Profit", "Est. Profit", "Status");
        System.out.println("-----------------------------------------------------------------------------------------");
        product1.viewProduct();
        product2.viewProduct();
        product3.viewProduct();
    }

    public Product(int i, String laptop, double d, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void viewProduct() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

