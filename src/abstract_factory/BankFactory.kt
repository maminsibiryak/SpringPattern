package abstract_factory

import factory.Account

class BankFactory :AbstractFactory() {
     val ICICI_BANK = "ICICI"
     val YES_BANK = "YES"
    override fun getBank(bankName: String): Bank? {
       if (ICICI_BANK == bankName){
           return ICICIBank()
       } else if (YES_BANK ==bankName){
           return YesBank()
       }
        return null
    }

    override fun getAccount(accountType: String): Account {
        TODO("Not yet implemented")
    }
}