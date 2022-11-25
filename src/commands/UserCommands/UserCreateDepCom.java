package commands.UserCommands;

import banking.Bank;
import commands.Command;
import userclass.User;

import java.util.ArrayList;

public class UserCreateDepCom implements Command {
    private User b;
    ArrayList<Bank> banksBank;

    public UserCreateDepCom(User b, ArrayList<Bank> banksBank) {
        this.b = b;
        this.banksBank = banksBank;
    }

    @Override
    public String execute(String[] arr) {
        return b.CreateDepCase(arr, banksBank);
    }

    @Override
    public String getInfo() {
        return " - create new deposit by given paramenters.\n\tExample: create dep {BankID} {DepID} {balance} {period_in_days}";
    }
}
