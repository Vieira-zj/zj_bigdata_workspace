package zhengjin.design.demo;

public class Strategies {

	public static class StrategyHello extends AbstractStrategy {

		private static final StrategyHello instance = new StrategyHello();

		public static StrategyHello getInstance() {
			return instance;
		}

		private StrategyHello() {
			this.register();
		}

		@Override
		public void exec() {
			System.out.println("Strategy Hello");
		}
	}

	public static class StrategyFoo extends AbstractStrategy {

		private static final StrategyFoo instance = new StrategyFoo();

		public static StrategyFoo getInstance() {
			return instance;
		}

		private StrategyFoo() {
			this.register();
		}

		@Override
		public void exec() {
			System.out.println("Strategy Foo");
		}
	}

	public static class StrategyBar extends AbstractStrategy {

		private static final StrategyBar instance = new StrategyBar();

		public static StrategyBar getInstance() {
			return instance;
		}

		private StrategyBar() {
			this.register();
		}

		@Override
		public void exec() {
			System.out.println("Strategy Bar");
		}
	}

}
