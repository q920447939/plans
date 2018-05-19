package com.withmes.plan.config.base.exception;

/**
 * DESC: Manager层异常类
 * @DATE 2015年9月2日上午10:51:47
 */
public class ControllerException extends Exception {

	private static final long serialVersionUID = 356381812673914209L;

	private int errorCode;

	public ControllerException() {
	}

	public ControllerException(String msg) {
		super(msg);
	}

	public ControllerException(Throwable cause) {
		super(cause);
	}

	public ControllerException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public ControllerException(int code, String msg) {
		super(msg);
		this.errorCode = code;
	}

	public ControllerException(int code, String msg, Throwable cause) {
		super(msg, cause);
		this.errorCode = code;
	}

	public int getErrorCode() {
		return this.errorCode;
	}
}
