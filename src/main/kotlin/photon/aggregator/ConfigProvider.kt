package photon.aggregator

import photon.commands.SlashCommand
import photon.factory.SlashCommandFactory
import kotlin.reflect.KClass

interface ConfigProvider {
    fun factories(): HashMap<KClass<out SlashCommandFactory>, KClass<out SlashCommand>>
}