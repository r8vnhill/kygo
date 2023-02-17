package cl.ravenhill.kygo.serializer

import cl.ravenhill.kygo.cards.AbstractCard
import java.io.File


abstract class AbstractCardSerializer: CardSerializer {
  override fun toFile(card: AbstractCard, filename: String) {
    val file = File(filename)
    file.writeText(serialize(card))
  }

  abstract override fun serialize(card: AbstractCard): String
}