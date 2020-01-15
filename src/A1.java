public class A1 {
    public BitArray vector;
    public int n;

    public A1(int n){
        this.vector = new BitArray(4 * (2 * n - 1));
        this.n = n;
        for (int i = 1; i <= n; i++) {
            this.vector.set(4 * (i + n - 1) - 1, 1);
        }
    }

    public void insert(int item) {
        int curr = item + this.n - 1;
        this.vector.set(4 * curr, 1);
        while (curr != 1) {
            int next = floor(curr, 2);
            if (curr % 2 == 1) {
                this.vector.set(next * 4 - 2, 1);
            } else {
                this.vector.set(next * 4 - 3, 1);
            }
            curr = next;
        }
    }

    public void delete(int item) {
        int curr = item + this.n - 1;
        this.vector.set(4 * curr, 0);
        while (curr != 1) {
            int next = floor(curr, 2);
            if (curr % 2 == 1) {
                if (this.vector.get(next * 4 - 3) == 0) {
                    this.vector.set(next * 4 - 2, 0);
                }
            } else {
                if (this.vector.get(next * 4 - 2) == 0) {
                    this.vector.set(next * 4 - 3, 0);
                }
            }
            curr = next;
        }
    }

    public int maximum() {
        int curr = 1;
        while (this.vector.get(4 * curr - 1) == 0) {
            if (this.vector.get(4 * curr - 2) == 1) {
                curr = 2 * curr + 1;
            } else if (this.vector.get(4 * curr - 3) == 1) {
                curr = 2 * curr;
            } else {
                return 0;
            }
        }
        return curr - (this.n - 1);
    }

    public boolean member(int item) {
        return this.vector.get((item + this.n - 1) * 4) == 1;
    }

    private static int floor(int a, int b) {
        return a/b;
    }
}
