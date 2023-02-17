package cl.ravenhill.kygo.serializer

import cl.ravenhill.kygo.cards.AbstractCard


interface CardSerializer {
  fun serialize(card: AbstractCard): String
  fun toFile(card: AbstractCard, filename: String)
}