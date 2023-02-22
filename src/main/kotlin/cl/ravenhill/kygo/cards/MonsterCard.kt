package cl.ravenhill.kygo.cards

import cl.ravenhill.kygo.Player
import cl.ravenhill.kygo.effects.Effect
import cl.ravenhill.kygo.serializer.AbstractCardSerializer


class MonsterCard(
  name: String,
  text: String,
  val attack: Int,
  effect: Effect,
  serializer: AbstractCardSerializer
) : AbstractCard(name, text, effect, serializer) {
  fun attack(player: Player) {
    player.takeDamage(this.attack)
  }
}