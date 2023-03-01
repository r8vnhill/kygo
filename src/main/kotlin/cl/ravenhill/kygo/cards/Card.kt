package cl.ravenhill.kygo.cards
import cl.ravenhill.kygo.serializer.CardSerializer
/**
 * A card in the game.
 *
 * @property name The name of the card.
 * @property text The text of the card.
 * @property serializer The serializer to use for this card.
 *
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 */
interface Card {
  val name: String
  val text: String

  /**
   * Serialize the card to a file.
   *
   * @param filename The name of the file to write to.
   */
  fun toFile(filename: String, serializer: CardSerializer)
  /**
   * Serialize the card with the given serializer.
   *
   * @param serializer The serializer to use.
   */
  fun serializeWith(serializer: CardSerializer): String
}