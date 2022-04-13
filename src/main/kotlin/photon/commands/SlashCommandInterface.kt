package photon.commands

interface SlashCommandInterface {
    suspend fun onSlashCommandInteraction(
        context: SlashCommandContext,
        args: SlashCommandArguments,
    )

}