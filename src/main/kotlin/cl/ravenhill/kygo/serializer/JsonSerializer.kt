package cl.ravenhill.kygo.serializer

import cl.ravenhill.kygo.cards.AbstractMagicCard
import cl.ravenhill.kygo.cards.MonsterCard
import cl.ravenhill.kygo.cards.TrapCard

/**
 * Class for JSON card serializers.
 *
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 */
class JsonSerializer : AbstractCardSerializer() {
  override fun serializeMagicCard(card: AbstractMagicCard) = """
      |{
      |  "name": "${card.name}",
      |  "text": "${card.text}",
      |  "type": MagicCard
      |}
      """.trimMargin()

  override fun serializeMonsterCard(card: MonsterCard) = """
      |{
      |  "name": "${card.name}",
      |  "text": "${card.text}",
      |  "attack": ${card.attack},
      |  "type": MonsterCard
      |}
      """.trimMargin()

  override fun serializeTrapCard(card: TrapCard) = """
      |{
      |  "name": "${card.name}",
      |  "text": "${card.text}",
      |  "type": TrapCard
      |}
      """.trimMargin()
}