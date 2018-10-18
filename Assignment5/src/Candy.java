public class Candy extends DessertItem {
    private double weight;
    private int price;
    public Candy(){
        super();
    }
    public Candy(String name, double weight, int price){
        this.name = name;
        //this.weight = weight;
        this.cost = (int)Math.round(weight*price);
    }

    @Override
    public int getCost(){
        return cost;
    }
}
