package minggu5;

public class Faktorial {
    int nilai;

    public Faktorial(int nilai) {
        this.nilai = nilai;
    }

    public long FaktorialBF() {
        long faktorial = 1;
        for(int i = 1; i <= nilai; ++i) {
            faktorial *= i;
        }
        return faktorial;
    }

    public long FaktorialDC() {
        return faktorialDCUtil(1, nilai);
    }

    private long faktorialDCUtil(int start, int end) {
        if (start == end) {
            return start;
        } else if (end - start == 1) {
            return (long)start * end;
        } else {
            int mid = (start + end) / 2;
            return faktorialDCUtil(start, mid) * faktorialDCUtil(mid + 1, end);
        }
    }
}