package cl.ravenhill.kygo.cards

import cl.ravenhill.kygo.Player
import cl.ravenhill.kygo.serializer.XmlCardSerializer


class CrimsonBeverage :
    AbstractMagicCard("Crimson Beverage", "Increase 500 health") {
  override fun useOn(player: Player) {
    player.health += 500
  }
}