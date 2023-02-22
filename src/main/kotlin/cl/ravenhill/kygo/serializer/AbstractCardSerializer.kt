package cl.ravenhill.kygo.serializer

import cl.ravenhill.kygo.cards.AbstractCard
import cl.ravenhill.kygo.cards.Card
import java.io.File


abstract class AbstractCardSerializer: CardSerializer {
  override fun toFile(card: Card, filename: String) {
    val file = File(filename)
    file.writeText(serialize(card))
  }

  abstract override fun serialize(card: Card): String
}