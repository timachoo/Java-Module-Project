import java.util.ArrayList;

public class Bill {
    private ArrayList<Product> products = new ArrayList<>();
    private double totalSum = 0;

    public void addProduct(){

        String productName = Product.initName();
        double productPrice = Product.initPrice();

        Product product = new Product(productName, productPrice);

        this.products.add(product);
        this.totalSum = this.totalSum + productPrice;

        System.out.printf("В счет добавили позицию \"%s\" по стоимости %s\n", product.getName(), Money.getRurPrice(product.getPrice()));
    }

    public void printBill(){
        System.out.println("Добавленные товары:");

        for(Product product : products){
            System.out.printf("\"%s\", стоимость %s\n", product.getName(), Money.getRurPrice(product.getPrice()));
        }

    }

    public void printSplitSum(int persons){
        double splitSum = this.totalSum/persons;

        System.out.printf("Каждый человек должен заплатить %s.", Money.getRurPrice(splitSum));
    }
}
