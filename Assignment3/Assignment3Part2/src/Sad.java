public class Sad extends Moody {

    @Override
    protected String getMood(){
        return "I feel sad today.";
    }

    @Override
    public void expressFeelings(){
        System.out.println("'wah','boo hoo','weep','sob','weep'");
    }

    @Override
    public String toString(){
        return "Subject cries a lot.";
    }
}

