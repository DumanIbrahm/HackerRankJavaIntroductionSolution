import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
    }
    public static void WelcomeToJava(){
        System.out.println("Hello, World!");
    }

    public static void JavaStdinaAndOut(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(scan.nextInt());
    }
    public static void ifElse(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N%2 != 0)
            System.out.println("Weird");
        else if(N<=5 && N>=2)
            System.out.println("Not Weird");
        else if(N<=20 && N>=6)
            System.out.println("Weird");
        else if(N>20)
            System.out.println("Not Weird");
        scanner.close();
    }
        
}
