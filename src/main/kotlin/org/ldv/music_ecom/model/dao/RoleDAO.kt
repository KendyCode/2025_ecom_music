package org.ldv.music_ecom.model.dao

import org.ldv.music_ecom.model.entity.Role

import org.springframework.data.jpa.repository.JpaRepository

interface RoleDAO : JpaRepository<Role, Int>{
}