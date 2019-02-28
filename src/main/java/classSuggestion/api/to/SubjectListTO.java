package classSuggestion.api.to;

import classSuggestion.domain.Subject;

import java.util.List;

public class SubjectListTO {

    private List<Subject> subjectList;

    public SubjectListTO(List<Subject> subjects){

        this.subjectList = subjects;

    }

}
