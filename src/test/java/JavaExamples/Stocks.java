package JavaExamples;

/**
 * Created by pavani on 9/5/17.
 */
public class Stocks {
    public static void main(String[] args) {
        int stock[] = new int[]{8,30,5,12,50,1,3};
        Stocks.stocksCal(stock);
    }
    public static void stocksCal(int stock[]){
        int diff=0, temp=0;
        for (int i = 0; i <stock.length ; i++) {
            for (int j = i+1; j <stock.length ; j++) {

               diff = stock[i]-stock[j];
               //System.out.print(diff+",");

               if(diff<temp){
                   temp = diff;
               }
            }
            //System.out.println();
        }
        //System.out.println(temp);
        System.out.println();

        for (int i = 0; i <stock.length ; i++) {
            for (int j = i + 1; j < stock.length; j++) {
                diff = stock[i] - stock[j];
                if (diff == temp) {
                    System.out.println("Stocks are Profitable when buying price is "+stock[i]+" and selling price is "+stock[j]);
                    break;
                }
            }
        }

    }
}
