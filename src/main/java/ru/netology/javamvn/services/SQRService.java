package ru.netology.javamvn.services;

public class SQRService {

    int x = 150;
    int y = 300;

    public int SqrService(int x, int y) {
        for (int i = 10; i < 99; i ++)
            if (x <= i * i && i * i <= y) {
                {
                    return i;
                }
            }
        return -1;
    }
}
