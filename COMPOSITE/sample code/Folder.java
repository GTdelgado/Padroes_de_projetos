package appplication.model;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component{
	
	private List<Component>  filesAndFodler = new ArrayList<>();
	
	public Folder(String name) {
		super(name, 0.0f);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public float getSize() {
		float size = 0.f;
		for (Component component : filesAndFodler) {
			size += component.getSize();
		}
		return size;
	}
	
	public void add(Component component) {
		filesAndFodler.add(component);
	}
	
	public boolean remove(Component component) {
		return filesAndFodler.remove(component);
	}
}
