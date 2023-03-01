package cl.ravenhill.kygo.cards

import cl.ravenhill.kygo.Player


class SaucepanOfAvidity : AbstractMagicCard(
  "Saucepan of Avidity",
  "Draw 2 cards"
) {
  override fun useOn(player: Player) {
    player.draw(2)
  }
}