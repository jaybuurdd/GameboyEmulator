enum Regs{
    A, //accumulator
    B, //flags
    C, 
    D,
    E,
    F, //flag
    H,
    L,
   }

public class Register {
  //8 bit
  //private int A,B,C,D,E,H,L; 

  //16 bit
  private int SP; //(stack pointer)
  private int PC = 0x0100;//where cpu looks first (program counter)
 

public static void main(String[] args) {
  Regs AF;
  Regs BC;
  Regs DE;
  Regs HL;

  System.out.println("This is the register!");
}

}