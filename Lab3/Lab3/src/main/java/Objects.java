import java.util.ArrayList;

public class Objects {
    private ArrayList<Product> listOfProducts;
    public Objects(){
        this.listOfProducts=null;
    }

    public void addProduct(Product product){
        listOfProducts.add(product);
    }
    public void deleteProduct(Product product){
        listOfProducts.remove(product);
    }
    public Product findProduct(Product product){
        return listOfProducts.get(listOfProducts.indexOf(product));
    }

}
