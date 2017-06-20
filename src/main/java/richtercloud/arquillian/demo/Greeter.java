package richtercloud.arquillian.demo;

import java.io.PrintStream;
import javax.ejb.Stateless;

/**
 * A component for creating personal greetings.
 */
@Stateless
public class Greeter implements GreeterIface{
    @Override
    public void greet(PrintStream to, String name) {
        to.println(createGreeting(name));
    }

    @Override
    public String createGreeting(String name) {
        return "Hello, " + name + "!";
    }
}