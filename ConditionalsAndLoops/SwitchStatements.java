package ConditionalsAndLoops;

import java.util.Scanner;

public class SwitchStatements {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter fruit name: ");
            String fruit = sc.nextLine();

            switch (fruit) {
                case "Mango":
                    System.out.println("King of fuits.");
                    break;
                case "Apple":
                    System.out.println("Keeps doctor away.");
                    break;
                case "Banana":
                    System.out.println("Strength.");
                    break;
            
                default:
                System.out.println("Invalid fruit.");
                    break;
            }

            System.out.println("Enter place: ");
            String place = sc.nextLine();

            //ENHANCED SWITH. JAVA 14 ONWARDS.
            // switch(place){
            //     case "Chd" -> System.out.println("Best place");
            //     case "Bglor" -> System.out.println("IT");
            //     default -> System.out.println("not in db.");
            // }

            System.out.print("Enter day of the week: ");
            int dayOfWeek = sc.nextInt();
            // switch(dayOfWeek){                                                  //Similar to :
            //     case 1, 2, 3, 4, 5 -> System.out.println("Weekday");          //case 1:
            //     case 6,7 -> System.out.println("Weekday");                    //case 2:
            //                                                                     //case 3: body
            // }
        }
    }
}
