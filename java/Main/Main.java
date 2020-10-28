package Main;

import CustomExceptions.SwitchEquipmentException;
import Equipment.Clothing.Acoat;
import Equipment.Computing.InternetComputer;
import Printer.ConsolePrinter;
import Staff.TeamLeader;
import Staff.Teammate;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String configPath = "src/main/resources/config.properties";
        ArrayList<Teammate> teammates = new ArrayList<>();
        ConsolePrinter printer = new ConsolePrinter();
        try {
            Acoat coat = new Acoat("L", configPath);
            InternetComputer pc1 = new InternetComputer("192.123.1.3", configPath);
            InternetComputer pc2 = new InternetComputer("222.168.1.1", configPath);
            InternetComputer pc3 = new InternetComputer("142.123.124", configPath);
            InternetComputer pc4 = new InternetComputer("132.123.125", configPath);
            Teammate teammate1 = new Teammate();
            Teammate teammate2 = new Teammate();
            teammate1.addItem(coat);
            teammate1.addItem(pc1);
            teammate1.addItem(pc2);
            teammate2.addItem(pc3);
            System.out.println("teammate1 equipment:");
            printer.printDetailedDisplay(teammate1);
            System.out.println("summarized");
            printer.printSummarizedDisplay(teammate1);
            System.out.println("teammate2 equipment:");
            printer.printDetailedDisplay(teammate2);
            System.out.println("summarized");
            printer.printSummarizedDisplay(teammate2);
            teammates.add(teammate1);
            teammates.add(teammate2);
            TeamLeader teamLeader = new TeamLeader(teammates);
            teamLeader.addItem(pc4);
            teamLeader.switchEquipment(teammate1.getId(), pc2.getId(), teammate2.getId());
            System.out.println("after switch equipment:");
            System.out.println("teammate1:");
            printer.printDetailedDisplay(teammate1);
            System.out.println("teammate2:");
            printer.printDetailedDisplay(teammate2);
            System.out.println("team equipment:");
            System.out.println(teamLeader.getTeamEquipment());
        } catch (IOException | SwitchEquipmentException e) {
            System.out.println(e.getMessage());
        }
    }
}

