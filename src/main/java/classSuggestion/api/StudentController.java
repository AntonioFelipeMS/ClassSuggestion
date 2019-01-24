package classSuggestion.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
@RequestMapping(value = "")
public class StudentController {

    @GetMapping(value = "/result")
    public ResponseEntity<String> getClassList(@RequestBody ArrayList<Integer> request, @RequestBody Integer amount)
    {
        return ResponseEntity.ok("Spring boot is running cozy and warm!");
    }
}