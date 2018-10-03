public abstract class Moody {
    protected abstract String getMood();
    protected abstract void expressFeelings();

    public void queryMood(Moody mood){
        System.out.println("How are you feeling today?");
        System.out.println(getMood());
    }

}

