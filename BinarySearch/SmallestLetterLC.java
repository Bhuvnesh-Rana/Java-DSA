public class SmallestLetterLC {
    public static void main(String[] args) {
        char a[]={'a','d','j','t'};
        char target = 'z';
        char result = smallestLetter(a, target, 0, a.length-1);
        System.out.println(result);


    }

//USES CEILING APPROACH AND WRAPPING(IF NO ELEMENT THEN RETUN FIRST ELEMENT.)
// Q. GIVEN CHARACTER ARRAY THAT IS SORTED IN NON DEcREASING ORDER AND A CHAR TARGET
// RETURN THE SMALLEST CHARACTER IN THE ARRAY THAT IS LARGER THAN THE TARGET.

    static char smallestLetter(char a[], int target, int s, int e){
        if (target>a[a.length-1]) {     //WRAPPING 
            return a[0];                //INSTEAD OF THIS CAN CHANGE THE RETURN STATEMENT TO
        }                               // return a[s%a.length] i.e a[0].

        while (s<e) {
            int mid = (s+e)/2;
            if (a[mid]>target) {
                e=mid-1;
            }
            else
            s=mid+1;
        }
        return a[s];
    } 

}
