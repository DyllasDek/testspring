package com.example.demo

import jakarta.persistence.*
import org.springframework.data.annotation.Id
import java.util.*

@Entity
@Table(name = "roles")
class Role {
    @Id
    @GeneratedValue()
    var id: UUID? = null

    @Column(name = "role")
    var role: String? = ""


}
