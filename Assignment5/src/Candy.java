public class Candy extends DessertItem {
    private double weight;
    private int price;
    public Candy(String name, double weight, int price){

        super(name);
        this.weight = weight;
        this.price = price;
        this.cost = (int)Math.round(weight*price);
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(weight + " lbs. @ " + DessertShoppe.cents2dollarsAndCents(price) + " /lb."
                + "\n" + getName());
        String price = DessertShoppe.cents2dollarsAndCents(getCost());
        for (int i = 0; i < DessertShoppe.maxDisWidth-getName().length()-price.length(); i++)
            sb.append(" ");
        return sb.toString() + price;
    }
}
