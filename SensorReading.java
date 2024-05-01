import com.pi4j.io.gpio.*;
import com.pi4j.io.gpio.event.*;

public class SensorReading {
    public static void main(String[] args) throws InterruptedException {
        // Create GPIO controller instance
        final GpioController gpio = GpioFactory.getInstance();
        
        // Define the GPIO pin connected to the sensor
        final GpioPinDigitalInput sensorPin = gpio.provisionDigitalInputPin(RaspiPin.GPIO_04, PinPullResistance.PULL_DOWN);

        // Loop to continuously read sensor data
        while (true) {
            // Read the state of the sensor pin
            if (sensorPin.isHigh()) {
                System.out.println("Motion detected!");
            } else {
                System.out.println("No motion detected.");
            }
            
            // Wait for a short duration before reading again
            Thread.sleep(1000); // Sleep for 1 second
        }
    }
}