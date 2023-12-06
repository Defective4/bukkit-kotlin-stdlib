package io.github.defective4.kotlin.stdlib

import net.md_5.bungee.api.plugin.Plugin
import java.util.logging.Level

class BungeePlugin : Plugin() {
    override fun onEnable() {
        logger.log(Level.INFO, "Kotlin-stdlib is now enabled!")
    }
}