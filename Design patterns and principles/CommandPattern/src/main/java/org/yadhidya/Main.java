package org.yadhidya;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Light light=new Light();
Command lighton=new LightOnCommand(light);
Command lightoff=new LightOffCommand(light);
RemoteControl rc1=new RemoteControl(lightoff);
RemoteControl rc2=new RemoteControl(lighton);
rc1.pressButton();
rc2.pressButton();
    }
}