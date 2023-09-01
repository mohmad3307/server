package com.server.app.Base64;

public class encryption {

    public static String encodeBase64(byte[] input) {
        // مصفوفة تحتوي على الأحرف المسموح بها في Base64
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

        // StringBuilder لتجميع النص المشفر
        StringBuilder result = new StringBuilder();

        // التكرار على البيانات الأصلية بمجموعات من ثلاثة بايتات
        for (int i = 0; i < input.length; i += 3) {
            // دمج الثلاثة بايتات في قيمة واحدة 24 بت
            int val = (0xFF & input[i]) << 16 |
                    (i + 1 < input.length ? (0xFF & input[i + 1]) << 8 : 0) |
                    (i + 2 < input.length ? (0xFF & input[i + 2]) : 0);

            // تحويل القيمة المجمعة إلى حروف Base64
            result.append(chars[(val >> 18) & 0x3F]); // حرف 1
            result.append(chars[(val >> 12) & 0x3F]); // حرف 2

            // إضافة padding حسب الحاجة
            if (i + 1 < input.length) {
                result.append(chars[(val >> 6) & 0x3F]); // حرف 3
            } else {
                result.append('='); // padding
            }
            if (i + 2 < input.length) {
                result.append(chars[val & 0x3F]); // حرف 4
            } else {
                result.append('='); // padding
            }
        }

        return result.toString();
    }
    private static int charToValue(char c, char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                return i;
            }
        }
        return -1;
    }
}

