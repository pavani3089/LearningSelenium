package JavaExamples;

/**
 * Created by pavani on 10/13/17.
 */
public class TriangleEx {
    public static int triangleRecur(int rows) {
        if(rows==0){
            return 0;
        }
        return rows+triangleRecur(rows-1);
    }

    public static int triangle(int rows){

        int prev =1;
        for (int i =2; i <=rows ; i++) {
            prev= prev+i;


        }
        return prev;
    }

    public static void main(String[] args) {
        int rows = 4;
        System.out.println(triangleRecur(rows));
    }
}
