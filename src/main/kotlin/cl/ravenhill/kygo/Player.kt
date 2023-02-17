package cl.ravenhill.kygo

import cl.ravenhill.kygo.cards.AbstractCard


class Player(
  name: String,
  healthPoints: Int,
  deck: MutableList<AbstractCard>
) {
  val name: String
  var health: Int private set
  val deck: MutableList<AbstractCard>

  init {
    this.name = name
    this.health = healthPoints
    this.deck = deck
  }

  fun takeDamage(damage: Int) {
    if (damage < health) {
      health -= damage
    } else {
      health = 0
    }
  }
}
