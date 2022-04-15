public class Bat {
    int energy = 0;

    int energyLevel(){
        System.out.printf("Energy is at: %s", energy);
        return energy;
}

    public Bat(int energy){
        this.energy = energy;
}

    public void eatHumans(){
        System.out.println("I wanna suck your blood");
        energy += 25;
    }

    public void fly(){
        System.out.println("You hear the bat fly away");
        energy -= 50;
    }

    public void attackTown(){
        System.out.println("Goes to attack town but finds a garlic shop");
        energy -= 100;

    }
}


