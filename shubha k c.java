import java.util.*;
import java.util.Arrays;
import java.util.stream.IntStream;
public class del   
{  
public static void main(String[] args)   
{  
    Scanner sc=new Scanner(System.in);  
    String[] goodie = {"MI Band","Sandwich Toaster","Cult Pass","Scale","Fitbit Plus","Microwave Oven","Alexa","Digital Camera","IPods","Macbook Pro"};
    int[] amt = {999,2195,2799,4999,7980,9800,9999,11101,22349,229900};
    int[] dif = new int[10];
    System.out.print("Number of the employees: ");
    int n = sc.nextInt();
    for (int i = 0; i < 10-n; i++){
        dif[i] = amt[(i+n)-1] - amt[i];
    }
    int min = dif[0];
    int pos=0;
        for(int i=1; i<10-n; i++ ) {
            if(dif[i] < min) {
                min = dif[i];
                pos = i;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("The goodies selected for distribution are: ");
        System.out.println();
        for(int i=pos;i<(pos+n);i++){
            System.out.println(goodie[i] + ": " + amt[i]);
        }
        System.out.println();
        System.out.println("And the difference between the chosen goodie with highest price and the lowest price is "+dif[pos]);
    }
}






OUTPUT
Number of the employees: 2


The goodies selected for distribution are:

Microwave Oven: 9800
Alexa: 9999

And the difference between the chosen goodie with highest price and the lowest price is 199


Number of the employees: 4


The goodies selected for distribution are:

Fitbit Plus: 7980
Microwave Oven: 9800
Alexa: 9999
Digital Camera: 11101

And the difference between the chosen goodie with highest price and the lowest price is 3121

The goodies selected for distribution are:

Sandwich Toaster: 2195
Cult Pass: 2799
Scale: 4999
Fitbit Plus: 7980
Microwave Oven: 9800
Alexa: 9999

And the difference between the chosen goodie with highest price and the lowest price is 7804




