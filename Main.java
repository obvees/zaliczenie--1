import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Wyraz:");

            String string = myObj.nextLine();
            String result  = "";

            for(char letter: string.toCharArray() ){
                if(Character.isUpperCase(letter)){
                    result += Character.toLowerCase(letter);
                }else {
                    result += Character.toUpperCase(letter);
                }

            }
        System.out.println(result);
    }
}