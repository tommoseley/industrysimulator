package com.tommoseley.industrysimulator.commands

class CommandExit : Command {

    companion object Factory : CommandFactory
    {
        override fun getCommand(): Command {
            return CommandExit()
        }
    }

    override fun execute(args: List<String>): Boolean {
        println ("Exiting")
        return false
    }
}