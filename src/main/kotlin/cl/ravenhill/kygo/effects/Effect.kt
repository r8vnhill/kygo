package cl.ravenhill.kygo.effects

import cl.ravenhill.kygo.Player


/**
 * Interface for effects.
 *
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 */
interface Effect {

  /**
   * Use the effect on the given player.
   */
  fun useOn(player: Player)
}