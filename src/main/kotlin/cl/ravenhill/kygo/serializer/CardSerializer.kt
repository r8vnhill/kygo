package cl.ravenhill.kygo.serializer

import cl.ravenhill.kygo.cards.Card


interface CardSerializer {
  fun serialize(card: Card): String
  fun toFile(card: Card, filename: String)
}