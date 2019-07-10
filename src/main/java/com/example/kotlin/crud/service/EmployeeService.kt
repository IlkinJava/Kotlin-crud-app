package com.example.kotlin.crud.service

import com.example.kotlin.crud.exception.WrongDataException
import com.example.kotlin.crud.model.Employee
import com.example.kotlin.crud.repository.EmployeeRepository
import org.springframework.stereotype.Service

@Service
class EmployeeService(private val repository: EmployeeRepository) {
    fun updateEmployee(id: Int, employee: Employee): Employee =
            if (id == employee.id) repository.save(employee) else throw WrongDataException("Id is not correct")

    fun getEmployees(): List<Employee> = repository.findAll()

    fun deleteEmployee(id: Int) = repository.deleteById(id)

    fun addEmployee(employee: Employee): Employee = repository.save(employee)
}