package cl.ravenhill.kygo.cards

import cl.ravenhill.kygo.Player
import cl.ravenhill.kygo.serializer.CardSerializer


abstract class AbstractMagicCard(
  name: String, text: String, serializer: CardSerializer) :
    AbstractCard(name, text, serializer) {
  abstract fun useOn(player: Player)
}