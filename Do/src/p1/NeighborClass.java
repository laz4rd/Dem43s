package p1;

public class NeighborClass {
    public static void main(String[] args) {
        BaseClass bas = new BaseClass();

        // System.out.println(bas.a); private. i.e. not accessible
        System.out.println(bas.b);
        System.out.println(bas.c);
        System.out.println(bas.d);
    }
}
