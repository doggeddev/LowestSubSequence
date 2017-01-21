import java.util.Arrays;

/**
 * Anagram checker idea using byte array.
 *
 */
public class anagrambyteidea {

    public static void main(String[] args) {

        String wordToCheck = "richard is a super stud";
        String wordToCheck2 = "drachir a si perus duts";

        System.out.println("is an anagram: " + isAnagram(wordToCheck, wordToCheck2));
    }


    private static boolean isAnagram(String wordToCheck, String wordToCheck2) {

        //convert word to byte array
        byte[] bitmap = wordToCheck.getBytes();
        byte[] bitmap2 = wordToCheck2.getBytes();

        Arrays.sort(bitmap);
        Arrays.sort(bitmap2);

        //check each byte and look for any difference between arrays
        if (bitmap.length == bitmap2.length) {
            int i = 0;

            while ((i < bitmap.length) && (bitmap[i] == bitmap2[i]))
                i++;

            if (i == bitmap.length)
                return true;
        }
        return false;
    }


}




