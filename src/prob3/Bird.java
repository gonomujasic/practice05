package prob3;

/**
 * @author bit
 *
 */
public abstract class Bird {
	
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void fly();
	
	public abstract void sing();

	@Override
	public String toString() {
		return "Bird [name=" + name + "]";
	}
}
