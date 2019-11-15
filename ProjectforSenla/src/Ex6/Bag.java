package Ex6;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private int max_weight = 100;//Max weight in bag
    private int weightNow = 0;
    private List<Thing> things = new ArrayList<Thing>();

    public Bag(int max_weight) {
        this.max_weight = max_weight;


    }

    public  List<Thing> putInBag(List<Thing> newthings) {
        Thing thing_now;
        for (int i = 0; i < newthings.size(); i++) {
            thing_now = newthings.get(i);
            if ((thing_now.getWeight() + weightNow) < max_weight) {
                weightNow += thing_now.getWeight();
                things.add(thing_now);
            }
        }
        return things;
    }
    public  void printOurBag() {
        System.out.println("----------------Вещи которые в рюкзаке-----------------------");
        for (int i = 0; i <things.size(); i++) {
            System.out.println(things.get(i));
        }
        System.out.println("Вес вещей которые находятся в рюкзаке " + weightNow);
        System.out.println("-------------------------------------------------------------");
    }
}
