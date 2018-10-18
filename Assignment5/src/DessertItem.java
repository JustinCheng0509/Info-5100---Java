public abstract class DessertItem {
    protected String name;
    protected int cost;
    public DessertItem(){

    }
    public DessertItem(String name, int cost) {
        if (name.length()<= DessertShoppe.maxNameSize) {
            this.name = name;
        }else
            this.name = name.substring(0,DessertShoppe.maxNameSize);
        this.cost = cost;
    }

    public final String getName(){
        return name;
    }

    public abstract int getCost();

}
