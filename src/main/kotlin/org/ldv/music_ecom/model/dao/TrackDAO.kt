package org.ldv.music_ecom.model.dao

import org.ldv.music_ecom.model.entity.Track
import org.springframework.data.jpa.repository.JpaRepository


interface TrackDAO : JpaRepository<Track, Int> {
}