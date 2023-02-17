package cl.ravenhill.kygo.cards

import cl.ravenhill.kygo.Player
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe


class CrimsonBeverageTest : FunSpec({
  val initHealth = 8000
  lateinit var player: Player
  lateinit var crimsonBeverage: CrimsonBeverage

  beforeTest {
    player = Player("Jaiva", initHealth, mutableListOf())
    crimsonBeverage = CrimsonBeverage()
  }

  test("Crimson Beverage should heal 500 HP") {
    player.health shouldBe initHealth
    crimsonBeverage.useOn(player)
    player.health shouldBe initHealth + 500
  }
})