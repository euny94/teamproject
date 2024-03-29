package day02_01;

public class PasswordChangeService {
	
	private UserRepository userRepository;
	
	public PasswordChangeService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public void chaangePassword(String userId, String oldPw, String newPw) {
		User user = userRepository.findUserById(userId);
		if (user == null)
			throw new UserNotFoundException();
		
		user.changePassword(oldPw, newPw);
	}

}
