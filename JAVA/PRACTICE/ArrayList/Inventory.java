import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Inventory {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> in_stock = new ArrayList<ArrayList<Integer>>();
        in_stock.add(new ArrayList<Integer>(Arrays.asList(5, 12, 3)));
        in_stock.add(new ArrayList<Integer>(Arrays.asList(8, 2, 15)));
        in_stock.add(new ArrayList<Integer>(Arrays.asList(1, 20, 4)));
    
    LinkedList<Integer>criticalstock=new LinkedList<Integer>();
    for(ArrayList<Integer>i:in_stock){
        for(Integer j:i){
            if(j<5){
                criticalstock.add(j * 2);
            }
        }
    }

    for (ArrayList<Integer> product : in_stock) {
    System.out.println(product);
}
    System.out.println(criticalstock);
}
}