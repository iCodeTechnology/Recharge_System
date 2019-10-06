package com.rechargesystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RechargeSystemController {
	/*
	@Autowired
	private EmployeeService employeeService;
	*/
	@RequestMapping("/")
	public ModelAndView applicationLogin() {
		ModelAndView mv= new ModelAndView("index");
		return mv;	
	}
	
	@RequestMapping("/about-us")
	public ModelAndView aboutUs() {
		ModelAndView mv= new ModelAndView("Web/about");
		return mv;
	}
	
	@RequestMapping("/contact-us")
	public ModelAndView contactUs() {
		ModelAndView mv= new ModelAndView("Web/contact");
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView Login() {
		ModelAndView mv= new ModelAndView("Web/login");
		return mv;
	}
	/*
	@RequestMapping("/demo")
	public ModelAndView demo() {
		ModelAndView mv=new ModelAndView("demo");
		mv.addObject("employee", employeeService.getAllEmployees());
		System.out.println("Demo");
		return mv;
	}
	
	@RequestMapping("/create-new")
	public String createEmployee(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "create_employee";
	}
	
	@RequestMapping(path = "/createEmployee", method = RequestMethod.POST)
    public String saveEmployee(@ModelAttribute("Employee") Employee employee)
    {
		employeeService.saveEmployee(employee);
        return "redirect:/demo";
    }
	
	
	@RequestMapping("/edit/{id}")
    public ModelAndView editEmployee(@PathVariable(name = "id") Long id)
    {
        ModelAndView mav = new ModelAndView("edit_employee");
        Employee employee = employeeService.getEmployee(id);
        mav.addObject("employee", employee);
        return mav;
    }
	
	@RequestMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable(name = "id") Long id) {
		
		employeeService.deleteEmployee(id);
		
		return "redirect:/demo";
	}*/

}
