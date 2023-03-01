package cl.ravenhill.kygo.cards

import cl.ravenhill.kygo.Player


abstract class AbstractHealthMagicCard(
  name: String, text: String, private val health: Int
) : AbstractMagicCard(name, text) {
  override fun useOn(player: Player) {
    player.health += health
  }
}