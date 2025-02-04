package org.flow.testgit;



@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/user")
	public void saveUser(@RequestBody User user) {
		userService.saveUser(user);
	}

	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
	}
}