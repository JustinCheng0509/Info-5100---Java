public class Test {
    public static void main(String[] args){
        Psychiatrist psyc1 = new Psychiatrist();
        Moody h1 = new Happy();
        Moody s1 = new Sad();
        psyc1.examine(h1);
        psyc1.observe(h1);
        System.out.println();
        psyc1.examine(s1);
        psyc1.observe(s1);
    }
}
