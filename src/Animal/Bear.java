package Animal;

public class Bear extends Mammal implements HasAFur {
    @Override
    public void fur(){
        System.out.print("the bear has a fur");
    }

    @Override
    public void spine(){
        System.out.println(" it also has a spine");
    }
}
