package cl.ravenhill.kygo.serializer

import cl.ravenhill.kygo.cards.Card

/**
 * Class for JSON card serializers.
 *
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 */
class JsonSerializer : AbstractCardSerializer() {
  override fun serialize(card: Card) = """
      |{
      | "name": "${card.name}",
      | "text": "${card.text}"
      |}
      """.trimMargin()
}