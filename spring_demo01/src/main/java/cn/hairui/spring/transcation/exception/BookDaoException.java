package cn.hairui.spring.transcation.exception;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/2/22 23:30
 */
public class BookDaoException extends  RuntimeException {

    public BookDaoException() {
    }

    public BookDaoException(String message) {
        super(message);
    }

    public BookDaoException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookDaoException(Throwable cause) {
        super(cause);
    }

    public BookDaoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
