public class Sundae extends IceCream{
    private String topping;
    private int topCost;

    public Sundae(String name, int cost, String topping, int topCost){
        this.name = topping +" Sundae with "+name;
        this.cost = cost + topCost;
    }

    public int getCost(){
        return cost;
    }

}
