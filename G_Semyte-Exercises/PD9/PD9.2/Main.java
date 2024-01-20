package PD9;

import PD9.controlles.ShoppingCart;
import PD9.product_groups.Alcohol;
import PD9.product_groups.Food;
import PD9.product_groups.Medicine;

public class Main {
    public static void main(String[] args) {
        Food bread = new Food("Vilniaus duona", 1, 20);
        Medicine panadol = new Medicine("Panadol", 2.50, 10);
        Alcohol likeris = new Alcohol("Bosca", 15.0, 0);

        ShoppingCart myShoppingCart = new ShoppingCart();
        myShoppingCart.addItem(bread);
        myShoppingCart.addItem(panadol);
        myShoppingCart.addItem(likeris);

        System.out.println(myShoppingCart.getTotalPrice() + " Eur");
        System.out.println(myShoppingCart.getTotalPriceWithVat() + " Eur + Vat");
        System.out.println(myShoppingCart.getPriceInUSD(1.0877) + " USD");
    }
}
