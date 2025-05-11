package Proxy;

public interface Image {
    void display();
}

class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading " + filename);
    }

    public void display() {
        System.out.println("Displaying " + filename);
    }
}

public class ProxyPatternDemo {
    public static void main(String [] args) {
        Image image = new ProxyImage("text_image.jpg");
        image.display();
        image.display();
    }
}