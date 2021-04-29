package one.digitalinnovation.personaapi.controller;

import one.digitalinnovation.personaapi.dto.MessageResponseDTO;
import one.digitalinnovation.personaapi.entity.Person;
import one.digitalinnovation.personaapi.repository.PersonRepository;
import one.digitalinnovation.personaapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.persistence.metamodel.IdentifiableType;

@RestController
@RequestMapping(path = "/api/v1/people")
public class PersonController {


    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody Person person){
        return personService.createPerson(person);
    }
}
