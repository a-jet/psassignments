package com.sapient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
	@Autowired
	private StudentDao st;
	@RequestMapping("/student")
	public String stud() {
		return "student.jsp";
	}
	@RequestMapping("search")
	public String sear(@RequestParam("id") int id,ModelMap m) {
		Student res=st.find(id);
		if(res==null) {
			return "notfound.jsp";
		}
		m.addAttribute("res", res);
		return "result.jsp";
	}
}
