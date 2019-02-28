package classSuggestion.service;

import classSuggestion.domain.Subject;
import classSuggestion.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public Optional<Subject> getSubject(Long id) {
        return this.subjectRepository.findById(id);
    }

    public List<Subject> getUnattendedSubjects(List<Integer> subjectsIds) {
        return this.subjectRepository.findMissingSubjects(subjectsIds);
    }
}