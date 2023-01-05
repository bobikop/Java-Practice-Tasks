package CustomExceptions;

public class CustomExceptionTutorial {

    public static void main(String[] args) throws AgelessThanZeroException {

        validateAge(-6);
    }


    private static void validateAge(int age) throws AgelessThanZeroException {

        if(age < 0 ){
            throw  new AgelessThanZeroException("Something went wrong!", new RuntimeException());
        }
    }
}
