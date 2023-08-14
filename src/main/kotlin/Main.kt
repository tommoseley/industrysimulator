package com.tommoseley.industrysimulator
import com.tommoseley.industrysimulator.commands.CommandHandler

fun main() {
    println("Welcome to the factory simulator")
    val catalog = Catalog.getInstance()
    println("Catalog of items consists of %d items".format(catalog.things.count()))
    println("Entering the command 'help' will display available commands")
    var keepOn = true
    while (keepOn)
    {
        print("Command > ")
        val command = readln()
        keepOn = CommandHandler().handleCommand(command.split(" "))
    }
}


