package org.ldv.music_ecom.model.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import java.time.LocalDate

@Entity
class Person(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id:Int?=null,
    var name: String,
    var pictureBaseUrl : String?=null,
    var description : String,

    //Associaiton One to Many avec TrackPersonRole
    @OneToMany(mappedBy = "person", orphanRemoval = true)
    var trackPersonRoles: MutableList<TrackPersonRole> = mutableListOf(),



    ) {

}