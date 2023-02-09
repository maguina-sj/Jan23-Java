import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        Random randomNum = new Random();
        for (int i =0; i <=10; i++) {
            Integer num = randomNum.nextInt(21);
            myArray.add(num);
        }
        return myArray;
    }

    public String getRandomLetter() {
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        Random randomLetter = new Random();
        int index = randomLetter.nextInt(26);
        return alphabet[index];
    }

    public String generatePassword() {
        String password = "";
        for (int i =0; i <8; i++) {
            String letter = getRandomLetter();
            // System.out.println(letter);
            password = password + letter;
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int size) {
        ArrayList<String> passwordSet = new ArrayList<String>();
        for (int i =1; i <= size; i++) {
            String newWord = generatePassword();
            passwordSet.add(newWord);
        }
        return passwordSet;
    }
// SENSEI BONUS
    public void shuffleArray(){
        Random randomize = new Random();
        ArrayList<String> mixedArray = getNewPasswordSet(4);
        System.out.println(mixedArray);
        
        for (int i =0; i < mixedArray.size(); i++) {
            int index = randomize.nextInt(mixedArray.size());
            // System.out.println(mixedArray.get(index));
            String temp = mixedArray.get(index);
            // mixedArray.get(index) = mixedArray.get(i);
            mixedArray.set(i, temp);
        }
        System.out.println(mixedArray);
        
    }
}