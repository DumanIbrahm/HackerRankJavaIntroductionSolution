import java.io.BufferedReader;
import java.util.*;

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
    public static void JavaStdinaAndOut2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
    public static void outputFormatting(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            String s = ""+x;
            int number=0;
            String bosluk = "";
            for (; s.length()<3;) {
                s=0+s;
            }
            number = 18 - (s1.length() + s.length());
            for (int j = 0; j < number; j++){
                bosluk += " ";
            }
            System.out.println(s1+bosluk+s);
 
        }
        System.out.println("================================");
    }
    public static void Loops1(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i = 1; i < 11; i++) {
            System.out.println(N+" x "+i+" = "+(N*i));
        }
        bufferedReader.close();
    }

        
}
