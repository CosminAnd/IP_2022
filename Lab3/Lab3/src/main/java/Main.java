public class Main {
    public static void main(String args[]) {
        Customer customer=new Customer("student@info.uaic.ro", "Student");
        Basket basket1=new Basket(123);
        Product product1=new Product("Telefon","11111","iPhone14","Phone",1400);
        Product product2=new Product("Cauciucuri","12453","Cauciucuri de vara","Car",500);
        Product product3=new Product("Mancare catei","433242","Bosch","Hrana animale",200);
        Basket basket2=new Basket(225);
        Product product4=new Product("Telefon","111112","Samsung S25","Phone",1350);
        basket1.addProduct(product1);
        basket1.addProduct(product2);
        basket1.addProduct(product3);
        basket2.addProduct(product4);
        customer.addBasket(basket1);
        customer.addBasket(basket2);
        customer.print();
        customer.compareProducts(product1,product4);
        customer.compareProducts(product1,product2);
        customer.deleteBasket(basket2);
        customer.print();
        basket1.deleteProduct(product3);
        customer.print();

    }
}
