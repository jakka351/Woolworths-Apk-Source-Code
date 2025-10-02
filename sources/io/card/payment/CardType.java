package io.card.payment;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import io.card.payment.i18n.LocalizedStrings;
import io.card.payment.i18n.StringKey;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes7.dex */
public enum CardType {
    AMEX("AmEx"),
    DINERSCLUB("DinersClub"),
    DISCOVER("Discover"),
    JCB("JCB"),
    MASTERCARD("MasterCard"),
    VISA("Visa"),
    MAESTRO("Maestro"),
    UNKNOWN("Unknown"),
    INSUFFICIENT_DIGITS("More digits required");

    public static final int d;
    public static final HashMap e;
    public final String name;

    /* renamed from: io.card.payment.CardType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23878a;

        static {
            int[] iArr = new int[CardType.values().length];
            f23878a = iArr;
            try {
                iArr[CardType.AMEX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23878a[CardType.DINERSCLUB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23878a[CardType.DISCOVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23878a[CardType.JCB.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23878a[CardType.MASTERCARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23878a[CardType.MAESTRO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23878a[CardType.VISA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23878a[CardType.INSUFFICIENT_DIGITS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23878a[CardType.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        CardType cardType = AMEX;
        CardType cardType2 = DINERSCLUB;
        CardType cardType3 = DISCOVER;
        CardType cardType4 = JCB;
        CardType cardType5 = MASTERCARD;
        CardType cardType6 = VISA;
        CardType cardType7 = MAESTRO;
        d = 1;
        HashMap map = new HashMap();
        e = map;
        map.put(a("2221", "2720"), cardType5);
        map.put(a("300", "305"), cardType2);
        map.put(a("309", null), cardType2);
        map.put(a("34", null), cardType);
        map.put(a("3528", "3589"), cardType4);
        map.put(a("36", null), cardType2);
        map.put(a("37", null), cardType);
        map.put(a("38", "39"), cardType2);
        map.put(a("4", null), cardType6);
        map.put(a("50", null), cardType7);
        map.put(a("51", "55"), cardType5);
        map.put(a("56", "59"), cardType7);
        map.put(a("6011", null), cardType3);
        map.put(a("61", null), cardType7);
        map.put(a("62", null), cardType3);
        map.put(a("63", null), cardType7);
        map.put(a("644", "649"), cardType3);
        map.put(a("65", null), cardType3);
        map.put(a("66", "69"), cardType7);
        map.put(a("88", null), cardType3);
        for (Map.Entry entry : map.entrySet()) {
            int iMax = Math.max(d, ((String) ((Pair) entry.getKey()).first).length());
            d = iMax;
            if (((Pair) entry.getKey()).second != null) {
                d = Math.max(iMax, ((String) ((Pair) entry.getKey()).second).length());
            }
        }
    }

    CardType(String str) {
        this.name = str;
    }

    public static Pair a(String str, String str2) {
        if (str2 == null) {
            str2 = str;
        }
        return new Pair(str, str2);
    }

    public static CardType fromCardNumber(String str) {
        if (TextUtils.isEmpty(str)) {
            return UNKNOWN;
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : e.entrySet()) {
            String str2 = (String) ((Pair) entry.getKey()).first;
            String str3 = (String) ((Pair) entry.getKey()).second;
            int iMin = Math.min(str.length(), str2.length());
            int iMin2 = Math.min(str.length(), str3.length());
            if (Integer.parseInt(str.substring(0, iMin)) >= Integer.parseInt(str2.substring(0, iMin)) && Integer.parseInt(str.substring(0, iMin2)) <= Integer.parseInt(str3.substring(0, iMin2))) {
                hashSet.add(entry.getValue());
            }
        }
        return hashSet.size() > 1 ? INSUFFICIENT_DIGITS : hashSet.size() == 1 ? (CardType) hashSet.iterator().next() : UNKNOWN;
    }

    public static CardType fromString(String str) {
        if (str == null) {
            return UNKNOWN;
        }
        for (CardType cardType : values()) {
            if (cardType != UNKNOWN && cardType != INSUFFICIENT_DIGITS && str.equalsIgnoreCase(cardType.toString())) {
                return cardType;
            }
        }
        return UNKNOWN;
    }

    public int cvvLength() {
        switch (AnonymousClass1.f23878a[ordinal()]) {
            case 1:
                return 4;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return 3;
            default:
                return -1;
        }
    }

    public String getDisplayName(String str) {
        switch (AnonymousClass1.f23878a[ordinal()]) {
            case 1:
                return LocalizedStrings.b(StringKey.e, str);
            case 2:
            case 3:
                return LocalizedStrings.b(StringKey.f, str);
            case 4:
                return LocalizedStrings.b(StringKey.g, str);
            case 5:
                return LocalizedStrings.b(StringKey.h, str);
            case 6:
                return LocalizedStrings.b(StringKey.i, str);
            case 7:
                return LocalizedStrings.b(StringKey.j, str);
            default:
                return null;
        }
    }

    public Bitmap imageBitmap(Context context) {
        int i = AnonymousClass1.f23878a[ordinal()];
        int i2 = i != 1 ? (i == 2 || i == 3) ? R.drawable.cio_ic_discover : i != 4 ? i != 5 ? i != 7 ? -1 : R.drawable.cio_ic_visa : R.drawable.cio_ic_mastercard : R.drawable.cio_ic_jcb : R.drawable.cio_ic_amex;
        if (i2 != -1) {
            return BitmapFactory.decodeResource(context.getResources(), i2);
        }
        return null;
    }

    public int numberLength() {
        switch (AnonymousClass1.f23878a[ordinal()]) {
            case 1:
                return 15;
            case 2:
                return 14;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return 16;
            case 8:
                return d;
            default:
                return -1;
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
