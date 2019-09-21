package com.cultivation.javaBasic.showYourIntelligence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sequence implements Iterable<Integer> {
    private final Integer start;
    private final Integer end;

    public Sequence(Integer start, Integer end) {
        if (start >= end) { throw new IllegalArgumentException("Start must be smaller than End."); }
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new SequenceIterator(start, end);
    }
}

class SequenceIterator implements Iterator<Integer> {
    // TODO: You can add additional fields or methods if you want.
    // <--start
    List<Integer> list = new ArrayList<>();
    Iterator<Integer> iterator;
    // --end-->

    SequenceIterator(Integer start, Integer end) {
        // TODO: please implements the following code to pass the test
        // <--start
        for(int i = start; i < end; i++){
            list.add(i);
        }
        iterator = list.iterator();
        // --end-->
    }

    @Override
    public boolean hasNext() {
        // TODO: please implements the following code to pass the test
        // <--start
        return iterator.hasNext();
        // --end-->
    }

    @Override
    public Integer next() {
        // TODO: please implements the following code to pass the test
        // <--start
        return iterator.next();
        // --end-->
    }
}
