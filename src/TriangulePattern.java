import java.util.Scanner;

public class TriangulePattern {
    
public static void triangle(){
Scanner sc = new Scanner(System.in);
System.err.println("Enter a number to build the right triangule");
int input = sc.nextInt();

for (int i = 1; i <= input; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(i);
    }
    System.out.println();
}
sc.close();
}

public static void main(String[] args) {
    triangle();
}

}

