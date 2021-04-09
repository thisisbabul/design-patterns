package prototypeexample1;

public class PrototypeClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        MachineImage linuxVM = new MachineImage("Linux", "Symantec");
        MachineImage windowsVM = new MachineImage("Windows", "MaAfee");

        MachineImage webServer = linuxVM.clone();
        webServer.install(" + Web Server S/W");

        MachineImage webAppServer = webServer.clone();
        webAppServer.install(" + App Server S/W");

        MachineImage dbServer = linuxVM.clone();
        dbServer.install(" + Database Server S/W");

        MachineImage testMachine = windowsVM.clone();

        System.out.print("Web Server Configuration: ");
        webServer.printSW();

        System.out.print("App Server Configuration: ");
        webAppServer.printSW();

        System.out.print("DB Server Configuration: ");
        dbServer.printSW();

        System.out.print("Test Machine Configuration: ");
        testMachine.printSW();
    }
}
