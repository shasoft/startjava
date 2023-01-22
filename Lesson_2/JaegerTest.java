public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("Gipsy Danger", "Mark-3", "USA", 8);
        if (jaeger1.drift())
            jaeger1.move();
        jaeger1.print("Робот 1");

        Jaeger jaeger2 = new Jaeger("", "", "", 0);
        jaeger2.setModelName("Striker Eureka");
        jaeger2.setMark("Mark-5");
        jaeger2.setOrigin("Australia");
        jaeger2.setStrength(10);
        System.out.println(jaeger2.scanKiju());
        jaeger2.useVortexCannon();
        jaeger2.print("Робот 2");
    }
}