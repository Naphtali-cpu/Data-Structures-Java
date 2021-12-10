import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GroceryList {
    public static void main(String[] args) {
        ArrayList groceries = new ArrayList(Arrays.asList("Milk", "Coffee", "Bread"));
        ArrayList groceries2 = new ArrayList(Arrays.asList("Flour", "Sugar", "Sauce"));

        groceries.add("Sweet Potatoe");
        groceries.addAll(groceries2);
        System.out.println(groceries);
        groceries.remove("Milk");
        System.out.println(groceries);
    }
}
