package classSuggestion.service;

import classSuggestion.domain.Subject;
import classSuggestion.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public Optional<Subject> getSubject(Integer id) {
        return this.subjectRepository.findById(id);
    }

    public List<Subject> getUnattendedSubjects(List<Integer> subjectsIds) {
        return this.subjectRepository.findMissingSubjects(subjectsIds);
    }
}