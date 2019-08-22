
package com.boss.bes.exam.pojo.DTO.answersheet;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@SuppressWarnings("unused")
public class ExamAnswerSheetRecordTableDataDTO {

    private Date actualEndTime;
    private Date actualStartTime;
    private Date endTime;
    private String examSession;
    private String examiner;
    private BigDecimal objectiveSubjectScore;
    private BigDecimal subjectvieSubjectScore;
    private String tel;
    private String title;

}
