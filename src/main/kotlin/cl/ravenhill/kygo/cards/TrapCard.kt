package cl.ravenhill.kygo.cards

import cl.ravenhill.kygo.effects.Effect
import cl.ravenhill.kygo.serializer.CardSerializer


class TrapCard(
  name: String,
  text: String,
  effect: Effect,
  serializer: CardSerializer
) : AbstractCard(name, text, effect, serializer)