package org.ldv.music_ecom.model.entity
import jakarta.persistence.*
import java.time.LocalDate

@Entity
class Project(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id:Int?=null,
    var title : String,
    var coverBaseUrl : String,
    var genreId : Int,
    var explicitLyricId : Int,
    var description : String,
    var realeaseDate : LocalDate,


) {

}