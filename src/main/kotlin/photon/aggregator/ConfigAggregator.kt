package photon.aggregator

import kotlin.reflect.KClass

class ConfigAggregator(providers: List<KClass<out ConfigProvider>>)