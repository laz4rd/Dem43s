// b) Demonstrate access modifiers by creating three classes across packages showing what is allowed/denied for  , protected, default, and private members. Summarize observations in comments. (10 Marks)

package p1;

public class BaseClass {
    private String a = "PRIVATE";
    protected String b = "PROTECC";
    String c = "DEFAULT";
    public String d = "PUBLIC";

    public void show() {
        System.out.println("THIS IS THE BASE CLASS");
    }
}