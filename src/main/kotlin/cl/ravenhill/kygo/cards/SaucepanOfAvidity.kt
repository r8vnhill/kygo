package cl.ravenhill.kygo.cards

import cl.ravenhill.kygo.Player
import cl.ravenhill.kygo.serializer.XmlCardSerializer

class SaucepanOfAvidity : AbstractMagicCard(
  "Saucepan of Avidity",
  "Draw 2 cards",
  XmlCardSerializer()
) {
  override fun useOn(player: Player) {
    player.draw(2)
  }
}
