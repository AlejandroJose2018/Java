class Car{
    Integer id;
    String license;
    Account driver;
//  Driver hereda de Account solo estamos creando un nuevo objeto de account
    private Integer passegenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    void printDataCar(){
        System.out.println("License: " + license + " Driver: " + driver.name + "Passagenger: " + passegenger );
    }
}