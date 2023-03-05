package cl.ravenhill.kygo.cards

import cl.ravenhill.kygo.Player
import cl.ravenhill.kygo.serializer.XmlCardSerializer


class IndigoPotion :
    AbstractMagicCard("Indigo Potion", "Increase 400 health") {
  override fun useOn(player: Player) {
    player.health += 400
  }
}