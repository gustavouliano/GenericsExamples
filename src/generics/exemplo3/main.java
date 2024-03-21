package generics.exemplo3;

public class main {

	public static void main(String[] args) {
		
		UserController userController = new UserController(new UserRepository());
		userController.createUser("Fulano");
	}

}
