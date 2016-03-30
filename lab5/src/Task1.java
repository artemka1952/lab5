
import java.util.Scanner;

//Создание нового отдельного класса.
class Circle {

    public double r, x, y;
    public int dist;

    /* Для 1-го */
    public double longCircle() {
        return (Math.PI * 2 * this.r);
    }

    /* Для 2-го */
    public void moveCircle() {
        this.x = this.x + (int) (Math.random() * 199 - 99);
        this.y = this.y + (int) (Math.random() * 199 - 99);
    }

    /* Для 4-го */
    public int distanseCircle(Circle second) {
        return dist = (int) (Math.sqrt(Math.pow((second.x - this.x), 2) + Math.pow((second.y - this.y), 2)));
    }

    public boolean touchCircle(Circle second) {
        return ((this.r + second.r == dist) || (this.r - second.r == dist) || (dist < ((Math.abs(this.r - second.r)))));
    }

    /* Для 3-го */
    //Создание конструктора по умолчанию
    public Circle() {
        this.r = 3;
        this.x = 0;
        this.y = 0;
    }

    //Создание конструктора не по умолчанию
    public Circle(int r, double x, double y) {
        this.r = r;
        this.x = x;
        this.y = y;
    }
}

/**
 * The own classes программа реализует приложение, которое создает отдельниый
 * класс Circle с методами вычисляющих длину окружностей, движением окружностей,
 * расстояние от первой до второй, проверяет касаются ли окружности и
 * конструктором по умолчанию и измененным.
 *
 *
 */
public class Task1 {

    public static void main(String[] args) {

        int k;
        double a, b;

        /* Для 3-го */
        System.out.println("Введите радиус 2-й окружности: ");
        Scanner sc_k = new Scanner(System.in);
        k = sc_k.nextInt();
        Scanner sc_a = new Scanner(System.in);
        System.out.println("Введите координату X центра 2 окр: ");
        a = sc_a.nextInt();
        Scanner sc_b = new Scanner(System.in);
        System.out.println("Введите координату Y центра 2 окр: ");
        b = sc_b.nextInt();

        //Создание объекта obj и obj1
        Circle obj = new Circle();
        Circle obj1 = new Circle(k, a, b);

        /*1-е*/
        //Вызывает у объекта obj метод longCircle
        System.out.println("\nДлина 1-й окружности равна: " + obj.longCircle());

        /*2-е*/
        //obj.moveCircle();
        //Обращается к свойствам(х,у) объекта obj
        System.out.println("1-я окружность перемещена в точку: " + obj.x + " " + obj.y + "\n");

        /* 3-е */
        System.out.println("Длина 2-й окружности равна: " + obj1.longCircle());

        //Вызов метода obj1.moveCircle();
        System.out.println("2-я окружность перемещена в точку: " + obj1.x + " " + obj1.y + "\n");

        /*4-ое*/
        //Вызывает метод объекта obj для объекта obj1
        System.out.println("Расстояние между цетрами окружностей равно: " + obj.distanseCircle(obj1) + "\n");

        /*5-е*/
        if (obj.touchCircle(obj1)) {
            System.out.println("Окружности совпадают!");
        } else {
            System.out.println("Окружности не совпадают!");
        }
    }
}
