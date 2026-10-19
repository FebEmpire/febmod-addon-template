# Example code :D

````kt
package com.example.febmod.addon

import com.feb.mod.api.chat.ModMessage
import com.feb.mod.api.command.CommandApi

object PingPongCommand {

    fun register(commands: CommandApi) {
        commands.register("ping") {
            execute()
        }
    }

    private fun execute() {
        ModMessage.send("Pong!")
    }

}
````