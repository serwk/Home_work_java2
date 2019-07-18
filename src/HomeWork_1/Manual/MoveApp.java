package HomeWork_1.Manual;

/**
 * ДЗ по методичке
 * Не успел его полностью отладить
 */
public class MoveApp {
    public static void main(String[] args) {
        Move athletes[] = new Move[5];
        athletes[0] = new Man(0.5, 100);
        athletes[1] = new Cat(1, 60);
        athletes[2] = new Robot(0.3, 40);
        athletes[3] = new Man(0.4, 50);
        athletes[4] = new Cat(0.8, 80);

        Object obstacles[] = new Object[5];
        obstacles[0] = new Treadmill(30);
        obstacles[1] = new Wall(0.4);
        obstacles[2] = new Treadmill(10);
        obstacles[3] = new Wall(0.7);
        obstacles[4] = new Treadmill(50);

        for (Move athlete : athletes) {
            for (Object obs : obstacles)
                if (obs instanceof Wall) {
                    double height = ((Wall) obs).getHeight();
                    if (athlete.jump(height)) {
                        System.out.println("\njump:" + height);
                    } else {
                        System.out.println("\nnot jump:" + height);
                        break;
                    }
                } else {
                    int length = ((Treadmill) obs).getLength();
                    String string = (!athlete.run(length)) ? "not" : "";
                    System.out.println("\n" + string + "run:" + length);
                    break;
                }
        }

    }
}
