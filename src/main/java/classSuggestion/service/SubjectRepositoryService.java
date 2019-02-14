package classSuggestion.service;

import classSuggestion.domain.Subject;
import classSuggestion.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class SubjectRepositoryService {

    @Autowired
    private SubjectRepository subjectRepository;

    public Optional<Subject> getSubject(Integer id) {
        return this.subjectRepository.findById(id);
    }

    public Iterable<Subject> getAllSubjects(){
        return this.subjectRepository.findAll();
    }
}