package org.yadhidya;

public class Computer {

    String Cpu;
    int RAM;
    int storage;

    Computer(Builder builder)
    {
        this.Cpu=builder.Cpu;
        this.RAM=builder.RAM;
        this.storage=builder.storage;
    }

    void details(){
        System.out.println("Computer Specifications");
        System.out.println("CPU :"+Cpu);
        System.out.println("RAM :"+RAM);
        System.out.println("Storage :"+storage);
    }

    public static class Builder{
        String Cpu;
        int RAM;
        int storage;

        public Builder setCpu(String Cpu){
            this.Cpu=Cpu;
            return this;
        }

        public Builder setRAM(int RAM)
        {
            this.RAM=RAM;
            return this;
        }

        public Builder setstorage(int storage)
        {
            this.storage=storage;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }
}
