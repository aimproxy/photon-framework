package photon.platforms.koin

import org.koin.core.component.KoinComponent
import org.koin.core.context.startKoin
import photon.aggregator.ConfigAggregator

class KoinContainer(aggregator: ConfigAggregator) : KoinComponent {

    val koin = startKoin {
        modules()
    }
}