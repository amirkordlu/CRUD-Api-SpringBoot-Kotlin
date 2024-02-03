package com.amk.student.controller

import com.amk.student.model.Student
import com.amk.student.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StudentController {
    lateinit var studentRepository: StudentRepository

    // DI
    @Autowired
    fun set_Student_Repository(studentRepo: StudentRepository) {
        studentRepository = studentRepo
    }

    // Get all student from database
    @GetMapping("/student")
    fun getAllStudents(): ResponseEntity<ArrayList<Student>> {
        val dataFromDatabase = studentRepository.findAll()
        val dataArrayList = ArrayList<Student>()

        dataFromDatabase.forEach {
            dataArrayList.add(it)
        }
        return ResponseEntity.ok(dataArrayList)
    }

}