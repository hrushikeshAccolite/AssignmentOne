import java.util.ArrayList;

public class CountVowels {
    public static void main(String[] args){
        ArrayList<Character> vowels = new ArrayList<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        String str = "This is a test string";
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(vowels.contains(str.charAt(i))){
                count++;
            }
        }
        System.out.println("Number of vowels in the string: " + count);
    }
}
