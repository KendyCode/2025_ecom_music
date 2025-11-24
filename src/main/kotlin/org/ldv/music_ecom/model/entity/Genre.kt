package org.ldv.music_ecom.model.entity

import jakarta.persistence.*

@Entity
class Genre(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id:Int?=null,
    var title : String,
    var pictureBaseUrl : String,
    var description : String,

    //Association avec Project
    @OneToMany(mappedBy = "genre",cascade = [CascadeType.ALL], orphanRemoval = true)
    var projects: MutableList<Project> = mutableListOf(),

    ) {

}