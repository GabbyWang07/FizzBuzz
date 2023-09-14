public class Multiples {
    public static void main(String[] args) {

        int k = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {

                k++;
            }
        }

    }

    public int main(int n, int a, int b) {
        int k = 0;
        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) {

                k++;

            }
    }
        return k;
    }

    public int main() {
        int k = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {

                k++;

            }
        }
        return k;
    }
}


