package com.example.kotlin.crud.controller

import com.example.kotlin.crud.model.Employee
import com.example.kotlin.crud.service.EmployeeService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("Employees")
class EmployeeController(private var service: EmployeeService) {

    @GetMapping
    fun getEmployees(): List<Employee> = service.getEmployees()

    @PostMapping
    fun addEmployee(@RequestBody employee: Employee): Employee = service.addEmployee(employee)

    @PutMapping("/{id}")
    fun updateEmployee(@PathVariable id: Int,
                       @RequestBody employee: Employee): Employee = service.updateEmployee(id, employee)


    @DeleteMapping("/{id}")
    fun deleteEmployee(@PathVariable id: Int) = service.deleteEmployee(id)

}