package ru.netology.javamvn.services;

public class SQRService {


    public int SqrService(int minSqr, int maxSqr) {
        int min = 0;
        for (int i = 0; i < 99; i++)
            if (minSqr <= i * i && i * i <= maxSqr) {
                min += 1;
                continue;
            }
        return min;
    }
}