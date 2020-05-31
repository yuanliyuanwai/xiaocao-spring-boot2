package in.xiaocao.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.xiaocao.model.User;
import in.xiaocao.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/getUsers")
	public List<User> getUsers() {
		List<User> users = userRepository.findAll();
		return users;
	}
}