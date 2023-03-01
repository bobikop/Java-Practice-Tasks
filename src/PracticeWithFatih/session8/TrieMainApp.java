package PracticeWithFatih.session8;

public class TrieMainApp {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("i");
        trie.insert("like");
        trie.insert("sam");
        trie.insert("sung");
        trie.insert("samsung");
        //System.out.println(trie.search("ilike"));
        String str="ilike";
        String word="";
        char[] arr=str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            word+=String.valueOf(arr[i]);
            if (trie.search(word)&& i!=arr.length-1) {
                word="";
            }
            else if (trie.search(word)&& i==arr.length-1  ) System.out.println("Yes");
        }


       

    }

}