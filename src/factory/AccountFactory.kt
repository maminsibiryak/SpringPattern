package factory

class AccountFactory {
     val CURRENT_ACCOUNT = "CURRENT"
     val SAVING_ACCOUNT = "SAVING"

    fun getAccount(accountType:String):Account?{
        if (CURRENT_ACCOUNT == accountType){
            return CurrentAccount()
        } else if (SAVING_ACCOUNT == accountType){
            return SavingAccount()
        }
        return null
    }
}