package cl.ravenhill.kygo.cards

import cl.ravenhill.kygo.effects.Effect
import cl.ravenhill.kygo.serializer.CardSerializer


data class MagicCard(
  override val name: String,
  override val text: String,
  override val effect: Effect,
  override val serializer: CardSerializer
) : AbstractCard(name, text, effect, serializer)