package org.ldv.music_ecom.model.dao

import org.ldv.music_ecom.model.entity.Project

import org.springframework.data.jpa.repository.JpaRepository

interface ProjectDAO : JpaRepository<Project, Int> {
}