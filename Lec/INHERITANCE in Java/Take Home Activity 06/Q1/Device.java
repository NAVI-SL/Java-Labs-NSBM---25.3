public class Device {
   String brand;
   String model;
   boolean isOn;
 
   public void turnOn() {
    isOn = true;
    System.out.println(brand + model + " is now On");
   }

   public void turnOff() {
    isOn = false;
    System.out.println(brand + model + " is now Off");
   }
}
