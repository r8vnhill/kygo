package cl.ravenhill.kygo.cards

import cl.ravenhill.kygo.serializer.CardSerializer


/**
 * Abstract class for cards.
 *
 * @param name Name of the card
 * @param text Text of the card
 * @param serializer Serializer to use for this card
 *
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 */
abstract class AbstractCard(
  override val name: String,
  override val text: String,
  override var serializer: CardSerializer
) : Card {

  override fun toFile(filename: String) {
    serializer.toFile(this, filename)
  }

  override fun serialize(): String {
    return serializer.serialize(this)
  }
}