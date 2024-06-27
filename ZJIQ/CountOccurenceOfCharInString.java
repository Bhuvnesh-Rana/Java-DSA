package ZJIQ;

public class CountOccurenceOfCharInString {
    public static void main(String[] args) {
        String a = "Today is thursday so happy. ha ha";
        char target = 'a';
        int count = 0;

// OTHER MTHD CAN BE FIRST GET THE LENGTH OF ORIGIONAL STRING THEN REMOVE THE TARGET CHAR USING REPLACEALL
// (REGEX) AFTER REPLACING GET THE LENGTH OF ALTERED STRING THEN SUBTRACT THE ANS IS NO. OF OCCURENCE OF TARGET

        for(int i = 0; i < a.length(); i++){
            // for(int j = i+1; j < a.length(); j++){
                if (a.charAt(i) == target) {
                    count++;
                }
            // }
        }
        System.out.println("No. of occurence of "+target+" is: "+count);
    }
}
