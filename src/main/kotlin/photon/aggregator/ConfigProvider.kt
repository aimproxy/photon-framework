package photon.aggregator

import photon.dsl.SlashCommandData

interface ConfigProvider {
    fun declaration(): SlashCommandData
}

