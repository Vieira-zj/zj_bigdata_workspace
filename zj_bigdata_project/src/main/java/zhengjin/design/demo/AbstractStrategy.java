package zhengjin.design.demo;

public abstract class AbstractStrategy implements Strategy {

	public void register() {
		StrategyContext.registerStrategy(this.getClass().getSimpleName(), this);
	}

}
