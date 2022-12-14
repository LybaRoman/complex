package commands.UserCommands;

import banking.Bank;
import commands.Command;
import userclass.User;

import java.util.ArrayList;

public class UserDeleteDepCom implements Command {
    private User b;
    ArrayList<Bank> banksBank;

    public UserDeleteDepCom(User b, ArrayList<Bank> banksBank) {
        this.b = b;
        this.banksBank = banksBank;
    }

    @Override
    public String execute(String[] arr) {
        return b.DeleteDepCase(arr);
    }

    @Override
    public String getInfo() {
        return " - close your active deposit but without planned profit. Your profit will be RECALCULATED according to  \"Do pitannya\" plan.\n\tExample: del dep {bankID} {depId}";
    }
}
