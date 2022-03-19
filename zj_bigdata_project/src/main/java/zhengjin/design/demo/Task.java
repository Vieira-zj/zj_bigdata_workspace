package zhengjin.design.demo;

/**
 * 状态模式
 *
 */
public class Task {

	private TaskState state = new TaskStates.TaskInit();

	public void setState(TaskState state) {
		this.state = state;
	}

	public TaskState getState() {
		return this.state;
	}

	public void updateState(TaskActionType actionType) {
		state.update(this, actionType);
	}

}
