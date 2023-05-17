package ru.netology.sqr;

public class SQRService {

    public int calc(int lowRange, int upRange) {
        int result = 0;
        for (int i = 10; i < 100; i++) {
            int iSqr = i * i;
            if (iSqr >= lowRange) {
                if (iSqr < upRange) {
                    result = result + 1;
                }
            }

        }
        return result;
    }
}
