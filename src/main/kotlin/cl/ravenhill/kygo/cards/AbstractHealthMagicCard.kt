package cl.ravenhill.kygo.cards

import cl.ravenhill.kygo.Player
import cl.ravenhill.kygo.serializer.CardSerializer


abstract class AbstractHealthMagicCard(
  name: String, text: String, serializer: CardSerializer, private val health: Int
) : AbstractMagicCard(name, text, serializer) {
  override fun useOn(player: Player) {
    player.health += health
  }
}