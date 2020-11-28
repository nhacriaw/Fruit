public class Test {
    public static void main(String[] args) {
        Fruit a = new Fruit("Apple", 150.9, 10);
        Fruit b = new Fruit("Banana", 48.52, 6);
        System.out.println(a);
        System.out.println(a.equals(b));
        System.out.println(a.compareTo(b));
        FruitCollection fc = new FruitCollection(2);
        System.out.println(fc.addFruit("Cherry", 85.179, 8));
        System.out.println(fc.addFruit("Date", 94.62, 9));
        System.out.println(fc.expand(1));
        System.out.println(fc.addFruit("Kiwi", 64.93, 7));
        int s = fc.searchForFruit("Date");
        if (s>=0) {
            System.out.println(fc.getFruitAt(s));
        }
    }
}
