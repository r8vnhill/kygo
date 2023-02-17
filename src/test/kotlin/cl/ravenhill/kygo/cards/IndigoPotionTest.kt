package cl.ravenhill.kygo.cards

import cl.ravenhill.kygo.Player
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe


class IndigoPotionTest : FunSpec({
  val initHealth = 8000
  lateinit var player: Player
  lateinit var indigoPotion: IndigoPotion

  beforeTest {
    player = Player("Jaiva", initHealth, mutableListOf())
    indigoPotion = IndigoPotion()
  }

  test("Indigo Potion should heal 400 HP") {
    player.health shouldBe initHealth
    indigoPotion.useOn(player)
    player.health shouldBe initHealth + 400
  }
})