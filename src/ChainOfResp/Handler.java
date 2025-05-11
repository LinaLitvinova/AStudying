package ChainOfResp;

abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler (Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest (int request);
}

class ConcreteHandler extends Handler {
    public void handleRequest(int request) {
        if (request == 1) {
            System.out.println("Handler 1 handlin' request 1");
        } nelse if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

class ConcreteHandler2 extends Handler {
    public void handleRequest (int request){
        if (request == 2) {
            System.out.println("Handler 2 handlin' request 2")
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

public class ChainOfresponsibilityDemo {
    public static void main(String [] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();

        handler.setNextHandler(handler2);

        handler1.handlerRequest(1);
        handler1.handlerRequest(2);
        handler1.handlerRequest(3);
        handler1.handlerRequest(4);
        handler1.handlerRequest(5);
    }
}