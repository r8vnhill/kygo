package cl.ravenhill.kygo.effects

import cl.ravenhill.kygo.Player


/**
 * Effect that modifies the health of a player.
 *
 * @param amount Amount to modify the health by.
 *
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 */
class ModifyHealthEffect(private val amount: Int) : Effect {
  override fun useOn(player: Player) {
    player.health += amount
  }
}