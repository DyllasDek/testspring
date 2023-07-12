package com.example.demo

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "roles")
class Role {
    @Id @GeneratedValue @Column(name="role_id")
    var id: UUID? = null

    @Column(name = "role")
    var role: String? = ""


}
