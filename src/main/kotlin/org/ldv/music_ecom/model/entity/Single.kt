package org.ldv.music_ecom.model.entity
import jakarta.persistence.*

@Entity
class Single(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long?,
    var nom: String,
    var description : String

) {

}