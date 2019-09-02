class UberPool extends Car{
    String brand;
    String model;

    public UberPool(String license, Account driver, String brand, String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;
        // super tendras accesos ala clase padre super hacereferencia ala clse padre y 
        //this hace referencia ala clase hijo
    }
}