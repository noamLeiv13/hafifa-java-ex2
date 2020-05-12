package Printer;


import Equipment.Equipment;
import Staff.Teammate;

import java.util.Map;
import java.util.stream.Collectors;

public abstract class BasePrinter implements EquipmentPrinter {

    public Map<String, Long> getSummarizedEquipment(Teammate teammate) {
        return teammate.getEquipment().stream().collect(Collectors.groupingBy(Equipment::getUniqueName,
                Collectors.counting()));
    }


}
