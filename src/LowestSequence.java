/**
 * Online Assessment Question
 *
 * I didn't have a chance to finish solving it during the timed test, so I solved it on my own time.
 * Originally, I did it iteratively, but I noticed the pattern with the decreasing number of characters.
 * Here is my recursive solution.
 *
 * Problem: Return lowest subsequence for a given sequence after removing any given number of characters
 *
 */
public class LowestSequence {


    public static void main(String[] args) {

        //simple test cases
        System.out.println(lowestSequence("","6392850925", 5)); //expected 20925
        System.out.println(lowestSequence("","6392850925", 4)); //expected 0925
        System.out.println(lowestSequence("","2390851825", 5)); //expected 01825
        System.out.println(lowestSequence("","2390851825", 4)); //expected 0125
        System.out.println(lowestSequence("","2390851825", 3)); //expected 012
        System.out.println(lowestSequence("","2390851825", 2)); //expected 01
    }

    public static String lowestSequence(String lowestSequence, String seq, int k) {

        int indexOfMinimumValue = 0;

        if(k == seq.length()){ //if the number of characters remaining is equal to the number to remove, this has to be the smallest sequence.
            return lowestSequence += seq.substring(indexOfMinimumValue);
        }

        if (k == 0) { //all numbers have been removed from the sequence as specified by k
            return lowestSequence;
        }

        for (int i = 0; i < seq.length() + 1 - k; i++) { //not sure why I added the 1, I just know I was experiencing an off by one count.
                                                        //I need to figure out why I had to do this. Stack trace?

            if (seq.charAt(i) < seq.charAt(indexOfMinimumValue)) {
                indexOfMinimumValue = i;
            }
        }
        lowestSequence += seq.charAt(indexOfMinimumValue);

        return lowestSequence(lowestSequence, seq.substring(indexOfMinimumValue + 1), k - 1);
    }
}


