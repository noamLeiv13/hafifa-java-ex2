package Printer;

import Equipment.Equipment;
import Staff.Teammate;

import java.util.Map;
import java.util.stream.Collectors;

public class ConsolePrinter implements EquipmentPrinter {
    private Map<String, Long> getSummarizedEquipment(Teammate teammate) {
        return teammate.getEquipment().stream().collect(Collectors.groupingBy(e -> e.getUniqueName(),
                Collectors.counting()));
    }

    @Override
    public void summarizedDisplay(Teammate teammate) {
        Map<String, Long> summarizedEquipment = getSummarizedEquipment(teammate);
        for (Map.Entry<String, Long> entry : summarizedEquipment.entrySet()) {
            System.out.println(entry.getValue() + " x " + entry.getKey());
        }
    }

    @Override
    public void DetailedDisplay(Teammate teammate) {
        for (Equipment item : teammate.getEquipment()) {
            System.out.println(item);
        }
    }
}
