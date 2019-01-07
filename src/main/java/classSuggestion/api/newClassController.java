package classSuggestion.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "")
public class newClassController {

    @GetMapping(value = "/bla")
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("Spring boot is running cozy and warm!");
    }
}