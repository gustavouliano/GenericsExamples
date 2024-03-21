package generics.exemplo3;

public class UserRepository implements BaseRepository<User> {

	@Override
	public User save(User data) {
		System.out.println("Usuário " + data.getName() + " salvo com sucesso.");
		// Código para salvar o usuário (em um database/arquivo)...
		return null;
	}

	@Override
	public User findOne(String id) {
		// Código para retornar o usuário (em um database/arquivo)...
		return null;
	}

	@Override
	public User[] findAll() {
		// Código para retornar todos os usuários (em um database/arquivo)...
		return null;
	}

	@Override
	public boolean delete(String id) {
		// Código para deletar o usuário (de um database/arquivo)...
		return false;
	}

}
