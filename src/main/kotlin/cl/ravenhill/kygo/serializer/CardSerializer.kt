package cl.ravenhill.kygo.serializer

import cl.ravenhill.kygo.cards.Card
import cl.ravenhill.kygo.cards.AbstractMagicCard
import cl.ravenhill.kygo.cards.MonsterCard
import cl.ravenhill.kygo.cards.TrapCard

/**
 * Interface for card serializers.
 *
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 */
interface CardSerializer {
  /**
   * Serialize the card to a string.
   */
  fun serialize(card: Card): String
  /**
   * Serialize the card to a file.
   *
   * @param filename The name of the file to write to.
   */
  fun toFile(card: Card, filename: String)
  /**
   * Serializes a magic card to a string.
   */
  fun serializeMagicCard(card: AbstractMagicCard): String

  /**
   * Serializes a monster card to a string.
   */
  fun serializeMonsterCard(card: MonsterCard): String
  /**
   * Serializes a trap card to a string.
   */
  fun serializeTrapCard(card: TrapCard): String
}