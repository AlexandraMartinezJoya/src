package Chapter7;

import acm.program.ConsoleProgram;

public class SignalTowerConsoleImplementation extends ConsoleProgram {
// TODO : Implement a graphics program showing how the towers are lit to have a graphical representation of linked structures
    public void run(){
        createSignalTowers();
    }

    private void createSignalTowers(){
         SignalTower rohan = new SignalTower("Rohan", null);
         SignalTower halifirien  = new SignalTower("Halifirien", rohan);
         SignalTower calenhad = new SignalTower("Calenhad", halifirien);
         SignalTower minRimmon = new SignalTower("Min-rimon", calenhad);
         SignalTower erelas = new SignalTower("Erelas", minRimmon);
         SignalTower nardol = new SignalTower("Nardol", erelas);
         SignalTower elienach = new SignalTower("Elienach", nardol);
         SignalTower amonDin = new SignalTower("Amon Din", elienach);
         SignalTower minasTirith = new SignalTower("Minas Tirith", amonDin);
    }
}
