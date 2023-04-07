package com.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Game;
import com.Model.Query;
import com.Model.User;
import com.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("Customer")
public class UserController {
	@Autowired
	private UserService userservice;
	
	@PostMapping(value = "register")
	public User registerUser(@Valid @RequestBody User user) throws Exception {
		return userservice.registerUser(user);
	}
	
	@GetMapping(value = "login/{email}/{password}")
	public User loginUser(@PathVariable("email") String email,@PathVariable("password") String password) throws Exception {
		return userservice.loginUser(email, password);
	}
	@PutMapping(value = "BuyAPlaycard/{uid}/{pid}")
	public User BuyAGame(@PathVariable("uid") int uid,@PathVariable("pid") int gid) throws Exception {
		return userservice.addPlaycardToPlayer(uid, gid);
	}
	@PutMapping(value = "AddQuestion/{uid}/{Query}")
	public User AddQuestion(@PathVariable("uid") int uid, @PathVariable("Query") String Query) throws Exception {
		return userservice.AddQuestion(uid, Query);
	}
	@PutMapping(value="updateFeedback/{qid}/{Feedback}")
	public Query updateFeedback(@PathVariable("qid") int qid,@PathVariable("Feedback") String feedback) throws Exception {
		return userservice.UpdateFeedback(qid, feedback);
	}
	@GetMapping(value = "GetUserQuestions/{uid}")
	public List<Query> GetUserQuestions(@PathVariable("uid") int uid) throws Exception{
		return userservice.GetAllUserQuestion(uid);
	}
	@GetMapping(value = "getuserById/{id}")
	public User getuserById(@PathVariable("id") int id) {
		return userservice.getuserById(id);
	}
	@PutMapping(value = "RemovePlayCard/{uid}/{pid}")
	public User RemovePlayCard(@PathVariable("uid") int uid,@PathVariable("pid") int pid) throws Exception {
		return userservice.RemovePlayCard(uid,pid);
		
	}
	@PutMapping(value = "RemoveCards/{uid}")
	public User RemoveCards(@PathVariable("uid") int uid)throws Exception  {
		return userservice.RemoveCards(uid);	
	}
	
	@GetMapping(value = "GetUserGames/{uid}/{pid}")
	public List<Game> GetUserGames(@PathVariable("uid") int uid,@PathVariable("pid") int pid) throws Exception{
		return userservice.GetUserGames(uid,pid);
	}
	
 
}
