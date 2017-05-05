package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.entity.Department;
import com.example.entity.Employee;
import com.example.entity.Meetings;
import com.example.service.DepartmentService;
import com.example.service.EmployeeService;
import com.example.service.MeetingService;

@Controller
public class DenemeController {

	@Autowired
	EmployeeService es;
	
	@Autowired
	DepartmentService ds;
	
	@Autowired
	MeetingService ms;
	
	  // employee part 
	
	@RequestMapping("/employeepage")
	public String goster(Model model){
		model.addAttribute("employee", new Employee());
		model.addAttribute("employees", es.findAll());
	
		return "employee";
	}
	
	@RequestMapping(path = "/addEmployee", method = RequestMethod.POST)
    public String employeeAdd( Employee employee, Model model) {
		es.save(employee);
       return "employee";
    }
	
	@RequestMapping(path = "/delete/{id}", method = RequestMethod.POST)
    public String employeeDelete(@PathVariable("id") Long id) {
		es.delete(es.findEmployeeById(id));
       return "employee";
    }
	
	@RequestMapping(path = "/getEmployee", method = RequestMethod.GET, consumes = "application/json")
    public @ResponseBody
        List<Employee> employeeGet() {
		
        return es.findAll();
    }
	
	
	// department  part 
	
	@RequestMapping("/departmentpage")
	public String gosterdepartment(Model model){

		model.addAttribute("department", new Department());
		model.addAttribute("departments", ds.findAll());
		return "department";
    
	}
	
	@RequestMapping(path = "/addDepartment", method = RequestMethod.POST)
    public String departmentAdd(Department department, Model model) {
		ds.save(department);
       return "department";
    }
	
	@RequestMapping(path = "/getDepartment", method = RequestMethod.GET, consumes = "application/json")
    public @ResponseBody
    
        List<Department> departmentGet() {
		
        return ds.findAll();

	}
	// department  part sonu//

	 
	// meeting part başı
	
	@RequestMapping("/meetingpage")
	public String gostermeeting(Model model){

		model.addAttribute("meeting", new Meetings());
		model.addAttribute("meetings", ms.findAll());
		return "meeting";
    
	}
	
	@RequestMapping(path = "/addMeetings", method = RequestMethod.POST)
    public String meetingAdd(Meetings meeting, Model model) {
		ms.save(meeting);
       return "meeting";
    }
	
	@RequestMapping(path = "/getMeeting", method = RequestMethod.GET, consumes = "application/json")
    public @ResponseBody
    
        List<Meetings> meetingGet() {
		
        return ms.findAll();

	}
	
	// meeting part son//

}
