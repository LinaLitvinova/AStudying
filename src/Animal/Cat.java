package Animal;

public class Cat extends Mammal implements HasAFur {
    @Override
    public void fur() {
        System.out.print("the git cat has a fur");
    }

    @Override
    public void spine(){
        System.out.println(" also it has a spine.");
    }
}
