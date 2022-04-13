package photon

import photon.aggregator.ConfigAggregator
import photon.aggregator.ConfigProvider
import photon.commands.SlashCommandArguments
import photon.commands.SlashCommandContext
import photon.commands.SlashCommandInterface
import photon.dsl.slashCommand

class BTCCommand : SlashCommandInterface {
    override suspend fun onSlashCommandInteraction(context: SlashCommandContext, args: SlashCommandArguments) {
        TODO("Not yet implemented")
    }
}

class CurrencyCommand : SlashCommandInterface {
    override suspend fun onSlashCommandInteraction(context: SlashCommandContext, args: SlashCommandArguments) {
        TODO("Not yet implemented")
    }
}

class CurrencyConfigProvider : ConfigProvider {
    override fun declaration() = slashCommand {
        name = "currency"
        description = "Get the price of a currency"
        klass = CurrencyCommand::class

        slashCommand {
            name = "btc"
            description = "Get the current price of BTC"
            klass = BTCCommand::class
        }
    }

}

val aggregator = ConfigAggregator(
    providers = listOf(
        CurrencyConfigProvider::class,
    )
)