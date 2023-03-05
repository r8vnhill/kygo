package cl.ravenhill.kygo.effects

import cl.ravenhill.kygo.Player


class DrawCardsEffect(private val amount: Int) : Effect {
  override fun useOn(player: Player) = player.draw(amount)
}