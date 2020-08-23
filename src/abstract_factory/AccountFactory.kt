package abstract_factory

import factory.Account
import factory.CurrentAccount
import factory.SavingAccount

class AccountFactory : AbstractFactory() {
    val CURRENT_ACCOUNT = "CURRENT"
    val SAVING_ACCOUNT = "SAVING"
    override fun getBank(bankName: String): Bank? {
        TODO("Not yet implemented")
    }

    override fun getAccount(accountType: String): Account? {
        if (CURRENT_ACCOUNT == accountType) {
            return CurrentAccount()
        } else if (SAVING_ACCOUNT == accountType) {
            return SavingAccount()
        }
        return null
    }
}