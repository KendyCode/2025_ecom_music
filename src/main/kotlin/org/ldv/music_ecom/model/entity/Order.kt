package org.ldv.music_ecom.model.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
class Order(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id:Int?=null,
    var orderDate : LocalDate,


    ) {

}