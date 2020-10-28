package Printer;

import Equipment.Equipment;
import Staff.Teammate;

import java.util.Map;

public class ConsolePrinter extends BasePrinter {

    @Override
    public void printSummarizedDisplay(Teammate teammate) {
        Map<String, Long> summarizedEquipment = getSummarizedEquipment(teammate);
        for (Map.Entry<String, Long> entry : summarizedEquipment.entrySet()) {
            System.out.println(entry.getValue() + " x " + entry.getKey());
        }
    }

    @Override
    public void printDetailedDisplay(Teammate teammate) {
        for (Equipment item : teammate.getEquipment()) {
            System.out.println(item);
        }
    }
}
