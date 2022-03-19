package zhengjin.design.demo;

/**
 * Build模式
 *
 */
public class User {

	private long id;
	private String name;
	private int age;
	private String desc;

	private User(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.age = builder.age;
		this.desc = builder.desc;
	}

	public static Builder newBuilder(long id, String name) {
		return new Builder(id, name);
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDesc() {
		return desc;
	}

	@Override
	public String toString() {
		return String.format("id=%d,name=%s,age=%d,desc=[%s]", this.id, this.name, this.age, this.desc);
	}

	public static class Builder {

		private long id;
		private String name;
		private int age;
		private String desc;

		public Builder(long id, String name) {
			if (id < 0) {
				throw new IllegalArgumentException("id should be greater than 0.");
			}
			if (name == null) {
				throw new NullPointerException("name is null.");
			}
			this.id = id;
			this.name = name;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public Builder setDesc(String desc) {
			this.desc = desc;
			return this;
		}

		public User build() {
			return new User(this);
		}
	}

}
