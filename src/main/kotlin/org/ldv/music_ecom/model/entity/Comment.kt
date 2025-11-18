package org.ldv.music_ecom.model.entity

import jakarta.persistence.EmbeddedId
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.MapsId

@Entity
class Comment (
    @EmbeddedId
    var commentId: CommentId? = null,

    @MapsId("userId")
    @ManyToOne
    @JoinColumn(name="user_id")
    var user: User? = null,

    @MapsId("projectId")
    @ManyToOne
    @JoinColumn(name="project_id")
    var project: User? = null,


    )

{



}