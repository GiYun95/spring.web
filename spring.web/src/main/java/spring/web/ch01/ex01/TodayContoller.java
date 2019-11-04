package spring.web.ch01.ex01;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodayContoller {
	@RequestMapping("/")
	public String home(Model model){
		System.out.println("!!home");
		LocalDate date = LocalDate.now();
		model.addAttribute("today",date);
		return "ch01/ex01/today";		// view의 이름
	}
}