package exercise14.exceptions;

public class InvalidPhoneNumberException extends RuntimeException{
    public InvalidPhoneNumberException(String phone_invalid) {
        super(phone_invalid);
    }
}
