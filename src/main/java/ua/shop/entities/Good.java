package ua.shop.entities;


public class Good {
    private String name;
    private int prize;

    public Good() {
    }

    public Good(String name, int prize) {
        this.name = name;
        this.prize = prize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }
}
