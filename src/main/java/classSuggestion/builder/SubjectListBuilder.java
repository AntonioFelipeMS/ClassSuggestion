package classSuggestion.builder;

import classSuggestion.domain.Subject;
import classSuggestion.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SubjectListBuilder {

    @Autowired
    private SubjectService subjectService;

    public List<Subject> missingSubjects(List<Integer> takenSubjects){
        return subjectService.getUnattendedSubjects(takenSubjects);
    }
}
