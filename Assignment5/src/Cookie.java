public class Cookie extends DessertItem{
    private int count;
    private int price;

    public Cookie(String name, int count, int price){
        super(name);
        this.name = name;
        this.cost = /*(int)(Math.round*/(price*count/12);
        this.count = count;
        this.price = price;
    }

    @Override
    public int getCost(){
        return cost;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder(count + " @ " + DessertShoppe.cents2dollarsAndCents(price) + " /dz."
                + "\n" + getName());
        String price = DessertShoppe.cents2dollarsAndCents(getCost());
        for (int i = 0; i < DessertShoppe.maxDisWidth-getName().length()-price.length(); i++)
            sb.append(" ");
        return sb.toString() + price;
    }
}
