package cl.ravenhill.kygo

import cl.ravenhill.kygo.cards.AbstractCard
import cl.ravenhill.kygo.cards.Card
import cl.ravenhill.kygo.exceptions.InvalidStatException
import kotlin.math.max


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

  fun draw(n: Int = 1) {
    for (i in 1..n) {
      if (deck.isEmpty()) {
        break
      }
      _hand.add(deck.removeAt(0))
    }
  }

  fun takeDamage(damage: Int) {
    this.health -= damage
  }
}
