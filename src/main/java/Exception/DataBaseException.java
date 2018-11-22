package Exception;

public class DataBaseException extends VikingGameException {
    public DataBaseException(String message) {
        super("Not found in DB");
    }
}
