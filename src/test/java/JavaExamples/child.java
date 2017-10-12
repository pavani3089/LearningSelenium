package JavaExamples;

/**
 * Created by pavani on 9/18/17.
 */
public class child extends parent {
    public void x()
    {
        y();
    }

    public void y() {
        System.out.println("x");
    }

    public static void main(String[] args) {
        parent c=new child();
        c.y();
    }
}
