package generics.exemplo3;

public class UserRepository implements BaseRepository<User> {

	@Override
	public User save(User data) {
		System.out.println("Usu�rio " + data.getName() + " salvo com sucesso.");
		// C�digo para salvar o usu�rio (em um database/arquivo)...
		return null;
	}

	@Override
	public User findOne(String id) {
		// C�digo para retornar o usu�rio (em um database/arquivo)...
		return null;
	}

	@Override
	public User[] findAll() {
		// C�digo para retornar todos os usu�rios (em um database/arquivo)...
		return null;
	}

	@Override
	public boolean delete(String id) {
		// C�digo para deletar o usu�rio (de um database/arquivo)...
		return false;
	}

}
