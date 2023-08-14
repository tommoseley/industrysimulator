package com.tommoseley.industrysimulator.commands

class CommandHelp : Command {

    companion object Factory : CommandFactory
    {
        override fun getCommand(): Command {
            return CommandHelp()
        }
    }

    override fun execute(args: List<String>): Boolean {
        println("Valid commands are:\n" +
                "catalog - provide a listing of all materials that can be bought, constructed, or made.\n" +
                "    You can filter the list by providing a search term after the command.\n" +
                "help - this page\n" +
                "exit - leave the game.")
        return true
    }
}