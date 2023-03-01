package cl.ravenhill.kygo.serializer

import cl.ravenhill.kygo.cards.MagicCard
import cl.ravenhill.kygo.cards.MonsterCard
import cl.ravenhill.kygo.cards.TrapCard

/**
 * Class for YAML card serializers.
 *
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 */
class YamlSerializer : AbstractCardSerializer() {
  override fun serializeMagicCard(card: MagicCard) = """
      |!!MagicCard
      |name: ${card.name}
      |text: ${card.text}
      """.trimMargin()

  override fun serializeMonsterCard(card: MonsterCard) = """
      |!!MonsterCard
      |name: ${card.name}
      |text: ${card.text}
      |attack: ${card.attack}
      """.trimMargin()

  override fun serializeTrapCard(card: TrapCard) = """
      |!!TrapCard
      |name: ${card.name}
      |text: ${card.text}
      """.trimMargin()
}