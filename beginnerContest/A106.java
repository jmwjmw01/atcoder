import java.util.*;

public class A106{
    public static void A106(String[] args) {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println((a-1) * (b-1));
    }
}
