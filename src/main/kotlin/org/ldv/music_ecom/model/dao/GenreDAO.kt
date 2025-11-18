package org.ldv.music_ecom.model.dao

import org.ldv.music_ecom.model.entity.Genre
import org.springframework.data.jpa.repository.JpaRepository

interface GenreDAO : JpaRepository<Genre,Int> {
}