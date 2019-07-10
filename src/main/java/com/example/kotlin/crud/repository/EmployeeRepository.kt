package com.example.kotlin.crud.repository

import com.example.kotlin.crud.model.Employee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository : JpaRepository<Employee,Int>