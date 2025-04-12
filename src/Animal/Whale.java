package Animal;

public class Whale extends Mammal implements LiveInWater {
    @Override
    public void water(){
        System.out.print("the whale lives in water");
    }

    @Override
    public void spine(){
        System.out.println(" and it has a spine");
    }
}
