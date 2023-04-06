package Arrays;

public class LongestPalindrome {
    public static void main(String[] args) {

        String word = "babad";
        System.out.println(longestPalindrome(word));


    }

    //Approach : treat each character as mid of the palindromic string and check if its left and right character are same or not
    // if they are same then decrement left and increment right and after checking it for each charater determine maximum length which is maximum length of palindromic string
    // To get palindromic substring return substring from start to start + maximum length

    public static String longestPalindrome(String s) {

        int n = s.length();
        if(n <= 1) return s;
        int maxLen = 1;
        int start = 0;
        //for odd length
        for(int i=0;i<n;i++){
            int l = i;
            int r = i;
            while(l >= 0 && r < n && s.charAt(l) == s.charAt(r)){
                l--;
                r++;
            }
            int len = r-l-1;
            if(len > maxLen){
                maxLen = len;
                start = l+1;
            }
        }
        //for Even length
        for(int i=0;i<n;i++){
            int l = i;
            int r = i+1;
            while(l >= 0 && r<n && s.charAt(l) == s.charAt(r)){
                l--;
                r++;
            }
            int len = r-l-1;
            if(len > maxLen){
                maxLen = len;
                start = l+1;
            }
        }
        return s.substring(start,start+maxLen);
    }

}
