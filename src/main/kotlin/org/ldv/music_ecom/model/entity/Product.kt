package org.ldv.music_ecom.model.entity


import jakarta.persistence.*
import java.time.LocalDate

@Entity
class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id:Int?=null,
    var title : String,
    var image : String,
    var price : Double,
    var stock :Int,
    var realeaseDate : LocalDate,
    var nbVente : Int,

    //Association avec Project (Product est le maitre de l'association)'
    @ManyToOne
    @JoinColumn(name = "project_id")
    var project: Project? = null

    ) {

}