package generics.exemplo3;

public class UserController {
	
	private BaseRepository<User> repository;
	
	public UserController(BaseRepository<User> repository) {
		this.repository = repository;
	}
	
	public boolean createUser(String name) {
		if (name.length() > 3) {
			this.repository.save(new User(name));
			return true;
		}
		return false;
	}

}
