package cl.ravenhill.kygo

import cl.ravenhill.kygo.cards.Card
import cl.ravenhill.kygo.exceptions.InvalidStatException
import kotlin.math.max

/**
 * A player in the game.
 *
 * @property name The name of the player.
 * @property health The health of the player.
 * @property deck The deck of the player.
 * @property hand The hand of the player.
 *
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 */
class Player(
  val name: String,
  health: Int,
  val deck: MutableList<Card>
) {
  var health: Int =
    if (health > 0) health else throw InvalidStatException("Health", health)
    set(value) {
      field = max(value, 0)
    }

  private val _hand: MutableList<Card> = mutableListOf()
  val hand: List<Card>
    get() = _hand.toList()



  /**
   * Reduces the player's health by the given amount.
   * This method will not reduce the player's health below 0.
   */
  fun takeDamage(damage: Int) {
    this.health -= damage
  }

  /**
   * Draws a card from the deck and adds it to the player's hand.
   * If the deck is empty, this method does nothing.
   */
  fun draw(n: Int = 1) {
    for (i in 1..n) {
      if (deck.isEmpty()) {
        break
      }
      _hand.add(deck.removeAt(0))
    }
  }
}