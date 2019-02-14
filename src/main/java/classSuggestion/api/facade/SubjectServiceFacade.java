package classSuggestion.api.facade;

import classSuggestion.domain.Subject;
import classSuggestion.service.SubjectRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SubjectServiceFacade {

    @Autowired
    private SubjectRepositoryService subjectRepositoryService;

    /*
    public List<Subject> getUnattendedClasses(List<Integer> ids){

        Iterable<Subject> allSubjects = subjectRepositoryService.getAllSubjects();
        ArrayList<Integer> subjectIds = new ArrayList<>();
        allSubjects.forEach(s -> {
            subjectIds.add(s.getId());
        });

    }

    private List<Integer>
    */
}
