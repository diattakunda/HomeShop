import Miam.Four;
import homeshop.Customer;
import homeshop.Fridge;
import homeshop.Television;

public class Main {
    public static void main(String... args){
        Product cafe = new Product( name: "Philips HD7866/61", description: "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", price: 79.99);
        Television tv = new Television( name: "TV Samsung UE49MU6292",  description: "Smart TV LED incurvée 49\"", price: 599, size: 49, slabType: "LED");
        Fridge fridge = new Fridge( name: "BEKO TSE 1042 F", description: "Réfrigérateur BEKO 130L - Classe A+ - blanc", price: 189, liter: 130, freezer: false);

        Customer customer = new Customer( fullname: "Juste Leblanc", address: "19 rue Germain Pilon, Paris");

        Bill bill = new Bill(customer);

        bill.addProduct(cafe, quantity: 1);
        bill.addProduct(tv, quantity: 1);
        bill.addProduct(fridge, quantity: 1);
    }

}
