package org.ldv.music_ecom.model.entity

import jakarta.persistence.Embeddable
import java.io.Serializable

@Embeddable
class PositionAssoId (
    var trackId: Int,
    var projectId : Int
) : Serializable {
}