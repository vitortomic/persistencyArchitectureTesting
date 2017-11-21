package test.persistancyArchitecture.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
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
		student.setProsek(studentService.getProsecnaOcena(student));
		return student;
	}
}
