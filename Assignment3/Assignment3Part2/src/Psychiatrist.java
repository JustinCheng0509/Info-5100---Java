public class Psychiatrist {

    public void examine(Moody mood){
        mood.queryMood(mood);
    }

    public void observe(Moody mood){
        mood.expressFeelings();
        System.out.println("Observation: "+ mood);
    }


}
