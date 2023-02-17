package cl.ravenhill.kygo.cards

import cl.ravenhill.kygo.serializer.AbstractCardSerializer
import cl.ravenhill.kygo.serializer.CardSerializer


abstract class AbstractCard(name: String, text: String, serializer: CardSerializer) : Card {
  val name = name
  val text = text
  var serializer = serializer

  fun toFile(filename: String) {
    serializer.toFile(this, filename)
  }

  fun serialize(): String {
    return serializer.serialize(this)
  }
}