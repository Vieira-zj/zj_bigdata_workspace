package zhengjin.design.demo;

public enum TaskActionType {

	START(1, "start"), STOP(2, "stop"), ACHIEVE(3, "achieve"), EXPIRE(4, "expire");

	private final int code;
	private final String message;

	private TaskActionType(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return this.code;
	}

	public String getMessage() {
		return this.message;
	}

}
