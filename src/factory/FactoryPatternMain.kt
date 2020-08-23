package factory

fun main() {
    val accountFactory = AccountFactory()
    val  savingAccount = accountFactory.getAccount("SAVING")
    savingAccount?.accountType()
    val  currentAccount = accountFactory.getAccount("CURRENT")
    currentAccount?.accountType()

}