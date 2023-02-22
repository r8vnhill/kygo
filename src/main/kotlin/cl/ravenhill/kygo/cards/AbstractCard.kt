package cl.ravenhill.kygo.cards

import cl.ravenhill.kygo.Player
import cl.ravenhill.kygo.effects.Effect
import cl.ravenhill.kygo.serializer.CardSerializer


abstract class AbstractCard(
  override val name: String,
  override val text: String,
  override val effect: Effect,
  override val serializer: CardSerializer
) : Card {

  override fun toFile(filename: String) = serializer.toFile(this, filename)

  override fun serialize() = serializer.serialize(this)

  override fun useOn(player: Player) = effect.useOn(player)
}