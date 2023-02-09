import java.util.ArrayList;

public final class ArrayLists {
    
    public static void main(String[] args){
        String[] words = {"it", "is", "this", "we", "do", "how"};
        ArrayList<String> phrase = new ArrayList<String>();
        ArrayList<String> phrase2 = new ArrayList<String>();
        // Pull words from the 'words' array to populate the 'phrase' array list
        phrase.add(words[2]);
        phrase.add(words[1]);
        phrase.add(words[5]);
        phrase.add(words[3]);
        phrase.add(words[4]);
        phrase.add(words[0]);
        // Print the 'phrase' array list
        // Expected output: [this, is, how, we, do, it]

        System.out.println(phrase);

        //easy critique: so much repetition, not DRY, can't we group these together somehow?
        // Yes, it is! go to the next module that covers loops! 

        for (int i = 0; i < words.length; i++) {
            phrase2.add(words[i]);
        }
        System.out.println(phrase2);
    }

}