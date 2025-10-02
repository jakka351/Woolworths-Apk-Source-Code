package com.swrve.sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SwrveFlavour {
    public static final SwrveFlavour d;
    public static final /* synthetic */ SwrveFlavour[] e;

    /* JADX INFO: Fake field, exist only in values array */
    SwrveFlavour EF0;

    static {
        SwrveFlavour swrveFlavour = new SwrveFlavour("AMAZON", 0);
        SwrveFlavour swrveFlavour2 = new SwrveFlavour("CORE", 1);
        SwrveFlavour swrveFlavour3 = new SwrveFlavour("FIREBASE", 2);
        d = swrveFlavour3;
        e = new SwrveFlavour[]{swrveFlavour, swrveFlavour2, swrveFlavour3, new SwrveFlavour("HUAWEI", 3)};
    }

    public static SwrveFlavour valueOf(String str) {
        return (SwrveFlavour) Enum.valueOf(SwrveFlavour.class, str);
    }

    public static SwrveFlavour[] values() {
        return (SwrveFlavour[]) e.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "amazon";
        }
        if (iOrdinal == 1) {
            return "core";
        }
        if (iOrdinal == 2) {
            return "firebase";
        }
        if (iOrdinal == 3) {
            return "huawei";
        }
        throw new IllegalArgumentException();
    }
}
