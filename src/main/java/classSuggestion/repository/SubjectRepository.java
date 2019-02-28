package classSuggestion.repository;

import classSuggestion.domain.Subject;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {

    @Query("FROM Subject s WHERE s.id NOT in:idList")
    List<Subject> findMissingSubjects(@Param("idList") List<Integer> subjectIds);
}
