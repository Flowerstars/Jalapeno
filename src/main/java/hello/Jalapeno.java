package hello;

import org.joda.time.LocalTime;
public class Jalapeno {
    private String jalapeno;
    
    Jalapeno (String jalapeno) {
        this.jalapeno = jalapeno;
    }

    public String getJalapeno() {
        return this.jalapeno;
    }

    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current lcoal time is: " + currentTime);

        Greeting greeting = new Greeting();
        Jalapeno jalapeno = new Jalapeno("Season Jalapeno");
        greeting.sayHello();
        System.out.println(jalapeno.getJalapeno());
    }

}
