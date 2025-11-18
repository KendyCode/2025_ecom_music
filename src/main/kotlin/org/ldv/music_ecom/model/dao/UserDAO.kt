package org.ldv.music_ecom.model.dao

import org.ldv.music_ecom.model.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserDAO : JpaRepository<User, Int> {

}