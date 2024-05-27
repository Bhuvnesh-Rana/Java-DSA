package ArrayDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        for(int i=0;i<3;i++)
        l.add(new ArrayList<>());

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                l.get(i).add(sc.nextInt());
            }
        }
        System.out.println(l);
    }    

    
}
