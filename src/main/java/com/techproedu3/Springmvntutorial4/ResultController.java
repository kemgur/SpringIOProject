package com.techproedu3.Springmvntutorial4;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResultController {
/*
	@RequestMapping("add")
	public String result(HttpServletRequest reg) {
		int a = Integer.parseInt(reg.getParameter("n1"));
		int b = Integer.parseInt(reg.getParameter("n2"));

		int sum = a + b;
		int product = a * b;
		double division = a / b;
		int subtract = a - b;

		HttpSession session = reg.getSession();
		session.setAttribute("sumOfNum", sum);
		session.setAttribute("productOfNumbers", product);
		session.setAttribute("divisionOfNumbers", division);
		session.setAttribute("subtractOfNumbers", subtract);
		
		return "result.jsp";	
	}
	
	
	
	@RequestMapping("add")
	public String sumOfNumbers(@RequestParam("n1") int a,
			                   @RequestParam("n2") int b,
			                   @RequestParam("n3") String name,HttpSession session ) {
	
		int sum=a+b;
		int difference=a-b;
		int product=a*b;
		double division=a/b;
		
		session.setAttribute("sumOfNum",sum);
		session.setAttribute("difference", difference);
		session.setAttribute("product", product);
		session.setAttribute("division", division);
		session.setAttribute("name", name);
		
		return "result";
		
	}	
	
	@RequestMapping("add")
	public ModelAndView result(@RequestParam("n1") int a,@RequestParam("n2") int b,@RequestParam("n3") String name) {
			
			   
			    ModelAndView mv=new ModelAndView("result.jsp");
			   
			 
			      
			    int sum=a+b;
			    int product=a*b;
			    double division=a/b;
			    int subtrac=a-b;
			   
			 
			  
			 mv.addObject("sumOfNum", sum);
			 mv.addObject("productOfNumbers", product);
			 mv.addObject("divisionOfNumbers", division);
			 mv.addObject("subtractOfNumbers", subtrac);
			 mv.addObject("nameOfUser", name);
			 
			 return mv;
				
		}
	
	
	
	@RequestMapping("add")
	public ModelAndView sumOfNumbers(@RequestParam("n1") int a,@RequestParam("n2") int b,@RequestParam("n3") String name) {
		
		ModelAndView mw=new ModelAndView("result.jsp");
		
		int sum=a+b;
		int difference=a-b;
		int product=a*b;
		double division=a/b;
		

		mw.addObject("sumOfNum",sum);
		mw.addObject("difference", difference);
		mw.addObject("product", product);
		mw.addObject("division", division);
		mw.addObject("name", name);
		
		
		return mw;	
	}
	
	
	@RequestMapping("add")
	public String sumOfNumbers(@RequestParam("n1") int a,@RequestParam("n2") int b,@RequestParam("n3") String name,Model m) {
		
		
		
		int sum=a+b;
		int difference=a-b;
		int product=a*b;
		double division=a/b;
		

		m.addAttribute("sumOfNum",sum);
		m.addAttribute("difference", difference);
		m.addAttribute("product", product);
		m.addAttribute("division", division);
		m.addAttribute("name", name);
		
		
		return "result";
		
		
	}
	*/
	
	
	
	@RequestMapping("add")
	public String sumOfNumbers(@RequestParam("n1") int a,@RequestParam("n2") int b,@RequestParam("n3") String name,ModelMap mm) {
		
		
		
		int sum=a+b;
		int difference=a-b;
		int product=a*b;
		double division=a/b;
		
		mm.addAttribute("sumOfNum",sum);
		mm.addAttribute("productOfNumbers", difference);
		mm.addAttribute("divisionOfNumbers", product);
		mm.addAttribute("subtractOfNumbers", division);
		mm.addAttribute("nameOfUser", name);
		
		
		return "result";

	}
}
	
	
	
//		@GetMapping("list")
//		public String list(Model m){
//			
//			List<String> student=new ArrayList<>();
//			
//			student.add("serhat");
//			student.add("kemal");
//			student.add("david");
//			student.add("ali");
//			m.addAttribute("student",student);
//			return "result";		
//	}
	
//	@RequestMapping("addStudents")
//	public String addStudents(@RequestParam("id") int id,@RequestParam("name") String name,
//			@RequestParam("grade") int grade,@RequestParam("address") String address,
//			@RequestParam("phone") int phone,Model m) {
//		
//		
//		Students student=new Students(id,name,grade,address,phone);
//		
//		m.addAttribute("studentAdd",student);
//		
//		return "result";
//		
//		
//		
//		
//		
//		
//	
//	}
		
	
	
