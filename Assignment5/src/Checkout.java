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
        for (int i = 0; i < (DessertShoppe.maxDisWidth-DessertShoppe.shopname.length())/2; i++){
            sb.append(" ");
        }
        sb.append(DessertShoppe.shopname+"\n");
        for (int i = 0; i < (DessertShoppe.maxDisWidth-DessertShoppe.shopname.length())/2; i++){
            sb.append(" ");
        }
        for (int i = 0; i < DessertShoppe.shopname.length(); i++){
            sb.append("-");
        }
        sb.append("\n");
        for (DessertItem item: list) {
            sb.append(item).append("\n");
        }
        return sb.toString();
    }
}

