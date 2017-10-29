package JavaExamples;

/**
 * Created by pavani on 10/13/17.
 */
public class BunnyEars2 {
    public int bunnyEars(int bunnies) {

        if (bunnies == 0)
            return 0;
        if (bunnies == 1){

            return 2;
        }

        if(bunnies%2!=0)
        {
            return 2+bunnyEars(bunnies-1);

        }else {
            return 3+bunnyEars(bunnies-1);
        }



    }


    public int bunniesNonRecrusion(int bunnies)
    {
        int ears=0;


        if (bunnies == 0)
        {
            ears=0;
        }



        for(int i=1;i<=bunnies;i++)
        {
            if(i%2!=0)
            {
                ears=ears+2;
            }
            else {
                ears=ears+3;
            }

        }
        return ears;
    }

    public static void main(String[] args) {
        int bunnies = 4;
        BunnyEars2 ears = new BunnyEars2();
        //System.out.println(ears.bunnyEars(bunnies));
        System.out.println(ears.bunniesNonRecrusion(6));
    }
}
