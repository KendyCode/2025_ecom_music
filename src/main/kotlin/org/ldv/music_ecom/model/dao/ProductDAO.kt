package org.ldv.music_ecom.model.dao

import org.ldv.music_ecom.model.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductDAO : JpaRepository<Product, Int> {
}