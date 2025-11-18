package org.ldv.music_ecom.model.dao

import org.ldv.music_ecom.model.entity.Person
import org.springframework.data.jpa.repository.JpaRepository

interface PersonDAO : JpaRepository<Person,Int> {
}