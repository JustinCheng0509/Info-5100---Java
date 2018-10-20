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
        String price = DessertShoppe.cents2dollarsAndCents(getCost());
        for (int i = 0; i < DessertShoppe.maxDisWidth-getName().length()-price.length(); i++)
            sb.append(" ");
        return sb.toString() + price;
    }
}
