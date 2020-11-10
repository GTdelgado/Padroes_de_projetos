import java.util.ArrayList;
import java.util.List;

public class CareTakerConta {
	private List<MementoConta> list = new ArrayList<>();

	public void add(MementoConta memento) {
		this.list.add(memento);
	}

	public void remove(MementoConta memento) {
		this.list.remove(memento);
	}

	public MementoConta getState(int index) {
		return list.get(index);
	}
}
