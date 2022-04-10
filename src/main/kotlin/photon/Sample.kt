package photon

import photon.aggregator.ConfigAggregator
import photon.aggregator.ConfigProvider
import photon.commands.SlashCommand
import photon.commands.SlashCommandArguments
import photon.commands.SlashCommandContext
import photon.factory.SlashCommandData
import photon.factory.SlashCommandFactory
import kotlin.reflect.KClass

class CurrencyCommand : SlashCommand {
    override suspend fun onSlashCommandInteraction(context: SlashCommandContext, args: SlashCommandArguments) {
        TODO("Not yet implemented")
    }

}

class CurrencyCommandFactory : SlashCommandFactory {
    override fun declaration() = SlashCommandData("Currency", "The currency command")
}

class CurrencyConfigProvider : ConfigProvider {

    override fun factories(): HashMap<KClass<out SlashCommandFactory>, KClass<out SlashCommand>> {
        return hashMapOf(
            CurrencyCommandFactory::class to CurrencyCommand::class,
        )
    }
}

val aggregator = ConfigAggregator(
    providers = listOf(
        CurrencyConfigProvider::class,
    )
)