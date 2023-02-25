package cl.ravenhill.kygo.cards

import cl.ravenhill.kygo.serializer.CardSerializer


/**
 * Class for Magic cards.
 *
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 */
class MagicCard(name: String, text: String, serializer: CardSerializer) :
    AbstractCard(name, text, serializer)