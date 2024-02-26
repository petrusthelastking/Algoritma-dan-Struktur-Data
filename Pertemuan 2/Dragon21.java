import java.util.Scanner;
public class Dragon21 {
    int x;
    int y; 
    int width; 
    int height;

    Dragon21(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void moveLeft() {
        x--;
        if (x < 0) {
            detectCollision(x, y);
        }
    }

    void moveRight() {
        x++;
        if (x > width) {
            detectCollision(x, y);
        }
    }

    void moveUp() {
        y--;
        if (y < 0) {
            detectCollision(x, y);
        }
    }

    void moveDown() {
        y++;
        if (y > height) {
            detectCollision(x, y);
        }
    }

    void detectCollision(int x, int y) {
        System.out.println("Anda selesai");
        System.exit(0);
    }

    void printPosition() {
        System.out.println("Dragon Posision : (" + x + ", " + y + ")");
    }
    public static void main(String[] args) {
        Scanner sc21 = new Scanner(System.in);

        Dragon21 playerpetrus = new Dragon21(0, 0, 10, 10);

        while (true) {
            playerpetrus.printPosition();

            System.out.println("Pilih arah gerakan: ");
            System.out.println("1. Left");
            System.out.println("2. Right");
            System.out.println("3. Move up");
            System.out.println("4. Move down");

            int choice = sc21.nextInt();

            switch (choice) {
                case 1:
                    playerpetrus.moveLeft();
                    break;
                case 2:
                    playerpetrus.moveRight();
                    break;
                case 3:
                    playerpetrus.moveUp();
                    break;
                case 4:
                    playerpetrus.moveDown();
                    break;
                default:
                    System.out.println("Input tidak masuk kedalam in game.");
            }
        }
    }

}