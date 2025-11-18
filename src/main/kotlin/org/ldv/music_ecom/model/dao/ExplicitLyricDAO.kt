package org.ldv.music_ecom.model.dao

import org.ldv.music_ecom.model.entity.ExplicitLyric
import org.springframework.data.jpa.repository.JpaRepository

interface ExplicitLyricDAO : JpaRepository<ExplicitLyric,Int> {
}