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
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < (DessertShoppe.maxDisWidth- DessertShoppe.shopname.length())/2; i++)
            sb.append(" ");
        sb.append(DessertShoppe.shopname).append("\n");
        for (int i = 0; i < (DessertShoppe.maxDisWidth - DessertShoppe.shopname.length())/2; i++)
            sb.append(" ");
        for (int i = 0; i < DessertShoppe.shopname.length(); i++)
            sb.append("-");
        sb.append("\n");
        for (DessertItem item: list) {
            //if (item.name.length()<=DessertShoppe.maxNameSize) {
                sb.append(item).append("\n");
            //}
            /*else{

                sb.append(item.name.substring(0,DessertShoppe.maxNameSize)).append("\n");
                String price = DessertShoppe.cents2dollarsAndCents(item.cost);
                StringBuilder spaces = new StringBuilder();
                for (int i = 0; i < DessertShoppe.maxDisWidth-item.name.length()-price.length(); i++)
                    spaces.append("  ");
                sb.append(item.name.substring(DessertShoppe.maxNameSize)).append(spaces).append(DessertShoppe.cents2dollarsAndCents(item.cost)).append("\n");
            }*/
        }
        sb.append("\n");
        sb.append("Tax");
        String tax = DessertShoppe.cents2dollarsAndCents(totalTax());
        String total = DessertShoppe.cents2dollarsAndCents(totalCost()+totalTax());
        for (int i = 0; i < DessertShoppe.maxDisWidth - tax.length() - 3; i++)
            sb.append(" ");
        sb.append(tax).append("\n").append("Total Cost");
        for (int i = 0; i < DessertShoppe.maxDisWidth - total.length() - 10; i++)
            sb.append(" ");
        sb.append(total);
        sb.append("\n\n");
        return sb.toString();
    }
}

