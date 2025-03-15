package edu.icet.controller;

import edu.icet.dto.Exam;
import edu.icet.service.impl.ExamServiceImpl;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/exam")
public class ExamController {

    final ExamServiceImpl service;

    @PostMapping("/create-exam")
    public void createExam(@RequestBody Exam exam){
        service.createExam(exam);
    }


}
