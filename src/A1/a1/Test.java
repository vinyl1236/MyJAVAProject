package A1.a1;

import java.util.concurrent.Semaphore;

public class Test {
    public static void main(String[] args) {
        Semaphore Driver = new Semaphore(1);
        Semaphore TanPolice = new Semaphore(0);

        Driver driver = new Driver(Driver, TanPolice);
        TanPolice tanpolice = new TanPolice(TanPolice, Driver);

        driver.setName("司机:");
        tanpolice.setName("谭警官:");

        driver.start();
        tanpolice.start();

    }
}
