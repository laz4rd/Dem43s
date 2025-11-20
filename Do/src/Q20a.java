class Pair<T, U> {
    T var1;
    U var2;

    public Pair(T var1, U var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    T getT() {
        return var1;
    }

    U getU() {
        return var2;
    }
}

public class Q20a {
    public static void main(String[] args) {
        Pair<Integer, String> pear = new Pair(12, "Twelve");
        System.out.println(pear.getT());
        System.out.println(pear.getU());

        Pair<Double, Double> reap = new Pair(12.0, 24.0);
        System.out.println(reap.getT());
        System.out.println(reap.getU());
    }
}