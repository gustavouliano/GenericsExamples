package generics.exemplo1;

public class Aquario extends Habitat<Peixe> {

	@Override
	public void adiciona(Peixe animal) {
		this.list.add(animal);
	}
	
	
	
}
