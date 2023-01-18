public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "man";
        wolf.name = "Пусик";
        wolf.weight = 60;
        wolf.age = 5;
        wolf.color = "grey";

        System.out.println(wolf.gender + " " + wolf.name + " " + wolf.weight + " " + wolf.age + " " + wolf.color);

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}