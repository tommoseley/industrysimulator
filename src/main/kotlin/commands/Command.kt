package com.tommoseley.industrysimulator.commands

interface Command {
    fun execute (args : List<String>) : Boolean
}

interface CommandFactory {
    fun getCommand () : Command
}

class CommandHandler {
    fun handleCommand(input: List<String>): Boolean {
        val command = createCommand(input)
        return command.execute(input.drop(1))
    }

    private fun createCommand(input: List<String>): Command {
        val firstInput = input.firstOrNull()?.lowercase()
        return when (firstInput) {
            "exit" -> CommandExit.getCommand()
            "help" -> CommandHelp.getCommand()
            in setOf("catalog", "cat") -> CommandCatalog.getCommand()
            else -> CommandUnknown.getCommand()
        }
    }
}







