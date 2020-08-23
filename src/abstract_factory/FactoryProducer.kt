package abstract_factory

class FactoryProducer {
    val BANK = "BANK"
    val ACCOUNT = "ACCOUNT"

    fun getFactory(factory: String): AbstractFactory? {
        if (BANK == factory) {
            return BankFactory()
        } else if (ACCOUNT == factory) {
            return AccountFactory()
        }
        return null
    }
}