package generics.exemplo1;

import java.util.ArrayList;

public abstract class Habitat <T extends Animal> {
	
	ArrayList<T> list = new ArrayList<>();
	
	public abstract void adiciona(T animal);

}
