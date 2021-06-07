package com.techproedu3.Springmvntutorial4;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResultController {
	
	@RequestMapping("add")
	public String sumOfNumber(HttpServletRequest reg) {
		
		int a = Integer.parseInt(reg.getParameter("n1"));
		int b = Integer.parseInt(reg.getParameter("n2"));
		int sum = a+b;
		HttpSession session = reg.getSession();
		session.setAttribute("sumOfNum", sum);
		
		return "result.jsp";
	}
}

