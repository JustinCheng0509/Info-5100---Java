public class IceCream extends DessertItem {
    public IceCream() {
        super();
    }
    public IceCream(String name,int cost){
        this.name = name;
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(getName());
        String price = String.valueOf(getCost()/100);
        for (int i = 0; i < DessertShoppe.maxDisWidth-getName().length()-price.length(); i++){
            sb.append(" ");
        }
        sb.append(price);
        return sb.toString();
    }
}
