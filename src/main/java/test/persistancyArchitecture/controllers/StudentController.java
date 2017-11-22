package test.persistancyArchitecture.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import test.persistancyArchitecture.domain.Ispit;
import test.persistancyArchitecture.domain.Student;
import test.persistancyArchitecture.services.StudentService;

/**
 * @author vitor.tomic
 *
 */
@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/student", method=RequestMethod.GET)
	public Student getStudent(@RequestParam(value="index", required=true) String index){
		Student student = studentService.findByIndex(index);
		return student;
	}
	
	@RequestMapping(value="/student/ispiti", method=RequestMethod.GET)
	public List<Ispit> getStudentIspiti(@RequestParam(value="index", required=true) String index){
		Student student = studentService.findByIndex(index);
		List<Ispit> ispiti = studentService.getAllIspiti(student);
		//List<Ispit> polozeni = studentService.getPolozeniIspiti(student);
		//List<Ispit> padnuti = studentService.getNepolozeniIspiti(student);
		return ispiti;
	}
}
