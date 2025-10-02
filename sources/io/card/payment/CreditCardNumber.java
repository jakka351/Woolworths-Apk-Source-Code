package io.card.payment;

/* loaded from: classes7.dex */
class CreditCardNumber {
    public static String a(String str, boolean z, CardType cardType) {
        String strA = z ? StringHelper.a(str) : str;
        if (cardType == null) {
            cardType = CardType.fromCardNumber(strA);
        }
        int iNumberLength = cardType.numberLength();
        if (strA.length() != iNumberLength) {
            return str;
        }
        int i = 0;
        if (iNumberLength == 16) {
            StringBuilder sb = new StringBuilder();
            while (i < 16) {
                if (i != 0 && i % 4 == 0) {
                    sb.append(' ');
                }
                sb.append(strA.charAt(i));
                i++;
            }
            return sb.toString();
        }
        if (iNumberLength != 15) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        while (i < 15) {
            if (i == 4 || i == 10) {
                sb2.append(' ');
            }
            sb2.append(strA.charAt(i));
            i++;
        }
        return sb2.toString();
    }
}
