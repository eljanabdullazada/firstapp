import java.util.Scanner;
public class learn {
    public static int Function(int a, int b, int c){
        int average_number = (a + b + c)/3;
        int max_number = Math.max(a , Math.max(b, c));
        if((a + b + c) % 3 != 0 ) {
            return -1;
        }        
        else {
            return max_number - average_number;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int result = Function(a, b, c);
        if(result == -1){
            System.out.println("IMPOSSIBLE");
        }
        else {
            System.out.println(result);
        }
    }
}
