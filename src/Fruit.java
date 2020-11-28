public class Fruit {

    private String name;
    private double price;
    private int quality;

    public Fruit(String name, double price, int quality){
        this.name = name == null ? " " : name;
        this.price = price == 0.0 ? 0.0: price;
        if(quality<1){
            quality =1;
        }
        if(quality>10){
            quality = 10;
        }
        this.quality = quality;
    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuality(){
        return quality;
    }

    @Override
    public String toString() {
        return "Price: "+ price+"Quality: "+quality+")";
    }

    public boolean equals(Fruit f){
        if (f.equals(name) && f.equals(price) && f.equals(quality)){
            return true;
        }

        return false;
    }

    public int compareTo(Fruit f){
        if (quality > f.getQuality() || f.getName()==null){
            return 1;
        }
        else if(quality < f.getQuality()){
            return -1;
        }
        return 0;
    }


}
