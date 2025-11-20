package org.ldv.music_ecom.model.entity


import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany

@Entity
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id:Int?=null,
    var password : String,
    var email : String,
    var isAdmin : Boolean,
    var adress : String,
    var nom : String,
    var prenom : String,

    @OneToMany(mappedBy = "user",cascade = [CascadeType.ALL], orphanRemoval = true)
    var orders: MutableList<OrderTable> = mutableListOf(),

    //Associaiton One to Many avec Comment
    @OneToMany(mappedBy = "user", orphanRemoval = true)
    var comments: MutableList<Comment> = mutableListOf(),



    ) {

}