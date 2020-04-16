package Main;

import Equipment.Clothing.FestiveCoat;
import Equipment.Computing.InternetComputer;
import Printer.ConsolePrinter;
import Staff.TeamLeader;
import Staff.Teammate;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Teammate> teammates = new ArrayList<>();
        ConsolePrinter printer = new ConsolePrinter();
        FestiveCoat coat = new FestiveCoat("L");
        InternetComputer pc1 = new InternetComputer("192.123.1.3");
        InternetComputer pc2 = new InternetComputer("222.168.1.1");
        InternetComputer pc3 = new InternetComputer("142.123.124");
        InternetComputer pc4 = new InternetComputer("132.123.125");
        Teammate teammate1 = new Teammate(82455222);
        Teammate teammate2 = new Teammate(82455223);
        teammate1.addItem(coat);
        teammate1.addItem(pc1);
        teammate1.addItem(pc2);
        teammate2.addItem(pc3);
        System.out.println("teammate1 equipment:");
        printer.DetailedDisplay(teammate1);
        printer.summarizedDisplay(teammate1);
        System.out.println("teammate2 equipment:");
        printer.DetailedDisplay(teammate2);
        printer.summarizedDisplay(teammate2);
        teammates.add(teammate1);
        teammates.add(teammate2);
        TeamLeader teamLeader = new TeamLeader(11111, teammates);
        teamLeader.addItem(pc4);
        teamLeader.switchEquipment(82455222, 2, 82455223);
        System.out.println("after switch equipment:");
        System.out.println("teammate1:");
        printer.DetailedDisplay(teammate1);
        System.out.println("teammate2:");
        printer.DetailedDisplay(teammate2);
        System.out.println("team equipment:");
        System.out.println(teamLeader.getTeamEquipment());


    }
}

