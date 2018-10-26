
import java.util.*;
public class Cat extends Pet implements Boardable {
    private String hairLength;
    private Calendar start = Calendar.getInstance();
    private Calendar end = Calendar.getInstance();
    public Cat(String petName, String ownerName, String color, String hairLength) {
        super(petName, ownerName, color);
        this.hairLength = hairLength;
    }

    public String getHairLength() {
        return hairLength;
    }

    public String toString() {
        String body = super.toString();
        return "CAT:\n" + body + "\nHair: " + getHairLength();
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
        Calendar catcal = Calendar.getInstance();
        catcal.set(year, month, day);
        return catcal.after(start) && catcal.before(end) || catcal.equals(start) || catcal.equals(end);
    }
}