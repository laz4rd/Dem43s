class paramet {
    int a;
    int b;
    int c;

    public paramet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void parashow() {
        System.out.println(a + " " + b + " " + c);
    }

}

class def {
    int a;
    int b;
    int c;

    void defshow() {
        System.out.println(a + " " + b + " " + c);
    }
}

public class Q17b {
    public static void main(String[] args) {
        paramet pear = new paramet(12, 24, 36);
        pear.parashow();

        def d = new def();
        d.a = 10;
        d.b = 11;
        d.c = 12;
        d.defshow();
    }
}