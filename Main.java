class Main{
    
    public static void main(String[] args){
        System.out.println("Hola Mundo");
        Car car  = new Car("AWE234", new Account("Alejandro Jose", "WED744"));
        car.passegenger = 4;
        car.printDataCar();

        Car car2 = new Car("WWC344", new Account("Estefany Yolo", "EHG786"));
        car2.passegenger = 3;
        car2.printDataCar();
    }
    
}