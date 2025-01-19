package shopping.ui;

public class Item {

    private String id, name;

    private int price, amount;

    public Item(String id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = 0;
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    public int getAmount(){
        return this.amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int totalPrice(){
        return this.price*this.amount;
    }
}
