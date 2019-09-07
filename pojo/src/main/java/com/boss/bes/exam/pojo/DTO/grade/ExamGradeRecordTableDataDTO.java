
package com.boss.bes.exam.pojo.DTO.grade;

import lombok.Data;

import java.util.Date;

@Data
@SuppressWarnings("unused")
public class ExamGradeRecordTableDataDTO {

    private Long id;
    private Date actualEndTime;
    private String examSession;
    private String examiner;
    private Date markingStopTime;
    private Double objectiveSubjectScore;
    private Long paperId;
    private Date createdTime;
    private Byte status;
    private Double subjectvieSubjectScore;
    private String systemEvaluate;
    private String tel;

}
