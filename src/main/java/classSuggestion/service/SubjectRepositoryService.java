package classSuggestion.service;

import classSuggestion.domain.Subject;
import classSuggestion.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SubjectRepositoryService {

    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subject> getUnattendedClasses(List<Integer> ids){

        return subjectRepository.notAttendedYet(ids);
    }
}