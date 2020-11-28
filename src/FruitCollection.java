public class FruitCollection {

    private Fruit[] fruits;
    private int count;

    public FruitCollection(int size){
        fruits = new Fruit[size];
    }

    public int getCount() {
        return count;
    }

    public boolean isFull(){
        return count == fruits.length;
    }

    public boolean addFruit(String name, double price, int quality){
        for (int i =0; count<fruits.length;i++){
            if(fruits[i] == null){
                fruits[i] = new Fruit(name,price,quality);
                count++;
                return true;
            }
        }return false;
    }

    public Fruit getFruitAt(int slot){
        if (slot >= 0 && slot <= fruits.length) {
            return fruits[slot];

            }
            return null;
        }


    public boolean expand(int size){
        if(isFull()) {
            Fruit[] ff = new Fruit[fruits.length + 1];
            for (int i = 0; i < fruits.length; i++) {
                ff[i] = fruits[i];
            }
            fruits = ff;
            return true;
        }return false;

        }

    public int searchForFruit(String name){
        for (int i=0; count < fruits.length; i++){
            if (fruits[i].equals(name)){
                return i;
            }break;
        }return -1;
    }

}
