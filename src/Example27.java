import java.util.Scanner;
public class Example27 {
    public static void main(String[] argv) {

        int n=40,firstTerm=0,secondTerm=1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i=1; i<=n;i++) {
            System.out.print(firstTerm + ", ");
            int nextTerm= firstTerm+secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

