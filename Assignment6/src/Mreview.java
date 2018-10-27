import java.util.ArrayList;
public class Mreview implements Comparable<Mreview>{
    private String title;
    private ArrayList<Integer>ratings;
    public Mreview(){
        this.title = "";
        this.ratings = new ArrayList<>();
    }

    public Mreview(String Mtitle){
        this.title = Mtitle;
        this.ratings = new ArrayList<>();
    }

    public Mreview(String Mtitle, int rating){
        this.title = Mtitle;
        this.ratings.add(rating);
    }
    public String getTitle(){
        return title;
    }
    public void addRating(int rate){
        this.ratings.add(rate);
    }
    public double aveRateing(){
        double total = 0;
        for (int r:ratings){
            total+=r;
        }
        double average = total/ratings.size();
        //return average;
        return Double.parseDouble(String.format("%.2f",(average)));
    }
    public int numRatings() {
        return ratings.size();
    }

    public boolean equals(Object obj){
        if (obj == this) {
            return true;
        }else if (!(obj instanceof Mreview)) {
            return false;
        }
        return title.equals(((Mreview) obj).title);
    }
    public String toString(){
        return getTitle() + " ,average "+ aveRateing()+" out of "+ numRatings() + " ratings.";
    }

    @Override
    public int compareTo(Mreview o) {
        return title.compareTo(o.title);
    }
    public static void main(String[] args) {
        Mreview mreview = new Mreview("Kill Bill");
        mreview.addRating(3);
        mreview.addRating(4);
        mreview.addRating(3);
        System.out.println(mreview);
    }
}
