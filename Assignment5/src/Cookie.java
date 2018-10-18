public class Cookie extends DessertItem{
    private int count;
    private int price;
    public Cookie(){
       super();
    }
    public Cookie(String name, int count, int price){
        this.name = name;
        this.cost = /*(int)(Math.round*/(price*count/12);
    }

    @Override
    public int getCost(){
        return cost;
    }
}
