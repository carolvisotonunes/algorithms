import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String word1 = "dormitory";
        String word2 = "dirty room";
        boolean wordsAreAnagram = isAnagram(word1,word2);
        if (wordsAreAnagram){
            System.out.println("The words "+ word1 +" and " + word2 +" are anagrams");
        } else{
            System.out.println("The words " +word1 +" and "+ word2+ " are not anagrams");
        }


    }


    public static boolean isAnagram(String word1, String word2) {

        char[] charWord1 = word1.replaceAll("\\s","").toLowerCase().toCharArray();
        char[] charWord2 = word2.replaceAll("\\s","").toLowerCase().toCharArray();

        Arrays.sort(charWord1);
        Arrays.sort(charWord2);

        if (charWord1.length != charWord2.length) {
            return false;
        }

        for (int i = 0; i < charWord1.length; i++) {
            if (charWord1[i] != charWord2[i]) {
                return false;
            }
        }

        return true;
    }


}
