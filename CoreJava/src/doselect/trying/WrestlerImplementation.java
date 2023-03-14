package doselect.trying;

import java.util.*;
import java.util.stream.Collectors;
public class WrestlerImplementation {
    public int getSumOfWeight(List<Wrestle> list) {
        return list.stream()
                   .filter(wrestle -> wrestle.getWeight() > 200)
                   .mapToInt(Wrestle::getWeight)
                   .sum();
    }

    public List<String> getWrestlerName(List<Wrestle> list) {
        return list.stream()
                   .map(Wrestle::getName)
                   .collect(Collectors.toList());
    }

    public int getMaxWeight(List<Wrestle> list) {
        return list.stream()
                   .mapToInt(Wrestle::getWeight)
                   .max()
                   .orElseThrow(NoSuchElementException::new);
    }
}