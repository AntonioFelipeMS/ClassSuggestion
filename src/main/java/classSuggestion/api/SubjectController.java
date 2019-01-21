package classSuggestion.api;

import classSuggestion.api.to.ClassListTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "")
public class StudentController {

    @GetMapping(value = "/result")
    public ResponseEntity<String> getClassList(@RequestBody ClassListTO request)
    {

        return ResponseEntity.ok("Spring boot is running cozy and warm!");
    }
}