package classSuggestion.api.facade;

import classSuggestion.api.to.SubjectListTO;
import classSuggestion.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectServiceFacade {

    @Autowired
    private SubjectService subjectService;

    public SubjectListTO missingSubjects(String takenIds){

        String[] idList = takenIds.split(",");
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < idList.length; i++) {
            try {
                integers.add(Integer.parseInt(idList[i]));
            } catch (NumberFormatException nfe) {
                throw new NumberFormatException("Error while processing id list!");
            }
        }

        return new SubjectListTO(subjectService.getUnattendedSubjects(integers));
    }

}
