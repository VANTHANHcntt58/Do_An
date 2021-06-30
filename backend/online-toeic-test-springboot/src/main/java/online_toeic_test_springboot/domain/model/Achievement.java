package online_toeic_test_springboot.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Achievement {
    private Integer id;
    private Integer examineeId;
    private Integer testId;
    private String date;
    private Integer totalCorrectAnswer;
    private String testName;
    private List<ExamineeAnswer> examineeAnswers;
}
