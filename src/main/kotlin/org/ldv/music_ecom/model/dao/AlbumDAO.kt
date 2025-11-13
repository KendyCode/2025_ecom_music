package org.ldv.music_ecom.model.dao
import org.ldv.music_ecom.model.entity.Album
import org.springframework.data.jpa.repository.JpaRepository


interface AlbumDAO : JpaRepository<Album, Long> {



}