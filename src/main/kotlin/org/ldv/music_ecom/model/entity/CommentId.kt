package org.ldv.music_ecom.model.entity

import jakarta.persistence.Embeddable
import java.io.Serializable

@Embeddable
class CommentId (
    var userId : Int,
    var projectId : Int
) : Serializable {

}