package Animal;

public class Fish extends Animal implements LiveInWater {
    @Override
    public void water(){
        System.out.println("the lives in water");
    }
}
