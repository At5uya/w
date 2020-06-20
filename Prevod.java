import java.util.*;
 public class Prevod {
public static void (String[] args) {
 
      Scanner sc = new Scanner(System.in);
 
      System.out.print("Enter the number of seconds: ");
      int input = sc.nextInt();
 
      int hours = input / 3600;
      int minutes = (input % 3600) / 60;
      int seconds = (input % 3600) % 60;
 
      System.out.println("Hours: " + hours);
      System.out.println("Minutes: " + minutes);
      System.out.println("Seconds: " + seconds);
 
   }
}