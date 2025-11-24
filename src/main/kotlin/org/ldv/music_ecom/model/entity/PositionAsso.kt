package org.ldv.music_ecom.model.entity

import jakarta.persistence.EmbeddedId
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.MapsId

@Entity
class PositionAsso (
    @EmbeddedId
    var positionAssoId: PositionAssoId? = null,

    @MapsId("projectId")
    @ManyToOne
    @JoinColumn(name="project_id")
    var project: Project? = null,

    @MapsId("trackId")
    @ManyToOne
    @JoinColumn(name = "track_id")
    var track: Track? = null,

    var trackPosition: Int,
    var diskNumber: Int
) {
}