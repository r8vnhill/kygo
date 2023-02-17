package cl.ravenhill.kygo.cards

import cl.ravenhill.kygo.serializer.XmlCardSerializer

class CrimsonBeverage : AbstractHealthMagicCard(
  "Crimson Beverage",
  "Increase 500 health",
  XmlCardSerializer(),
  500
)