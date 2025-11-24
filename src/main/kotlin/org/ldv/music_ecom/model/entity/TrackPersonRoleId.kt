package org.ldv.music_ecom.model.entity

import jakarta.persistence.Embeddable
import java.io.Serializable

@Embeddable
class TrackPersonRoleId(
    var trackId : Int,
    var personId : Int,
    var roleId : Int
) : Serializable {
}