package JavaExamples;

/**
 * Created by pavani on 10/13/17.
 */
public class BunnyEars {
    public int bunny(int count){

        if(count == 0){
            return 0;
        }
        if(count == 1){
            return 2;
        }

        //int totalEars;
        return bunny(count-1)+bunny(1);
    }

    public static int bunnyNonrec(int count){
        int totalEars=0, ears = 2;

        for (int i = 1; i <=count ; i++) {
            if(count == 0){
                return 0;
            }
            if(count == 1){
                return 2;
            }
            totalEars = i*2;

        }

        return totalEars;
    }

    public static void main(String[] args) {
        int count = 10;
        BunnyEars ears = new BunnyEars();
        System.out.println(ears.bunny(count));
    }
}
