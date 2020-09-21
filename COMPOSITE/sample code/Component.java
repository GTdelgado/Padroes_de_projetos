package appplication.model;

public abstract class Component{
	private String name;
	private float size;
	
	public Component(String name, float size) {
		this.name = name;
		this.size = size;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void add(Component component) {
	}
	
	public boolean remove(Component component) {
		return false;
	}
}
