import java.util.Scanner;

public class AlphabetInput {
    
    public static void vowOrCon(){
        Scanner sc = new Scanner(System.in);
        String inp;

        while (true) {
            System.out.println("Enter a character: ");
            inp = sc.nextLine();

            if (inp.isEmpty()) {
                System.out.println("Input can't be empty, type a letter");
                continue;
            } 
            if (inp.length() > 1 ){
                System.out.println("You entered more than 1 char, please enter 1 letter only");
                continue;
            } 
            if (inp.matches("[a-zA-Z]")) {
                if (inp.matches(".*[aeiouAEIOU].*")) {
                    System.out.println("This is a vowel is a vowel");
                } else{
                    System.out.println("This is a consonant");
                }
    
            } 
            else {
                System.out.println("Please enter a valid letter");
                continue;
            }
            break;
        }

            
        
        sc.close();
    }

public static void main(String[] args) {
    vowOrCon();
}

}
