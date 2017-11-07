package com.anteoy.exception;

/**
 * Created by zhoudazhuang on 17-11-6.
 */
public class StorageException extends RuntimeException {

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
