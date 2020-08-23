package factory

class CurrentAccount : Account {
    override fun accountType() {
        println("CURRENT ACCOUNT TYPE")
    }
}