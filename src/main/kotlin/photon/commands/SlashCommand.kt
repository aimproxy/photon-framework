package photon.commands

interface SlashCommand {
    suspend fun onSlashCommandInteraction(
        context: SlashCommandContext,
        args: SlashCommandArguments
    )

}