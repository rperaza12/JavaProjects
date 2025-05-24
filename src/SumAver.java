import java.util.Scanner;

public class SumAver {
    
public static int[] inputNums(){
 Scanner sc = new Scanner(System.in);
 int[] nums = new int[5];
 System.out.println("Enter 5 digits");

 // Loop to iterate the 5 times
 for (int i = 0; i < nums.length; i++) {
    System.out.print("Number " + (i + 1 ) + ": ");
    nums[i] = sc.nextInt();
 }
sc.close();

 // For each loop to display the numbers entered
System.out.print("The numbers you have entered are: ");
 for (int num: nums) {
    System.out.print(num);
 }
 return nums;
} 

public static int sum(int nums[]){
    int sum = 0;
    for (int i : nums) {
        sum += i;
    }
    return sum;
    
}

public static int average(int nums[]){
    int sum = 0;
    for (int i : nums) {
        sum += i;
    }
    return sum/5;
    
}

public static void main(String[] args) {
    int[] userInput = inputNums();
    int totalSum = sum(userInput);
    int totalAverage = average(userInput);

    System.out.println();
    System.out.println("The sum is: " + totalSum);
    System.out.println("The Average is: " + totalAverage);
   
}

}
