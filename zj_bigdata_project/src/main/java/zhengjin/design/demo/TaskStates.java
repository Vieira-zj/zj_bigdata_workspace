package zhengjin.design.demo;

public class TaskStates {

	public static class TaskInit implements TaskState {

		@Override
		public void update(Task task, TaskActionType actionType) {
			if (actionType == TaskActionType.START) {
				task.setState(new TaskOngoing());
			}
		}

		@Override
		public String toString() {
			return "Init";
		}
	}

	public static class TaskOngoing implements TaskState {

		@Override
		public void update(Task task, TaskActionType actionType) {
			if (actionType == TaskActionType.STOP) {
				task.setState(new TaskPaused());
			} else if (actionType == TaskActionType.ACHIEVE) {
				task.setState(new TaskFinished());
			} else if (actionType == TaskActionType.EXPIRE) {
				task.setState(new TaskExpired());
			}
		}

		@Override
		public String toString() {
			return "OnGoing";
		}
	}

	public static class TaskPaused implements TaskState {

		@Override
		public void update(Task task, TaskActionType actionType) {
			if (actionType == TaskActionType.START) {
				task.setState(new TaskOngoing());
			} else if (actionType == TaskActionType.EXPIRE) {
				task.setState(new TaskExpired());
			}
		}

		@Override
		public String toString() {
			return "Paused";
		}
	}

	public static class TaskFinished implements TaskState {

		@Override
		public void update(Task task, TaskActionType type) {
			System.out.println("Task already finished");
		}

		@Override
		public String toString() {
			return "Finished";
		}
	}

	public static class TaskExpired implements TaskState {

		@Override
		public void update(Task task, TaskActionType type) {
			System.out.println("Task is expired");
		}

		@Override
		public String toString() {
			return "Expired";
		}
	}

}
