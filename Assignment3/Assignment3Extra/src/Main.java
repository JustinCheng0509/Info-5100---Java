public class Main {
/*
Encapsulation
Abstraction
Reuse
    - Inheritance
Polymorphism
    - Static polymorphism
    -Dynamic polymorphism
 */

    public String reverse(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String part : input.split("\\s+")) {
            if (!part.isEmpty()) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.insert(0," ");
                }
                stringBuilder.insert(0, part);
            }
        }
        return stringBuilder.toString();
    }


        public static void main(String[] args){
        String str = " I am the  Rock";
        String out = new Main().reverse(str);
        System.out.println(out);
    }
}
