package cl.ravenhill.kygo

import cl.ravenhill.kygo.cards.Card

/**
 * A player in the game.
 *
 * @property name The name of the player.
 * @property health The health of the player.
 * @property deck The deck of the player.
 *
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 */
class Player(
  name: String,
  health: Int,
  deck: MutableList<Card>
) {
  val name: String
  var health: Int private set
  val deck: MutableList<Card>

  init {
    this.name = name
    this.health = health
    this.deck = deck
  }

  /**
   * Reduces the player's health by the given amount.
   * This method will not reduce the player's health below 0.
   */
  fun takeDamage(damage: Int) {
    if (damage < health) {
      health -= damage
    } else {
      health = 0
    }
  }
}
