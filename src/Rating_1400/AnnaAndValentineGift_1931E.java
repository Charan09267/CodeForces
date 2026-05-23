package Rating_1400;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AnnaAndValentineGift_1931E {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] trailing = new int[n];
            int totalDigits = 0;

            for(int i=0;i<n;i++){
                int x = sc.nextInt();

                while(x % 10 == 0){
                    trailing[i]++;
                    x /= 10;
                    totalDigits++;
                }

                while(x > 0){
                    totalDigits++;
                    x /= 10;
                }
            }

            Arrays.sort(trailing);

            for(int i = n-1 ; i >= 0; i-=2){
                totalDigits -= trailing[i];
            }

            out.append(totalDigits > m ? "Sasha\n":"Anna\n");
        }

        System.out.println(out);
    }
}