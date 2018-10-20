import java.util.*;
public class Checkout {
    //ArrayList<DessertItem> list = new ArrayList<DessertItem>();
    List<DessertItem> list;
    public Checkout(){
        this.list = new ArrayList<>();
    }

    public int numberOfItems(){
        int num = list.size();
        return num;
    }

    public void enterItem(DessertItem item){
        list.add(item);
    //additem
    }

    public void clear(){
        list.clear();
    //clear arraylist
    }

    public int totalCost(){
        int sum = 0;
        for (DessertItem item:list){
            sum+=(item.getCost());
            //System.out.println(sum);
        }
        return sum;
    }

    public int totalTax(){
        int tax = Math.round(totalCost()*DessertShoppe.taxRate);
        return tax;
    }
    //@Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < (DessertShoppe.maxDisWidth- DessertShoppe.shopname.length())/2; i++)
            stringBuilder.append(" ");
        stringBuilder.append(DessertShoppe.shopname).append("\n");
        for (int i = 0; i < (DessertShoppe.maxDisWidth - DessertShoppe.shopname.length())/2; i++)
            stringBuilder.append(" ");
        for (int i = 0; i < DessertShoppe.shopname.length(); i++)
            stringBuilder.append("-");
        stringBuilder.append("\n");
        for (DessertItem item: list) {
            stringBuilder.append(item).append("\n");
        }
        stringBuilder.append("\n");
        stringBuilder.append("Tax");
        String tax = DessertShoppe.cents2dollarsAndCents(totalTax());
        String total = DessertShoppe.cents2dollarsAndCents(totalCost()+totalTax());
        for (int i = 0; i < DessertShoppe.maxDisWidth - tax.length() - 3; i++)
            stringBuilder.append(" ");
        stringBuilder.append(tax).append("\n").append("Total Cost");
        for (int i = 0; i < DessertShoppe.maxDisWidth - total.length() - 10; i++)
            stringBuilder.append(" ");
        stringBuilder.append(total);
        stringBuilder.append("\n\n");
        return stringBuilder.toString();
    }
}

