// Define an interface Payable with double getPayableAmount(). Implement it in classes Invoice and HourlyEmployee. Store mixed objects in an array and print the total payable. (10 Marks)

interface Payable {
    double getPayableAmount();
}

class Invoice implements Payable {
    String[] items;

    Invoice(String[] items) {
        this.items = items;
    }

    @Override
    public double getPayableAmount() {
        for (String item : items) {
            System.out.println("Item: " + item);
        }
        System.out.println("Total Items: " + items.length);
        return items.length * 100;
    }
}

class HourlyEmployee implements Payable {
    int hours;
    double rate;

    HourlyEmployee(int hours, double rate) {
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public double getPayableAmount() {
        System.out.println("Number of Hours: " + hours);
        return hours * rate;
    }
}

public class Q03b {
    public static void main(String[] args) {
        Payable[] arr = new Payable[2];
        arr[0] = new Invoice(new String[] { "Pen", "Book", "USB" });
        arr[1] = new HourlyEmployee(10, 200);

        double total = 0;
        for (Payable p : arr) {
            total += p.getPayableAmount();
        }
        System.out.println("Total Payable: " + total);
    }
}