public class Main {
    public static void main(String[] args) {

        Palindrome p1 = new Palindrome();
        int test1 = 12345;
        int test2 = 23332;
        int test3 = 13577531;
        int test4 = 12356789;

        p1.isPalindrome(test1);
        p1.isPalindrome(test2);
        p1.isPalindrome(test3);
        p1.isPalindrome(test4);
    }
}