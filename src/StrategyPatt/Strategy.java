package StrategyPatt;

public interface Strategy {
    int execute (int a, int b);
}

class Addition implements Strategy {
    public int execute (int a, int b) {
        return a + b:
    }
}

class Subtraction implements Strategy {
    public int execute (int a, int b) {
        return a - b;
    }
}

class Context {
    private Strategy strategy;

    public Context (Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy (int a, int b) {
        return strategy.execute(a, b);
    }
}

public class StrategyPetternDemo {
    public static void main( String [] args) {
        Context context = new Context (new Addition());
        System.out.println("20 + 15 = " + context.executeStrategy(20, 15));

        context = new Context(new Substraction());
        System.out.println("20 - 15 = " + context.executeStrategy(20, 15));
    }
}
