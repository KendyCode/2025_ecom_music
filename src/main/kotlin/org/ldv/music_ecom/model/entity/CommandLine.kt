package org.ldv.music_ecom.model.entity

import jakarta.persistence.EmbeddedId
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.MapsId

@Entity
class CommandLine(
    @EmbeddedId
    var commandLine: CommandLineId? = null,

    @MapsId("orderTableId")
    @ManyToOne
    @JoinColumn(name="ordertable_id")
    var ordertable: OrderTable? = null,

    @MapsId("productId")
    @ManyToOne
    @JoinColumn(name="product_id")
    var product: Product? = null,

    var quantity: Int


) {
}