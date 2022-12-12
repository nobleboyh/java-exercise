package exercise14.exceptions;

public class InvalidFullNameException extends RuntimeException{
    public InvalidFullNameException(String full_name_invalid) {
        super(full_name_invalid);
    }
}
