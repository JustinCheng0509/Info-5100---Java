public class longestPalindrome {
    public String longestPalindrome(String s) {
        String maxStr = "";
        int len = s.length();

        for(int i=0; i<len; ++i) {
            String subStr1 = isPalindrome(s, i, i);

            if (subStr1.length() > maxStr.length()) {
                maxStr = subStr1;
            }
            String subStr2 = isPalindrome(s, i, i+1);

            if (subStr2.length() > maxStr.length()) {
                maxStr = subStr2;
            }
        }

        return maxStr;
    }

    private String isPalindrome(String s, int i, int j) {
        int len = s.length();
        while (i >= 0 && j < len && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }

        return  s.substring(i+1, j);
    }

    public static void main (String args[]) {
        longestPalindrome l1 = new longestPalindrome();
        String test = "ac";
        System.out.println(l1.longestPalindrome(test));


    }

}
