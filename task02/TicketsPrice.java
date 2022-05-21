package task02;

public class TicketsPrice {
    private String name;
    private int price;
    private String day;

    public TicketsPrice(String name, int price, String day) {
        this.name = name;
        this.price = price;
        this.day = day;
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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }


    public void introduce() {
        System.out.println("券種は、" + this.name + " " + "¥" + this.price + "です。");
    }
}
