package classSuggestion.api;

import classSuggestion.api.facade.SubjectServiceFacade;
import classSuggestion.api.to.SubjectListTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping(value = "")
public class StudentController {

    @Autowired
    private SubjectServiceFacade subjectServiceFacade;

    @GetMapping(value = "/result")
    public ResponseEntity<SubjectListTO> getMissingSubjects(@RequestHeader ArrayList<Integer> request, @RequestHeader(required = false) Integer amount)
    {
        SubjectListTO subjectListTO;
        subjectListTO = subjectServiceFacade.missingSubjects(request);
        return ResponseEntity.status(HttpStatus.OK).body(subjectListTO);
    }
}