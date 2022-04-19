import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Dizi sayisi giriniz : ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Dizinin elemanlarini giriniz: ");
        for(int i = 0; i<n; i++){
            System.out.println(i + 1 + "." + " Elemani:");
            int eleman = input.nextInt();
            arr[i] = eleman;
        }

        Arrays.sort(arr);
        System.out.println("Siralama           : " + Arrays.toString(arr));





    }
}