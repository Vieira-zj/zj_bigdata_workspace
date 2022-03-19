package zhengjin.design.demo;

import org.junit.Test;
import org.junit.BeforeClass;

/**
 * 策略模式 测试
 *
 */
public class TestStrategy {

	@BeforeClass
	public static void beforeTest() {
		Strategies.StrategyBar.getInstance();
		Strategies.StrategyFoo.getInstance();
	}

	@Test
	public void TestStrategy01() {
		Strategy s = StrategyContext.getStrategy("StrategyBar");
		s.exec();
	}

	@Test
	public void TestStrategy02() {
		Strategy s = StrategyContext.getStrategy("StrategyFoo");
		s.exec();
	}

}
