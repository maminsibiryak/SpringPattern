package factory

class SavingAccount : Account{
    override fun accountType() {
        println("SAVING ACCOUNT TYPE")
    }
}