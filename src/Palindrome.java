import java.util.ArrayList;

public class Palindrome {

    public boolean isPalindrome(int x) {

        ArrayList<Character> charArray = new ArrayList<>();
        String numString = String.valueOf(x);
        String reversedString = "";
        int reversedNum;

        //Loop through our string and add each character to our char array.
        for (char ourChar : numString.toCharArray()) {
            charArray.add(ourChar);
        }
        //Loop to reverse our array of chars and put the values in a string, and
        //then we will convert the string to an integer and compare the values.
        for(int i = (charArray.size() - 1); i > -1; i--){
            reversedString = reversedString + String.valueOf(charArray.get(i));
        }
        //If the string and reversed string are equal, return true. Otherwise, we will return false.
        if(numString.equals(reversedString)){
            System.out.println("The number " + x + " is a palindrome.");
            return true;
        }
        else {
            System.out.println("The number " + x + " is not a palindrome.");
            return false;
        }
    }
}
