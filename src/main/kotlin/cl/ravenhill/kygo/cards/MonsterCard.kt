package cl.ravenhill.kygo.cards

import cl.ravenhill.kygo.Player
import cl.ravenhill.kygo.serializer.AbstractCardSerializer


class MonsterCard(
    name: String,
    text: String,
    attack: Int,
    serializer: AbstractCardSerializer
) : AbstractCard(name, text, serializer) {
    val attack = attack
    
    fun attack(player: Player) {
        player.takeDamage(this.attack)
    }
}