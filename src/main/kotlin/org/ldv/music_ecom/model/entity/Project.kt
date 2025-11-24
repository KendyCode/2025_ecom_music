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

    //Associaiton One to Many avec PositionAsso
    @OneToMany(mappedBy = "project", orphanRemoval = true)
    var positionAssos: MutableList<PositionAsso> = mutableListOf(),

    // Réflexive : projet original
    @ManyToOne
    @JoinColumn(name = "original_project_id")
    var originalProject: Project? = null,

    // Réflexive : projets dérivés
    @OneToMany(mappedBy = "originalProject", cascade = [CascadeType.ALL], orphanRemoval = true)
    var derivedProjects: MutableList<Project> = mutableListOf()








) {

}