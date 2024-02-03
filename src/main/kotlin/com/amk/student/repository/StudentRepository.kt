package com.amk.student.repository

import com.amk.student.model.Student
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository : CrudRepository<Student, String> {
// CRUD operation
}