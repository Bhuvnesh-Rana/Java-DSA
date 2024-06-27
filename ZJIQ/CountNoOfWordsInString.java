package ZJIQ;

class MyException extends Exception{
    MyException(String s){
        super(s);
    }
}

public class CountNoOfWordsInString {
    public static void main(String[] args) {
        String a = "Happy go  lucky go";
        boolean flag = true;
        int count = a.length();

        for(int i = 0; i <= a.length()-1; i++){
            if(a.charAt(i) == ' ' && a.charAt(i+1) != ' '){
                count--;
            }
            
            else if (a.charAt(i) == ' ' && a.charAt(i+1) == ' ') {
                flag = false;
                try {
                    throw new MyException("Invalid String entered.");
                } catch (MyException e) {
                    // System.out.println(e.getMessage());
                    e.printStackTrace();
                }
                break;
            }
        }
        if(flag)
            System.out.println(count);
    }
}
