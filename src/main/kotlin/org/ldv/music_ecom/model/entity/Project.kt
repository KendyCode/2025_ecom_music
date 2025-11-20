package org.ldv.music_ecom.model.entity
import jakarta.persistence.*
import org.hibernate.mapping.Join
import java.time.LocalDate

@Entity
class Project(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id:Int?=null,
    var title : String,
    var coverBaseUrl : String,
    var explicitLyricId : Int,
    var description : String,
    var realeaseDate : LocalDate,

    //Association avec Genre (Project est le maitre de l'association)'
    @ManyToOne
    @JoinColumn(name = "genre_id")
    var genre: Genre? = null,

    //Association avec Product
    @OneToMany(mappedBy = "project",cascade = [CascadeType.ALL], orphanRemoval = true)
    var products: MutableList<Product> = mutableListOf(),

    // Association Many to Many avec Track
    @ManyToMany
    @JoinTable(
        name = "project_tracks",
        joinColumns = [JoinColumn(name = "project_id")],
        inverseJoinColumns = [JoinColumn(name = "track_id")]
    )
    var tracks: MutableList<Track> = mutableListOf()






) {

}