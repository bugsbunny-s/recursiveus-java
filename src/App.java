import java.util.Scanner;

public class App {

    static int pow(int a, int b){
        if (a==1 || b==0){
            return 1;
        }
        return a * pow(a,b-1);
    }
public static void main (String[] args) throws Exception {
    Scanner inp = new Scanner(System.in);
    System.out.print("Taban sayısını giriniz : ");
    int a = inp.nextInt();
    System.out.print("Üslü sayısını giriniz : ");
    int b = inp.nextInt();

    System.out.println(pow(a, b));
}
}
