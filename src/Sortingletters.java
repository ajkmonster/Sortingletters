import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.Arrays;
import java.util.Scanner;

public class Sortingletters {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        String[] arr = new String[3];
        Scanner key1 = new Scanner(System.in);
        System.out.println("Enter first letter: ");
        arr[0] = key1.next();
        Scanner key2 = new Scanner(System.in);
        System.out.println("Enter second letter: ");
        arr[1] = key2.next();
        Scanner key3 = new Scanner(System.in);
        System.out.println("Enter third letter: ");
        arr[2] = key3.next();
        int var1 = arr[0].compareTo(arr[1]);
        int var2 = arr[1].compareTo(arr[2]);
        int var3 = arr[2].compareTo(arr[0]);
        if (var1 < 0 && var2 < 0 && var3 > 0) {
            System.out.printf("" + arr[0] +","+ arr[1] +","+ arr[2] + "");
        } else if (var1 < 0 && var2 > 0 && var3 >0) {
            System.out.printf("" + arr[0] +","+ arr[2] +","+ arr[1] + "");
        } else if(var1 > 0 && var2 > 0) {
            System.out.printf("" + arr[2] +","+ arr[1] +","+ arr[0] + "");
        } else if (var1 > 0 && var2 <0 && var3 > 0){
            System.out.printf("" + arr[1] +","+ arr[0] +","+ arr[2] + "");
        } else if (var1 < 0 && var2 > 0 && var3 < 0) {
            System.out.printf("" + arr[2] +","+ arr[0] +","+ arr[1] + "");
        }  else
            System.out.printf("" + arr[1] +","+ arr[2] +","+ arr[0] + "");
        }
        /*Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
*/
}

