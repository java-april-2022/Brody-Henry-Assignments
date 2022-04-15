public class BatTest {
    public static void main(String[] args){
        Bat dracula = new Bat(300);

        dracula.energyLevel();
        dracula.attackTown();
        dracula.attackTown();
        dracula.fly();
        dracula.eatHumans();
        dracula.energyLevel();
        dracula.eatHumans();
        dracula.attackTown();
        dracula.fly();
        dracula.energyLevel();
    }
}
