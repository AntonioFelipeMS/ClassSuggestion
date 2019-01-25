package classSuggestion.repository;

import classSuggestion.domain.Subject;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SubjectRepository extends CrudRepository<Subject, Integer> {

    @Query("select s from Subject s where subject.id not in := list")
    List<Subject> notAttendedYet(@Param("list") List<Integer> list);
}
