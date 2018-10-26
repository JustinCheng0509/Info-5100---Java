public class Pet {
    public static final int MALE = 0;
    public static final int FEMALE = 1;
    public static final int SPAYED = 2;
    public static final int NEUTERED = 3;
    private String petName;
    private String ownerName;
    private String color;
    private int sex;
    public Pet(String petName, String ownerName, String color){
        this.petName = petName;
        this.ownerName =ownerName;
        this.color = color;
    }

    public void setSex(int sexID){
        this.sex = sexID;
    }

    public String getSex(){
        switch(sex){
            case MALE: return "male";
            case FEMALE: return "female";
            case SPAYED: return "spayed";
            case NEUTERED: return "neutered";
            default: return "unknown";
        }
    }

    public String getPetName(){
        return petName;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public String getColor(){
        return color;
    }

    public String toString(){
        return getPetName() + " owned by " + getOwnerName() +"\n"
                + "Color: "+getColor()+"\n"+"Sex: "+getSex();
    }

    public static void main (String[] args){
        Pet spot = new Pet("Spot","Mary","Black and White");
        spot.setSex(0);
        System.out.println(spot+"\n");

        Dog sprinkles = new Dog("sprinkles", "barney", "Gray", "small");
        sprinkles.setBoardStart(9,20,2018);
        sprinkles.setBoardEnd(11,21,2018);
        System.out.println(sprinkles);
        System.out.println(sprinkles.boarding(8,21,2018) + "\n");

        Cat  mrcat= new Cat("Mr.Cat", "Holly", "orange", "short");
        mrcat.setBoardStart(9,20,2018);
        mrcat.setBoardEnd(11,21,2018);
        System.out.println(mrcat);
        System.out.println(mrcat.boarding(11,21,2018));
    }
}
