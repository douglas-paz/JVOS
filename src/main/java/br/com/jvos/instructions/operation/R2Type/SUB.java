package br.com.jvos.instructions.operation.R2Type;

import br.com.jvos.CPU;
import br.com.jvos.instructions.Instruction;

public class SUB extends Instruction {

    public SUB(int[] parameters) {
        super(parameters);
    }

    @Override
    public void doOperation(CPU cpu) {
        int rdIndex = parameters[0];
        int rd = cpu.getRegister(rdIndex);
        int rsIndex = parameters[1];
        int rs = cpu.getRegister(rsIndex);
        System.out.println("ADD   | R" + rdIndex + "   <- " + rd + " - " + rs);
        cpu.setRegister(rdIndex, rd - rs);
    }
}
