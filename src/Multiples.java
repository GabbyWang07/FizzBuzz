public class Multiples {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {

                k++;
            }
    }
        System.out.println(k);
    }
}

