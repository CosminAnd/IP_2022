import java.util.ArrayList;

public class Basket {
    private int id;
    private ArrayList<Product> basket= new ArrayList();

    public Basket(){
    }
    public Basket(int id){
        this.id=id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Product> getBasket() {
        return basket;
    }

    public void setBasket(ArrayList<Product> basket) {
        this.basket = basket;
    }
    public void addProduct(Product product){
        basket.add(product);
    }
    public void deleteProduct(Product product){
        basket.remove(product);
    }
    public void clearBasket(){
        for(int i=0;i<basket.size();++i)
            basket.remove(basket.get(i));
    }

    @Override
    public String toString() {
        return "Basket{" +
                "id=" + id +
                ", basket=" + basket +
                '}';
    }
}
