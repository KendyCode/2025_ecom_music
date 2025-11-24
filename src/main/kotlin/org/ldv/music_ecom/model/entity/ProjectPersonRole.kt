package org.ldv.music_ecom.model.entity

import jakarta.persistence.EmbeddedId
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.MapsId

@Entity
class ProjectPersonRole(
    @EmbeddedId
    var projectPersonRoleId: ProjectPersonRoleId? = null,

    @MapsId("projectId")
    @ManyToOne
    @JoinColumn(name="project_id")
    var track: Track? = null,

    @MapsId("personId")
    @ManyToOne
    @JoinColumn(name="person_id")
    var person: Person? = null,

    @MapsId("roleId")
    @ManyToOne
    @JoinColumn(name="role_id")
    var role: Role? = null,
) {

}