//Abstraction

abstract class MobileUser {
    abstract void sendMessage();
}

class Shakinul extends MobileUser {
    @Override
    void sendMessage() {
        System.out.println("Hi, I'm Shakinul");
    }
}

class Afia extends MobileUser {
    @Override
    void sendMessage() {
        System.out.println("Hi, I'm Afia");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        MobileUser mu; // reference variable
        mu = new Shakinul();
        mu.sendMessage();

        mu = new Afia();
        mu.sendMessage();
    }
}
