import java.util.Scanner;

public class GameWithIntegers_1899A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while(tc-- > 0){

            int n = sc.nextInt();
            System.out.println(n % 3 == 0 ?"Second" : "First");
        }
    }
}
