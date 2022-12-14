public class Salad {
    private String name;
    private int price;
    private int volume;

    public Salad(String name, int price, int volume) {
        this.name = name;
        this.price = price;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Food{" + name + '\'' +
                ", price=" + price  +" coм "+
                ", volume=" + volume + " грамм "+
                '}';
    }
}
