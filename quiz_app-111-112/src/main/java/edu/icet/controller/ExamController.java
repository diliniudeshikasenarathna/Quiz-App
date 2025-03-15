package edu.icet.controller;

import edu.icet.dto.Exam;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/exam")
public class ExamController {

    @PostMapping("/create-exam")
    public void createExam(@RequestBody Exam exam){

    }


}
