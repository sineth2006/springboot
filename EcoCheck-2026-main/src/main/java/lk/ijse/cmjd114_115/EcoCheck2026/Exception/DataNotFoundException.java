package lk.ijse.cmjd114_115.EcoCheck2026.Exception;

public class DataNotFoundException extends RuntimeException {
    public DataNotFoundException(String message){

        super(message);//passes the custom error message to the constructor of the parent class (RuntimeException).
    }


}
