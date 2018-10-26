import java.util.*;

public class Dog extends Pet implements Boardable {
    private String size;
    private Calendar start = Calendar.getInstance();
    private Calendar end = Calendar.getInstance();
    public Dog(String petName, String ownerName, String color, String size) {
        super(petName, ownerName, color);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String toString() {
        String body = super.toString();
        return "DOG:\n" + body + "\nSize: " + getSize();
    }

    @Override
    public void setBoardStart(int month, int day, int year) {
        start.set(year, month, day);
    }

    @Override
    public void setBoardEnd(int month, int day, int year) {
        end.set(year, month, day);
    }

    @Override
    public boolean boarding(int month, int day, int year) {
        Calendar dogcal = Calendar.getInstance();
        dogcal.set(year, month, day);
        return start.before(dogcal) && end.after(dogcal) || dogcal.equals(start) || dogcal.equals(end);
    }

}