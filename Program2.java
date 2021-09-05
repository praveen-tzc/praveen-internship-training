import java.util.LinkedList;
import java.util.List;

public class Program2 {

    public static void main(String[] args) {
        // Convert all below for looping logics to streams
        // NOTE: do not modify the check method call

        // 1 (Hint: use filter)
        List<Fruit> allFruits1 = testData1();
        List<Fruit> mangos = new LinkedList<>();
        for (Fruit fruit : allFruits1) {
            if ("Mango".equals(fruit.getName()))
                mangos.add(fruit);
        }
        check("1",mangos.size() == 5);

        // 2 (Hint: use mapping and aggregation)
        List<Fruit> allFruits2 = testData2();
        int sum1 = 0;
        for (Fruit fruit : allFruits2)
            sum1 += fruit.getPrice();

        check("2",sum1 == 62);

        // 3 (Hint: You have to convert the list of list to list first)
        List<List<Fruit>> allFruits3 = testData3();
        int sum2 = 0;
        for (List<Fruit> fruits : allFruits3)
            for (Fruit fruit : fruits)
                sum2 += fruit.getPrice();

        check("3",sum2 == 124);

        // 4 (Hint: you are converting from one object to other object. Ask me if u need more hint :) )
        List<Fruit> allFruits4 = testData2();
        List<Box> boxes = new LinkedList<>();

        for(Fruit fruit:allFruits4)
            boxes.add(new Box(fruit));

        check("4",boxes.size() == 7);

        // 5
        List<Fruit> allFruits5 = testData2();
        boolean isPlumsAvailable = false;

        for(Fruit fruit:allFruits5)
            if("Plums".equals(fruit.getName())){
                isPlumsAvailable=true;
                break;
            }
        check("5",isPlumsAvailable);

        System.out.println("======> All test cases executed!! <======");
    }


    // ---- do not modify ----
    private static List<Fruit> testData1() {
        List<Fruit> fruits = new LinkedList<>();

        fruits.add(new Fruit("Mango"));
        fruits.add(new Fruit("Mango"));
        fruits.add(new Fruit("Mango"));
        fruits.add(new Fruit("Mango"));
        fruits.add(new Fruit("Plums"));
        fruits.add(new Fruit("Mango"));
        fruits.add(new Fruit("Orange"));
        return fruits;
    }

    private static List<Fruit> testData2() {
        List<Fruit> fruits = new LinkedList<>();

        fruits.add(new Fruit("Mango", 5));
        fruits.add(new Fruit("Liche", 10));
        fruits.add(new Fruit("Mango", 5));
        fruits.add(new Fruit("Apple", 20));
        fruits.add(new Fruit("Plums", 10));
        fruits.add(new Fruit("Mango", 5));
        fruits.add(new Fruit("Orange", 7));
        return fruits;
    }

    private static List<List<Fruit>> testData3() {
        List<List<Fruit>> fruits = new LinkedList<>();
        fruits.add(testData2());
        fruits.add(testData2());
        return fruits;
    }

    private static void check(String testNumber, Boolean condition){
        System.out.println("Test ("+testNumber+") - "+(condition? "OK": "Not OK"));
    }

}

class Fruit {
    private String name;
    private int price;

    public Fruit(String name) {
        this.name = name;
    }

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

class Box {
    Fruit fruit;

    public Box(Fruit fruit) {
        this.fruit = fruit;
    }

    public Fruit getFruit() {
        return fruit;
    }
}
