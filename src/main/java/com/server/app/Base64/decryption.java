package com.server.app.Base64;

public class decryption {
    public static byte[] decodeBase64(String input) {
        // مصفوفة تحتوي على الأحرف المسموح بها في Base64
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

        // مصفوفة لتخزين البايتات المفككة
        byte[] result = new byte[input.length() * 3 / 4];
        int resultIndex = 0;

        int[] values = new int[4];
        // التكرار على النص المشفر بمجموعات من أربعة أحرف
        for (int i = 0; i < input.length(); i += 4) {
            // تحويل الأحرف إلى قيم Base64 باستخدام دالة مساعدة
            values[0] = charToValue(input.charAt(i), chars); // حرف 1
            values[1] = charToValue(input.charAt(i + 1), chars); // حرف 2
            values[2] = charToValue(input.charAt(i + 2), chars); // حرف 3
            values[3] = charToValue(input.charAt(i + 3), chars); // حرف 4

            // إعادة القيم إلى بايتات أصلية باستخدام التحويلات المناسبة
            result[resultIndex++] = (byte) ((values[0] << 2) | (values[1] >> 4)); // بايت 1
            if (values[2] < 64) {
                result[resultIndex++] = (byte) ((values[1] << 4) | (values[2] >> 2)); // بايت 2
            }
            if (values[3] < 64) {
                result[resultIndex++] = (byte) ((values[2] << 6) | values[3]); // بايت 3
            }
        }

        return result;
    }

    // دالة تحويل الحرف إلى قيمة Base64
    private static int charToValue(char c, char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                return i;
            }
        }
        return -1;
    }
}
