public class Car {
    /*Attributes*/ 
    public int size;
    public String color;
    public String model;
     
    public static void main(String[] args) {     
        //moveForward();
        //moveBackward();
        //stop();
        //turnOnLight();
        //turnOffLight();
        Car redCar = new Car();
        redCar.color = "red";
        redCar.model ="Benz";
        redCar.size = 4;
        // System.out.println("Car color: " + redCar.color);
        // System.out.println("Car size: "+ redCar.size);
        // System.out.println("Car model: "+ redCar.model);

        Car blueCar = new Car();
        blueCar.color = "blue";
        blueCar.model ="Benz";
        blueCar.size = 4;
        // System.out.println("Car color: " + blueCar.color);
        // System.out.println("Car size: "+ blueCar.size);
        // System.out.println("Car model: "+ blueCar.model);

    }

    /*Methods */
    public  void moveForward() {
        System.out.println(this.color +" moveForward");
    }        
    public  void moveBackward() {
        System.out.println("moveBackward");
    }        
    public  void stop() {
        System.out.println("stop");
    }        
    public  void turnOnLight() {
        System.out.println(this.color +" turnOnLight");
    } 
    public  void turnOffLight() {
        System.out.println(this.color +" turnOffLight");
    } 
}