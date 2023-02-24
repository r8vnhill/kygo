package cl.ravenhill.kygo.serializer

import cl.ravenhill.kygo.cards.Card


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
}