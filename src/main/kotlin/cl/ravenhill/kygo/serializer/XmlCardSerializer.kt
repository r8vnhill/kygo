package cl.ravenhill.kygo.serializer

import cl.ravenhill.kygo.cards.Card
import cl.ravenhill.kygo.cards.AbstractMagicCard
import cl.ravenhill.kygo.cards.MonsterCard
import cl.ravenhill.kygo.cards.TrapCard


class XmlCardSerializer : AbstractCardSerializer() {
  override fun serialize(card: Card) = """
      |<Card>
      | <name>${card.name}</name>
      | <text>${card.text}</text>
      |</Card>
      """.trimMargin()

  override fun serializeMagicCard(card: AbstractMagicCard) = """
      |<MagicCard>
      | <name>${card.name}</name>
      | <text>${card.text}</text>
      |</MagicCard>
      """.trimMargin()

  override fun serializeMonsterCard(card: MonsterCard) = """
      |<MonsterCard>
      | <name>${card.name}</name>
      | <text>${card.text}</text>
      | <attack>${card.attack}</attack>
      |</MonsterCard>
      """.trimMargin()

  override fun serializeTrapCard(card: TrapCard) = """
      |<TrapCard>
      | <name>${card.name}</name>
      | <text>${card.text}</text>
      |</TrapCard>
      """.trimMargin()
}