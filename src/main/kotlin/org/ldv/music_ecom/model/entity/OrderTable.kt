package org.ldv.music_ecom.model.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
class OrderTable(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id:Int?=null,
    var orderDate : LocalDate,

    //Association avec User (Order est le maitre de l'association)'
    @ManyToOne
    @JoinColumn(name = "user_id")
    var user: User? = null



) {




}