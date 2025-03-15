package edu.icet.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="exam")
public class ExamEntity {
    private Integer id;
    private String examName;
    private String description;
    private Integer courseId;
    private String timeLimit;
    private Integer passingScore;
    private Integer questionCount;

}
