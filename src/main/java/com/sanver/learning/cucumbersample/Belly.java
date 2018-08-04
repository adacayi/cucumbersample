package com.sanver.learning.cucumbersample;

class Belly {
    private int cukeCount = 0;

    void eat(int cukes) {
        cukeCount += cukes;
    }

    void waitFor(int hours) {
        cukeCount = cukeCount - hours * 60;

        if (cukeCount < 0)
            cukeCount = 0;
    }

    boolean isGrowling() {
        return cukeCount == 0;
    }
}
