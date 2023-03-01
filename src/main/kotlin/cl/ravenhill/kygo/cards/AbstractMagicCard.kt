package cl.ravenhill.kygo.cards
import cl.ravenhill.kygo.Player
import cl.ravenhill.kygo.serializer.CardSerializer
/**
 * Class for Magic cards.
 *
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 */
abstract class AbstractMagicCard(name: String, text: String) :
    AbstractCard(name, text) {
  override fun serializeWith(serializer: CardSerializer) =
    serializer.serializeMagicCard(this)

  abstract fun useOn(player: Player)
}