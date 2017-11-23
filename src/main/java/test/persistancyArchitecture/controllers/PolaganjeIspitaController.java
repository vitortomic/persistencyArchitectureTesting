/**
 * 
 */
package test.persistancyArchitecture.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import test.persistancyArchitecture.domain.PolaganjeIspita;
import test.persistancyArchitecture.error.exception.ResourceNotFoundException;
import test.persistancyArchitecture.services.PolaganjeIspitaService;

/**
 * @author vitor.tomic
 *
 */
@RestController
public class PolaganjeIspitaController {
	
	@Autowired
	private PolaganjeIspitaService polaganjeIspitaService;
		
	@RequestMapping(value="/polaganje/{polaganjeId}", method=RequestMethod.GET)
	public PolaganjeIspita getById(@PathVariable String polaganjeId) {
		return polaganjeIspitaService.getPolaganje(Integer.valueOf(polaganjeId))
				.orElseThrow(()->new ResourceNotFoundException("Polaganje not found"));
	}
}
