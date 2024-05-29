<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        Buku buku = new Buku("Java Programming", 50.0, 100);
        System.out.println("Harga Total: " + buku.hitungHargaTotal());
        System.out.println("Diskon: " + buku.hitungDiskon());
        System.out.println("Harga Bayar: " + buku.hitungHargaBayar());

        Dragon dragon = new Dragon(3, 4, 10, 8);
        dragon.moveLeft();
        dragon.moveUp();
        dragon.moveDown();
        dragon.moveRight();
    }
}

class Buku {
    private String judul;
    private double harga;
    private int jumlahTerjual;

    public Buku(String judul, double harga, int jumlahTerjual) {
        this.judul = judul;
        this.harga = harga;
        this.jumlahTerjual = jumlahTerjual;
    }

    public double hitungHargaTotal() {
        return harga * jumlahTerjual;
    }

    public double hitungDiskon() {
        double hargaTotal = hitungHargaTotal();

        if (hargaTotal > 150000) {
            return 0.12 * hargaTotal;
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            return 0.05 * hargaTotal;
        } else {
            return 0;
        }
    }

    public double hitungHargaBayar() {
        double hargaTotal = hitungHargaTotal();
        double diskon = hitungDiskon();

        return hargaTotal - diskon;
    }
}

class Dragon {
    private int x;
    private int y;
    private int width;
    private int height;

    public Dragon(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void moveLeft() {
        x = Math.max(0, x - 1);
        if (x == 0 || x > width) {
            detectCollision();
        }
    }

    public void moveRight() {
        x = Math.min(width, x + 1);
        if (x == 0 || x > width) {
            detectCollision();
        }
    }

    public void moveUp() {
        y = Math.max(0, y - 1);
        if (y == 0 || y > height) {
            detectCollision();
        }
    }

    public void moveDown() {
        y = Math.min(height, y + 1);
        if (y == 0 || y > height) {
            detectCollision();
        }
    }

    public void detectCollision() {
        System.out.println("Game Over");
    }
}
=======
public class Main {
    public static void main(String[] args) {
        Buku buku = new Buku("Java Programming", 50.0, 100);
        System.out.println("Harga Total: " + buku.hitungHargaTotal());
        System.out.println("Diskon: " + buku.hitungDiskon());
        System.out.println("Harga Bayar: " + buku.hitungHargaBayar());

        Dragon dragon = new Dragon(3, 4, 10, 8);
        dragon.moveLeft();
        dragon.moveUp();
        dragon.moveDown();
        dragon.moveRight();
    }
}

class Buku {
    private String judul;
    private double harga;
    private int jumlahTerjual;

    public Buku(String judul, double harga, int jumlahTerjual) {
        this.judul = judul;
        this.harga = harga;
        this.jumlahTerjual = jumlahTerjual;
    }

    public double hitungHargaTotal() {
        return harga * jumlahTerjual;
    }

    public double hitungDiskon() {
        double hargaTotal = hitungHargaTotal();

        if (hargaTotal > 150000) {
            return 0.12 * hargaTotal;
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            return 0.05 * hargaTotal;
        } else {
            return 0;
        }
    }

    public double hitungHargaBayar() {
        double hargaTotal = hitungHargaTotal();
        double diskon = hitungDiskon();

        return hargaTotal - diskon;
    }
}

class Dragon {
    private int x;
    private int y;
    private int width;
    private int height;

    public Dragon(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void moveLeft() {
        x = Math.max(0, x - 1);
        if (x == 0 || x > width) {
            detectCollision();
        }
    }

    public void moveRight() {
        x = Math.min(width, x + 1);
        if (x == 0 || x > width) {
            detectCollision();
        }
    }

    public void moveUp() {
        y = Math.max(0, y - 1);
        if (y == 0 || y > height) {
            detectCollision();
        }
    }

    public void moveDown() {
        y = Math.min(height, y + 1);
        if (y == 0 || y > height) {
            detectCollision();
        }
    }

    public void detectCollision() {
        System.out.println("Game Over");
    }
}
>>>>>>> 1ac25a5220374041c1782ceb3386bc8fbd518f6a
