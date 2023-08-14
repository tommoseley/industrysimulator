package com.tommoseley.industrysimulator.commands
import com.tommoseley.industrysimulator.Catalog
import com.tommoseley.industrysimulator.PriceOption
import com.tommoseley.industrysimulator.Thing
import java.time.Duration
class CommandCatalog : Command {

    companion object Factory : CommandFactory
    {
        override fun getCommand(): Command {
            return CommandCatalog()
        }
    }

    override fun execute(args: List<String>): Boolean {
        val filter = args.getOrNull(0) ?: ""

        printCatalogHeader()

        Catalog.getInstance().things.filter { it.name.contains(filter, true) }
            .forEach { thing ->
                printThingInfo(thing)
                printPriceOptions(thing.priceOptions)
                println()
            }

        return true
    }

    private fun printCatalogHeader() {
        println("Item Catalog")
        println("============")
        println("Name            | Sale Price | Purchase Price Options (Shipment method, price, delay)")
        println("========================================================================================")
    }

    private fun printThingInfo(thing: Thing) {
        val formatted = "%-15s | $%9d | ".format(thing.name, thing.salePrice)
        print(formatted)
    }

    private fun printPriceOptions(priceOptions: List<PriceOption>) {
        priceOptions.forEach { priceOption ->
            val formatted = "(%s, $%4d, %02d:%02d)  ".format(
                priceOption.name,
                priceOption.price,
                priceOption.deliveryTime.toMinutes() % 60,
                priceOption.deliveryTime.seconds % 60)
            print("%-25s".format(formatted))
        }
    }
}