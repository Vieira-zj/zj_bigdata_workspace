package zhengjin.design.demo;

import org.junit.Test;

/**
 * Build模式 测试
 *
 */
public class TestUser {

	@Test
	public void TestBuildUser() {
		User user = User.newBuilder(101, "Bar").setAge(17).setDesc("ut").build();
		System.out.println(user);

		user = User.newBuilder(102, "Foo").setAge(21).setDesc("it").build();
		System.out.println(user);
	}

}
