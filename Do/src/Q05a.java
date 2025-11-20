// a) Implement a generic class Pair<T, U> with methods swap(), equals(), and toString(). Test with Pair<Integer,String> and Pair<Double,Double>. (10 Marks)

class Pair<T, U> {
    T var1;
    U var2;

    public Pair(T var1, U var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    void swap() {
        T temp;
        temp = var1;
        var1 = (T) var2;
        var2 = (U) temp;
    }

    void equals() {
        if (var1 == (T) var2 || var2 == (U) var1) {
            System.out.println("Equals");
        } else {
            System.out.println("Not equals");
        }
    }

    void ToString() {
        System.out.println(var1 + " " + var2);
    }
}

public class Q05a {
    public static void main(String[] args) {
        Pair<Integer, String> pear = new Pair(12, "VIRUS");
        pear.equals();
        pear.ToString();
        pear.swap();
        pear.ToString();
    }
}
