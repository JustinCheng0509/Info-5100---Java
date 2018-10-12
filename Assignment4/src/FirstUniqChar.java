public class FirstUniqChar {
    public int firstUniqChar(String s){
        if(s == null|| s.length() == 0){
            return -1;
        }
        char Str[] = s.toCharArray();
        for(int i = 0; i < Str.length;i++){
            if(s.indexOf(Str[i])==s.lastIndexOf(Str[i])){
                return i;
            }
        }
        return -1;
    }

    public static void main (String args[]) {
        FirstUniqChar F1 = new FirstUniqChar();
        String test = "loveleetcode";
        int number = F1.firstUniqChar(test);
        System.out.println(number);
        test = "leetcode";
        number = F1.firstUniqChar(test);
        System.out.println(number);

    }
}
