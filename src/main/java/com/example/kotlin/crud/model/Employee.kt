package com.example.kotlin.crud.model

import javax.persistence.*

@Entity
@Table(name = "employees")
data class Employee(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int = 0,
        var name: String? = null,
        var department: String? = null
)