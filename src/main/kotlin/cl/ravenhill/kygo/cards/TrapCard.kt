package cl.ravenhill.kygo.cards

import cl.ravenhill.kygo.serializer.CardSerializer

/**
 * Class for Trap cards.
 *
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 */
class TrapCard(name: String, text: String, serializer: CardSerializer) :
    AbstractCard(name, text, serializer)