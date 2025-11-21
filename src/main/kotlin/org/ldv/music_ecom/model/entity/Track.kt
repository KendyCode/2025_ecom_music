package org.ldv.music_ecom.model.entity

import jakarta.persistence.*

@Entity
class Track (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id:Int?=null,
    var readable : Boolean,
    var title : String,
    var titleShort : String,
    var isrc : String,
    var duration : Int,
    var rank : Int,
    var realeaseDate: String,
    var preview : String,

    //Associaiton One to Many avec PositionAsso
    @OneToMany(mappedBy = "track", orphanRemoval = true)
    var positionAssos: MutableList<PositionAsso> = mutableListOf(),

    //Associaiton One to Many avec TrackPersonRole
    @OneToMany(mappedBy = "track", orphanRemoval = true)
    var trackPersonRoles: MutableList<TrackPersonRole> = mutableListOf(),



    ) {
}