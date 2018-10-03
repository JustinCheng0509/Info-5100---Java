public class Happy extends Moody{

    @Override
    protected String getMood(){
        return "I feel happy today.";
    }

    @Override
    public void expressFeelings(){
        System.out.println("hehehe......hahahahah...HAHAHAHA!!!!");
    }

    @Override
    public String toString() {
        return "Subject laughs a lot.";
    }
}
