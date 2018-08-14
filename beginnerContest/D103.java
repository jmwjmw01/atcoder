import java.util.*;
public class D103{
    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        Pair[] pairs = new Pair[m];
        for(int i = 0;i < M;i++){
            Pair ps = new Pair();
            ps.from = sc.nextInt();
            ps.end = sc.nextInt();
            pairs[i] = ps;
        }
        Arrays.sort(pairs);
    }
}

class Pair implements Comparable{
    int from;
    int end;
    public int compareTo(Object other){
        Pair otherpair = (Pair) other;
        return end - otherpair.end;
    }
}