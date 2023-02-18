package cl.ravenhill.kygo.effects

import cl.ravenhill.kygo.Player


interface Effect {
  fun useOn(player: Player)
}