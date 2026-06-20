package org.yadhidya;

public class RemoteControl {

    private Command command;
    RemoteControl(Command command)
    {
        this.command=command;
    }

    public  void pressButton(){
        command.execute();
    }
}
