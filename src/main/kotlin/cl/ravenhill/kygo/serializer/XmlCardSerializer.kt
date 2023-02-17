package cl.ravenhill.kygo.serializer

import cl.ravenhill.kygo.cards.AbstractCard


class XmlCardSerializer : AbstractCardSerializer() {
  override fun serialize(card: AbstractCard): String {
    return """
      |<Card>
      | <name>${card.name}</name>
      | <text>${card.text}</text>
      |</Card>
      """.trimMargin()
  }
}