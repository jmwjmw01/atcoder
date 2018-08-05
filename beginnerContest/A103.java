
public class A103{
	public static void main(String[] args) {
        new Main().run();
	}

    void run() {
        Sccaner sc = new Sccaner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int [] array = new int[3];

        array[0] = a;
        array[1] = b;
        array[2] = c;

        Arrays.sort(array);

        int cost = 0;

        for(int i=0; i<array.length-1; i++){
            int before = array[i];
            int newCost = Math.abs(before - array[i+1]);
            cost += newCost;
        }

        System.out.println(cost);

    }
}
