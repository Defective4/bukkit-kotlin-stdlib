package io.github.defective4.kotlin.stdlib

import org.bukkit.plugin.java.JavaPlugin
import java.util.logging.Level

class BukkitPlugin : JavaPlugin() {
    override fun onEnable() {
        logger.log(Level.INFO, "Kotlin-stdlib is now enabled!")
    }
}