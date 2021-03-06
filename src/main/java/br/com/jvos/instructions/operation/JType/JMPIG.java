package br.com.jvos.instructions.operation.JType;

import br.com.jvos.CPU;
import br.com.jvos.instructions.Instruction;

public class JMPIG extends Instruction {

    public JMPIG(int[] parameters) {
        super(parameters);
    }

    @Override
    public void doOperation(CPU cpu) {
        int rc = parameters[1];
        if (cpu.getRegister(rc) > 0) {
            int rs = cpu.getRegister(parameters[0]);
            System.out.println("JMPIG | PC <- " + rs);
            cpu.setPC(rs-1);
        }
    }
}
