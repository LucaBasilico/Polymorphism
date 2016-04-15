/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author luca
 */

class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    
    public String startEngine(){
        return "Car-> startEngine()";
    }
    
    public String accelerate(){
        return "Car-> accelerate()";
    }
    
    public String brake(){
        return "Car-> brak()";
    }
}

class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String brake() {
        return "Mitsubishi ->startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi ->accelerate()"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String startEngine() {
        return "Mitsubishi ->brake()"; //To change body of generated methods, choose Tools | Templates.
    }
    
}

/**
     *
     * @author luca
     */
   class Holden extends Car {

        public Holden(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String brake() {
            return "Holden ->startEngine()";
        }

        @Override
        public String accelerate() {
            return "Holden ->accelerate()"; //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String startEngine() {
            return "Holden ->brake()"; //To change body of generated methods, choose Tools | Templates.
        }
    }

/**
     *
     * @author luca
     */
    class Ford extends Car {

        public Ford(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String brake() {
            return "Ford ->startEngine()";
        }

        @Override
        public String accelerate() {
            return "Ford ->accelerate()"; //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String startEngine() {
            return "Ford ->brake()"; //To change body of generated methods, choose Tools | Templates.
        }
    }

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car car= new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        
        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRW 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
        
        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        
        Holden holden = new Holden(6, "Holden verity");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }
    
}
