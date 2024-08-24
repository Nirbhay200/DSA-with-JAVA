package Basics;

public class Hello {
    private Hello(){
    }

    static Hello h1 = new Hello();
    static Hello   getObject(){
        return h1;
    }
    void show(){
        System.out.println("Hello World");
    }
}

class DemoSing1{
    public static void main(String[] args){

        Hello hh = Hello.getObject();
        hh.show();
    }
}

