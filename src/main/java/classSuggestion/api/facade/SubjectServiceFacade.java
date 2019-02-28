package classSuggestion.api.facade;

import classSuggestion.api.to.SubjectListTO;
import classSuggestion.domain.Subject;
import classSuggestion.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceFacade {

    @Autowired
    private SubjectService subjectService;

    public SubjectListTO missingSubjects(List<Integer> takenIds){
         return new SubjectListTO(subjectService.getUnattendedSubjects(takenIds));
    }

}
