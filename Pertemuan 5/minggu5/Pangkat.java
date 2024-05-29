<<<<<<< HEAD
package minggu5;

public class Pangkat {

    public int nilai, pangkat;

    // Brute Force method for calculating power
    public int PangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil *= a;
        }
        return hasil;
    }

    // Divide and Conquer method for calculating power
    public int PangkatDC(int a, int n) {
        if (n == 1) {
            return a;
        } else {
            if (n % 2 == 1) {
                return (PangkatDC(a, n / 2) * PangkatDC(a, n / 2) * a);
            } else {
                return (PangkatDC(a, n / 2) * PangkatDC(a, n / 2));
            }
        }
    }
}

=======
package minggu5;

public class Pangkat {

    public int nilai, pangkat;

    // Brute Force method for calculating power
    public int PangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil *= a;
        }
        return hasil;
    }

    // Divide and Conquer method for calculating power
    public int PangkatDC(int a, int n) {
        if (n == 1) {
            return a;
        } else {
            if (n % 2 == 1) {
                return (PangkatDC(a, n / 2) * PangkatDC(a, n / 2) * a);
            } else {
                return (PangkatDC(a, n / 2) * PangkatDC(a, n / 2));
            }
        }
    }
}

>>>>>>> 1ac25a5220374041c1782ceb3386bc8fbd518f6a
