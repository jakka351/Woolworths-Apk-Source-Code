package io.card.payment.i18n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class StringKey {
    public static final StringKey d;
    public static final StringKey e;
    public static final StringKey f;
    public static final StringKey g;
    public static final StringKey h;
    public static final StringKey i;
    public static final StringKey j;
    public static final StringKey k;
    public static final StringKey l;
    public static final StringKey m;
    public static final StringKey n;
    public static final StringKey o;
    public static final StringKey p;
    public static final StringKey q;
    public static final StringKey r;
    public static final StringKey s;
    public static final StringKey t;
    public static final StringKey u;
    public static final StringKey v;
    public static final StringKey w;
    public static final /* synthetic */ StringKey[] x;

    static {
        StringKey stringKey = new StringKey("CANCEL", 0);
        d = stringKey;
        StringKey stringKey2 = new StringKey("CARDTYPE_AMERICANEXPRESS", 1);
        e = stringKey2;
        StringKey stringKey3 = new StringKey("CARDTYPE_DISCOVER", 2);
        f = stringKey3;
        StringKey stringKey4 = new StringKey("CARDTYPE_JCB", 3);
        g = stringKey4;
        StringKey stringKey5 = new StringKey("CARDTYPE_MASTERCARD", 4);
        h = stringKey5;
        StringKey stringKey6 = new StringKey("CARDTYPE_MAESTRO", 5);
        i = stringKey6;
        StringKey stringKey7 = new StringKey("CARDTYPE_VISA", 6);
        j = stringKey7;
        StringKey stringKey8 = new StringKey("DONE", 7);
        k = stringKey8;
        StringKey stringKey9 = new StringKey("ENTRY_CVV", 8);
        l = stringKey9;
        StringKey stringKey10 = new StringKey("ENTRY_POSTAL_CODE", 9);
        m = stringKey10;
        StringKey stringKey11 = new StringKey("ENTRY_CARDHOLDER_NAME", 10);
        n = stringKey11;
        StringKey stringKey12 = new StringKey("ENTRY_EXPIRES", 11);
        o = stringKey12;
        StringKey stringKey13 = new StringKey("EXPIRES_PLACEHOLDER", 12);
        p = stringKey13;
        StringKey stringKey14 = new StringKey("SCAN_GUIDE", 13);
        q = stringKey14;
        StringKey stringKey15 = new StringKey("KEYBOARD", 14);
        r = stringKey15;
        StringKey stringKey16 = new StringKey("ENTRY_CARD_NUMBER", 15);
        s = stringKey16;
        StringKey stringKey17 = new StringKey("MANUAL_ENTRY_TITLE", 16);
        t = stringKey17;
        StringKey stringKey18 = new StringKey("ERROR_NO_DEVICE_SUPPORT", 17);
        u = stringKey18;
        StringKey stringKey19 = new StringKey("ERROR_CAMERA_CONNECT_FAIL", 18);
        v = stringKey19;
        StringKey stringKey20 = new StringKey("ERROR_CAMERA_UNEXPECTED_FAIL", 19);
        w = stringKey20;
        x = new StringKey[]{stringKey, stringKey2, stringKey3, stringKey4, stringKey5, stringKey6, stringKey7, stringKey8, stringKey9, stringKey10, stringKey11, stringKey12, stringKey13, stringKey14, stringKey15, stringKey16, stringKey17, stringKey18, stringKey19, stringKey20};
    }

    public static StringKey valueOf(String str) {
        return (StringKey) Enum.valueOf(StringKey.class, str);
    }

    public static StringKey[] values() {
        return (StringKey[]) x.clone();
    }
}
