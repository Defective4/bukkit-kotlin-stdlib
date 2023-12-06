# Bukkit Kotlin stdlib
A Kotlin standard library for Bukkit and Bungee servers.

# Why use a separate library?
When building a jar plugin from Kotlin code, you have to also include Kotlin libraries in it, so the JVM can actually run it.  
This adds around 2 MBs to the resulting archive size.  
Now imagine you create multiple plugins in Kotlin, each exported to a jar, and each with 2 MB of libraries added to its of size. 
It seems to be a waste of space.  
Instead you can load this plugin on the server and make your plugins depend on it.  
This way you can completely avoid including Kotlin libraries in your jar archives, instead relying on this plugin as a dependency.

# How to use
## Download
You can download the `bukkit-kotlin-stdlib-x.x.jar` file from [releases page](https://github.com/Defective4/bukkit-kotlin-stdlib/releases)

## Installation
Put the downloaded file in the `plugins` directory of your Bukkit or BungeeCord server and restart it.  
Afterwards you can build your own plugin and use it as normal, without including standard libraries in it.  

# Compatibility with server software
This plugin is compatible with all Spigot forks, including Paper, Purpur, Pufferfish, etc.
It can also be used on BungeeCord forks, such as Waterfall and Flamecord

# Compatibility with other plugins
There might be some conflicts when using this plugin with other plugins, but that's not determined yet.

# Building
You might have difficulty building this plugin as it was made mainly for personal purposes.
You can still do it by putting a Bungee-compatible runnable file in `lib` folder as `bungee.jar` and Spigot-compatible patched file (for example `patched_1.8.8.jar`) as `bukkit.jar`.
Make sure you have Apache Maven and at least JDK 1.8 installed.  
You can build the plugin using `mvn clean pacakge`.  
After build succeeds the plugin will be located in `target` directory as `bukkit-kotlin-stdlib-x.x-with-dependencies.jar`
