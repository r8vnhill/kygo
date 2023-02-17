package cl.ravenhill.kygo.cards

import cl.ravenhill.kygo.serializer.XmlCardSerializer

class IndigoPotion : AbstractHealthMagicCard(
  "Indigo Potion",
  "Increase 400 health",
  XmlCardSerializer(),
  400
)