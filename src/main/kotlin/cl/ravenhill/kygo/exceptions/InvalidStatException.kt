package cl.ravenhill.kygo.exceptions


class InvalidStatException(statName: String, statValue: Int) :
    Exception("Invalid $statName: $statValue")