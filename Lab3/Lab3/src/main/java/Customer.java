import java.util.ArrayList;

public class Customer {
    private String email;
    private String name;
    private ArrayList<Basket> baskets=new ArrayList<>();
    public Customer() {

    }
    public Customer(String email,String name){
        this.email=email;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setBaskets(ArrayList<Basket> baskets) {
        this.baskets = baskets;
    }

    public ArrayList<Basket> getBaskets() {
        return baskets;
    }
    public void addBasket(Basket basket){
        baskets.add(basket);
    }
    public void deleteBasket(Basket basket){
        baskets.remove(basket);
    }

    public void compareProducts(Product product1, Product product2){
        if(product1.getType() == product2.getType()) {
            if (product1.equals(product2))
                System.out.println("Those products have same price");
            else if (product1.getPrice() > product2.getPrice())
                System.out.println(product1.getDescription() + " has bigger price");
            else
                System.out.println(product2.getDescription() + " has bigger price");
        }
        else
            System.out.println("Products must have the same type");
    }
    public void print(){
        for(int i=0;i<baskets.size();i++)
            System.out.println(baskets.get(i));
    }
}
