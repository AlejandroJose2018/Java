import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car{

    //atributos solo para uber black 
    //catalogo de los carros aceptados
    Map<String, ArrayList<String,Integer>> typeCarAccepted;
    //no olvides pasar este dato como parametros para que alguien eliga el tipo de carrozz

    ArrayList<String> seatsMaterial;
    //el material de los asientos

    public UberVan(String license, Account driver, Map<String, 
    ArrayList<String,Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}