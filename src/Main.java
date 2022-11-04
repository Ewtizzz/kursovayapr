import java.lang.reflect.Array;

public class Main {
    public static void isPalindrome(String words){
        if ((words.replaceAll("\\W","")).equalsIgnoreCase(new StringBuilder(words).reverse().toString().replaceAll("\\W",""))){
            System.out.println("Строчка является палиндромом");
        } else {
            System.out.println("Строчка не является палиндромом");
        }
    }
    public static void main(String[] args) {
        isPalindrome("А роза упала на лапу азора");
    }
}