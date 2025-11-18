package org.ldv.music_ecom.model.entity

import jakarta.persistence.Embeddable
import java.io.Serializable

@Embeddable
class CommandLineId(
    var orderTableId : Int,
    var productId : Int
) : Serializable{
}