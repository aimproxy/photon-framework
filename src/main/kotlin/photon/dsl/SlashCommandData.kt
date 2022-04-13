package photon.dsl

import photon.commands.SlashCommandInterface
import kotlin.reflect.KClass

typealias SlashCommandType = KClass<out SlashCommandInterface>

data class SlashCommandData(
    val name: String,
    val description: String,
    val klass: SlashCommandType,
) {
    private lateinit var subCommands: MutableList<SlashCommandData>

    constructor(
        name: String,
        description: String,
        klass: SlashCommandType,
        subCommands: MutableList<SlashCommandData>,
    ) : this(name, description, klass) {
        this.subCommands = subCommands
    }
}

class SlashCommandBuilder {
    lateinit var name: String
    lateinit var description: String
    lateinit var klass: SlashCommandType

    private val subCommands = mutableListOf<SlashCommandData>()

    fun slashCommand(block: SlashCommandBuilder.() -> Unit): SlashCommandData =
        SlashCommandBuilder().apply(block).build()

    fun build(): SlashCommandData = SlashCommandData(name, description, klass, subCommands)
}

fun slashCommand(block: SlashCommandBuilder.() -> Unit): SlashCommandData = SlashCommandBuilder().apply(block).build()

