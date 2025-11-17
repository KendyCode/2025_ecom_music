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
    var trackPosition : Int,
    var diskNumber : Int,
    var rank : Int,
    var realeaseDate: String,
    var preview : String

) {
}