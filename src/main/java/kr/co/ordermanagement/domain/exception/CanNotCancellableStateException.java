package kr.co.ordermanagement.domain.exception;

public class CanNotCancellableStateException extends Throwable {
    public CanNotCancellableStateException(String message) {
        super(message);
    }
}
