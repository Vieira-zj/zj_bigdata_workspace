package zhengjin.design.demo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * 状态模式 测试
 *
 */
public class TestTask {

	@Test
	public void TestTaskFinish() {
		Task task = new Task();
		List<TaskActionType> actions = new ArrayList<>();
		actions.add(TaskActionType.START);
		actions.add(TaskActionType.STOP);
		actions.add(TaskActionType.START);
		actions.add(TaskActionType.ACHIEVE);
		actions.add(TaskActionType.STOP);

		for (TaskActionType action : actions) {
			System.out.println("set action: " + action.getMessage());
			task.updateState(action);
			System.out.println("task state: " + task.getState());
		}
	}

	@Test
	public void TestTaskExpire() {
		Task task = new Task();
		List<TaskActionType> actions = new ArrayList<>();
		actions.add(TaskActionType.START);
		actions.add(TaskActionType.STOP);
		actions.add(TaskActionType.EXPIRE);
		actions.add(TaskActionType.START);

		for (TaskActionType action : actions) {
			System.out.println("set action: " + action.getMessage());
			task.updateState(action);
			System.out.println("task state: " + task.getState());
		}
	}

}
