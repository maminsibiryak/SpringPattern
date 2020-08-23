package abstract_factory

import factory.Account

abstract class AbstractFactory {
    abstract fun getBank(bankName:String) : Bank?
    abstract fun getAccount(accountType:String) :Account?
}