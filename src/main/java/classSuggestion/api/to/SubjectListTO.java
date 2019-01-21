package classSuggestion.api.to;

import classSuggestion.domain.Subject;

import java.util.List;

public class SubjectListTO {

    private List<Subject> subjectList;

    public void setSubjectList(List<Subject> classList){
        this.subjectList = classList;
    }

    public List<Subject> getSubjectList(List<Class> classList){
        return subjectList;
    }

}
