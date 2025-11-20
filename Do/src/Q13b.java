// b) Write a generic method swap(T a, T b) to interchange two values and print them before and after swapping. (5 Marks)

class Wrapper<T> {
    T value;

    public Wrapper(T value) {
        this.value = value;
    }
}

public class Q13b {

    // Generic swap method
    public static <T> void swap(Wrapper<T> a, Wrapper<T> b) {
        System.out.println("Before Swap:");
        System.out.println("a = " + a.value + ", b = " + b.value);

        T temp = a.value;
        a.value = b.value;
        b.value = temp;

        System.out.println("After Swap:");
        System.out.println("a = " + a.value + ", b = " + b.value);
    }

    public static void main(String[] args) {
        Wrapper<Integer> x = new Wrapper<>(10);
        Wrapper<Integer> y = new Wrapper<>(20);

        swap(x, y);

        Wrapper<String> s1 = new Wrapper<>("Hello");
        Wrapper<String> s2 = new Wrapper<>("World");

        swap(s1, s2);
    }
}