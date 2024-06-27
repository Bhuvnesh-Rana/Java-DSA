package ZJIQ;

public class CountNoOfWordsInString {
    public static void main(String[] args) {
        String a = "Happy go lucky go";
        int count = a.length();
        for(int i = 0; i <= a.length()-1; i++){
            if(a.charAt(i) == ' ' && a.charAt(i+1) != ' '){
                count--;
            }
            else if (a.charAt(i) == ' ' && a.charAt(i+1) == ' ') {
                System.out.println("Invalid<---> two spaces togather at index: "+i);
                break; 
            }
        }
        System.out.println(count);
    }
}
