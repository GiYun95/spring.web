package spring.web.ch01.ex02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ch01/ex02")
public class UserController {
	@RequestMapping("/1")
	public String user1(){
		return "ch01/ex02/user";
	}
	
	@RequestMapping("/2")
	public String user2(Model model){
		model.addAttribute("user", new User("최한석",25));
		return "ch01/ex02/user";
	}
	
	@RequestMapping("/3")
	public void user3(User user){	// 클래스 명이 명시되어 있지 않음으로 class 명을 따서 model 명을 부여함 그러므로'user'라는 모델이 생성 된다.
		user.setName("한아름");
		user.setAge(27);
	}
	
	@RequestMapping("/4")
	public void user4(@ModelAttribute("man")User user){
		user.setName("양승일");
		user.setAge(34);
	}
	
	@RequestMapping("/5")
	public User user5(){		// 모델명은 반환타입명 'User'를 따서 'user'가 모델 명이 된다.
		User user = new User();
		user.setName("김가람");
		user.setAge(45);
		return user;	
	}
	
	@RequestMapping("/6")
	@ModelAttribute("human")
	public User user6(){
		User user = new User();
		user.setName("박현빈");
		user.setAge(27);
		return user;
	}
}
