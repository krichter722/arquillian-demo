package richtercloud.arquillian.demo;

import java.io.PrintStream;
import javax.ejb.Local;

/**
 *
 * @author richter
 */
@Local
public interface GreeterIface {

    void greet(PrintStream to, String name);

    String createGreeting(String name);
}
