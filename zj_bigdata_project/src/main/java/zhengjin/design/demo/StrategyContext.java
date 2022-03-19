package zhengjin.design.demo;

import java.util.HashMap;
import java.util.Map;

public class StrategyContext {

	private static final Map<String, Strategy> registerMap = new HashMap<>();

	public static void registerStrategy(String name, Strategy strategy) {
		registerMap.put(name, strategy);
	}

	public static Strategy getStrategy(String name) {
		return registerMap.get(name);
	}

}
