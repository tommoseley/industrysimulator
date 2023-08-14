package com.tommoseley.industrysimulator.commands

class CommandUnknown : Command {

    companion object Factory : CommandFactory
    {
        override fun getCommand(): Command {
            return CommandUnknown()
        }
    }

    override fun execute(args: List<String>): Boolean {
        println("Unknown Command - use 'help' for a lost of valid commands")
        return true
    }
}