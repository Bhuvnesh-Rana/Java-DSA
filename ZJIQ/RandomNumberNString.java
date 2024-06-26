package ZJIQ;

import java.util.Random;

public class RandomNumberNString {
    public static void main(String[] args) {

        // MTHD 1
        Random r = new Random();
        int num1 = r.nextInt(100);
        System.out.println("Random no. generated from Random class: "+num1);

        // MTHD 2
        int a = (int) Math.random()*10;
        System.out.println(a);

        // MTHD 3
        // APACHE COMMONS-LANG API. ADD JAR FILE.
        // String rNo = RandomStringUtils.randomNumeric(3);    //(no. of digits.)
        // String rStr = RandomStringUtils.randomAlpahbet(5);   //(no. of alphabets.)
    }
    
}