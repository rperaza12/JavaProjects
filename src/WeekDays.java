import java.util.Scanner;

public class WeekDays{

    public static void days(){
    int day = (int)(Math.random() * 7) + 1;

        switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
    }
  
    
    }
    
  public static void main(String[] args) {
  Scanner activator = new Scanner(System.in);
  System.out.println("Enter Any number to continue...");
  activator.nextInt();
  days();


  activator.close();
  
}
}
