package ru.netology.sqr;

public class SqrService {
    public int sqr(int lowerBound, int upperBound) {
        int iterrationAmount = 0;
        for (int i = 10; i >= 10 && i <= 99; i++) {
            if (i * i <= upperBound && i * i >= lowerBound) {
                iterrationAmount++;

            }
        }
        return iterrationAmount;
    }

}
