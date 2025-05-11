package Decorator;

public interface Books {
    double cost();
    String description();
}

class ThinBooks implements Books {
    public double cost() {
        return 1.00;
    }

    public String description() {
        return "Thin book";
    }
}

abstract class BookDecorator implements Books {
    protected Books books;

    public BookDecorator(Books books) {
        this.books = books;
    }
}

class CoverDecorator extends BookDecorator {
    public CoverDecorator(Books books) {
        super(books);
    }

    public double cost() {
        returnt books.cost() + 0.50;
    }

    public String description() {
        return books.description() + " decorated cover"
    }
}

class TitleDecorator extends BookDecorator {
    public TitleDecorator(Books books) {
        super(books);
    }

    public double cost() {
        return boooks.cost() + 0.25;
    }

    public String description() {
        return books.description() + "decorated title";
    }
}


public class DecoratorPatternDemo {
    public static void main(String [] args) {
        Books books = new ThinBook();
        System.out.println(books.description() + " $" + books.cost());

        books = new CoverDecorator(books);
        System.out.println(books.description() + " $" + books.cost());

        books = new TitleDecorator(books):
        System.out.println(books.description() + " $" + books.cost());
    }
}