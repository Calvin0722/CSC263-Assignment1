public class BitArray {
    public boolean[] array;

    BitArray(int n){
        this.array = new boolean[n];
        for (int i = 0; i < n; i++) {
            array[i] = false;
        }
    }

    public void set(int n, int value) {
        boolean i;
        if (value == 1) {
            i = true;
        } else {
            i = false;
        }
        this.array[n - 1] = i;
    }

    public int get(int n) {
        if (this.array[n - 1]) {
            return 1;
        } else {
            return 0;
        }
    }
}
