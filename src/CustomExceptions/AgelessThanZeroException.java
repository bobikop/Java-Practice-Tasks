package CustomExceptions;

public class AgelessThanZeroException extends Exception{

    public AgelessThanZeroException(){
        //custom no Arg constructor
    }
    public AgelessThanZeroException(String message){
        super(message); // call Exception class constructor version
    }

    public AgelessThanZeroException(Throwable cause){
        super(cause);
    }

    public AgelessThanZeroException(String message, Throwable cause){
        super(message,cause);
    }

}
