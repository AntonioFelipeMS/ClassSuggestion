package classSuggestion.api.facade;

import classSuggestion.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;

public class SubjectServiceFacade {

    @Autowired
    private SubjectService subjectRepositoryService;

}
