package abstract_factory

fun main() {
    val factoryProducer = FactoryProducer()
    val accountFactory = factoryProducer.getFactory("ACCOUNT")

    val savingAccount = accountFactory?.getAccount("SAVING")
    savingAccount?.accountType()

    val currentAccount = accountFactory?.getAccount("CURRENT")
    currentAccount?.accountType()

    val bankFactory = factoryProducer.getFactory("BANK")

    val iciciBank = bankFactory?.getBank("ICICI")
    iciciBank?.bankName()

    val yesBank = bankFactory?.getBank("YES")
    yesBank?.bankName()


}