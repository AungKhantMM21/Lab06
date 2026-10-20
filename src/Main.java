public static void main(String[] args) {
    Shark shark = new Shark();
    SurgeonFish surgeonFish = new SurgeonFish();
    FlyingShark flyingShark = new FlyingShark();
    Insect insect = new Insect();


    shark.eat(surgeonFish);            // Calls eat(Fish) with SurgeonFish
    shark.eat(new Shark());            // Calls eat(Fish) with Shark

    flyingShark.eat(new Shark());      // Calls eat(Fish)
    flyingShark.eat(insect);           // Calls eat(Flyable)


    Fish fish = new Shark();           // A Shark is-a Fish
    Flyable flyer = new FlyingShark(); // A FlyingShark is-a Flyable
    fish.swim();                       // Calls Shark's swim()
    flyer.fly();                       // Calls FlyingShark's fly()
}