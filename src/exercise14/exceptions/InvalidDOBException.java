package exercise14.exceptions;

public class InvalidDOBException extends  RuntimeException{
    public InvalidDOBException(String dob_invalid) {
        super(dob_invalid);
    }
}
