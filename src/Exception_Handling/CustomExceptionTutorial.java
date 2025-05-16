package Exception_Handling;

public class CustomExceptionTutorial  {

    public static void main(String[] args) throws AgeLessThanZeroException {
        validateAge(3);
        validateAge(-1);
    }


    private static void validateAge(int age) throws AgeLessThanZeroException {
        if(age < 0) {
//            throw new AgeLessThanZeroException("Age cannot be negative");
//            throw new AgeLessThanZeroException(new RuntimeException());
            throw new AgeLessThanZeroException("Oh, no!!", new RuntimeException());
        }


    }
}
