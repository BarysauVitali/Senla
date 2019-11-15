package Ex6;

import java.util.ArrayList;
import java.util.List;
public class Solution6 {

    public static void main(String[] args) {
        List<Thing> things = createBagList();
        printAllThing(things);
        Bag bag = new Bag(100);
        bag.putInBag(sortThings(things));
        bag.printOurBag();
    }


    public static  List<Thing> createBagList() {
        List <Thing> list = new ArrayList<>();
        Thing thing1 = new Thing("thing1",12,4);
        Thing thing2 = new Thing("thing2",65,12);
        Thing thing3 = new Thing("thing3",5,35);
        Thing thing4 = new Thing("thing4",53,71);
        Thing thing5 = new Thing("thing5",2,21);
        Thing thing6 = new Thing("thing6",34,62);
        list.add(thing1);
        list.add(thing2);
        list.add(thing3);
        list.add(thing4);
        list.add(thing5);
        list.add(thing6);
        return list;
    }
    public static void printAllThing(List<Thing> things) {
        System.out.println("----------------Вещи которые есть в наличии------------------");
        for (int i = 0; i <things.size(); i++) {
            System.out.println(things.get(i));
        }
        System.out.println("-------------------------------------------------------------");
    }

    public static List<Thing> sortThings(List<Thing> things_a) {
        Thing temp;
        for (int j = 1; j < things_a.size(); j++) {
            for (int i = 1; i < things_a.size(); i++) {
                if (things_a.get(i - 1).getCost() < things_a.get(i).getCost()) {
                    temp = things_a.get(i);
                    things_a.set(i, things_a.get(i - 1));
                    things_a.set(i - 1, temp);
                }
            }
        }
        return things_a;
    }

}