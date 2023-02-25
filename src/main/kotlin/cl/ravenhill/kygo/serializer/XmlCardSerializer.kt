package cl.ravenhill.kygo.serializer

import cl.ravenhill.kygo.cards.AbstractCard
import cl.ravenhill.kygo.cards.Card


class XmlCardSerializer(card: AbstractCard) : AbstractCardSerializer() {
  override fun serialize(card: Card) = """
      |<Card>
      | <name>${card.name}</name>
      | <text>${card.text}</text>
      |</Card>
      """.trimMargin()
}