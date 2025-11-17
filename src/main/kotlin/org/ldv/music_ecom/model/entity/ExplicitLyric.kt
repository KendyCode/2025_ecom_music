package org.ldv.music_ecom.model.entity


import jakarta.persistence.*

@Entity
class ExplicitLyric(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id:Int?=null,
    var title : String

) {
}