import java.io.*;
public class Timemaster {
    public static void main (String[] args) { 

            String h="01:00:00";
String[] h1=h.split(":");
 
int hour=Integer.parseInt(h1[0]);
int minute=Integer.parseInt(h1[1]);
int second=Integer.parseInt(h1[2]);
 
        int temp;
        temp = second + (60 * minute) + (3600 * hour);
 
        System.out.println("secondsss "+temp); 
        } 

    }
