package lab1.analyzer;

import lab1.fillers.Filler;
import lab1.sorters.Sorter;

import java.util.Map;

public class AnalyzerResult {

    private final Sorter sorter;
    private final Filler filler;
    private final Map<Integer, Long> elapsedTime;

    public AnalyzerResult(Sorter sorter, Filler filler, Map<Integer, Long> elapsedTime) {
        this.sorter = sorter;
        this.filler = filler;
        this.elapsedTime = elapsedTime;
    }

    public Sorter getSorter() {
        return sorter;
    }

    public Filler getFiller() {
        return filler;
    }

    public Map<Integer, Long> getElapsedTime() {
        return elapsedTime;
    }

}
