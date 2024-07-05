package ZJIQ;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int asteroid[] = {-3, 5, 3};
        int [] ans = asteroidCollision(asteroid);
        System.out.println(Arrays.toString(ans));
    }

    public static int [] asteroidCollision(int [] asteroid){
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < asteroid.length; i++){

// IF STACK IS EMPTY OR A POSITIVE VALUE ARRIVES THEN PERFORM BLIND INSERTION.

            if (stack.isEmpty() || asteroid[i] > 0) {
                stack.push(asteroid[i]);
            }
            else{
                while (!stack.isEmpty()) {
                    int top = stack.peek();
                    if (top < 0) {
                        stack.push(asteroid[i]);
                        break;
                    }
                    int modVal = Math.abs(asteroid[i]);
                    if (modVal == top) {
                        stack.pop();
                        break;
                    }
                    else if(modVal < top){
                        break;
                    }
                    else{
                        stack.pop();
                        if (stack.isEmpty()) {
                            stack.push(asteroid[i]);
                            break;
                        }
                    }
                }
            }
        }
        int [] ansArray = new int[stack.size()]; 
        for(int i = stack.size() - 1; i <= 0; i++){
            ansArray[i] = stack.pop();
        }
        return ansArray;
    }
    
}