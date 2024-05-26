package Methods;

public class Shadowing {
    static int a=4;
    public static void main(String[] args) {
        System.out.println(a);
        int a=10;               //class variable at line 4 is shadowed here.
        System.out.println(a);
        view();
    }
    static void view(){
        System.out.println("In method view a: "+a);
    }
}
