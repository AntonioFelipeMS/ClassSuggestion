package classSuggestion.api.facade;

import classSuggestion.domain.Subject;
import classSuggestion.service.SubjectRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SubjectServiceFacade {

    @Autowired
    SubjectRepositoryService subjectRepositoryService;

    public List<Subject> getUnattendedClasses(List<Integer> ids){

        return subjectRepositoryService.getUnattendedClasses(ids);
    }
}
