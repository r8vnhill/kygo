package cl.ravenhill.kygo.serializer

import cl.ravenhill.kygo.cards.AbstractCard
import cl.ravenhill.kygo.cards.Card


class XmlCardSerializer : AbstractCardSerializer() {
  override fun serialize(card: Card): String {
    return """
      |<Card>
      | <name>${card.name}</name>
      | <text>${card.text}</text>
      |</Card>
      """.trimMargin()
  }
}