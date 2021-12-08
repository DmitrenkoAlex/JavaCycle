package ru.netology.sqr;

public class SqrService {
    public int sqr(int a, int b) {
        int iterrationAmount = 0;
        for (int i = 10; i >= 10 && i <= 99; i++) {
            if (i * i <= b && i * i >= a) {
                iterrationAmount++;

            }
        }
        return iterrationAmount;
    }

}
