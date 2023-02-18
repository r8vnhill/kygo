package cl.ravenhill.kygo.effects

import cl.ravenhill.kygo.Player

class ModifyHealthEffect(private val amount: Int) : Effect {
  override fun useOn(player: Player) {
    player.health += amount
  }
}
