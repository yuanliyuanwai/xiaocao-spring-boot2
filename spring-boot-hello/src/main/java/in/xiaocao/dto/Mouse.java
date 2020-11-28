package in.xiaocao.dto;

public class Mouse {
	
	private String name;
	
	public Mouse(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Mouse [name=" + name + "]";
	}
}
