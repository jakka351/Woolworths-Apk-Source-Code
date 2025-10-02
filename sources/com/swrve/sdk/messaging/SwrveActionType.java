package com.swrve.sdk.messaging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SwrveActionType {
    public static final SwrveActionType d;
    public static final SwrveActionType e;
    public static final SwrveActionType f;
    public static final SwrveActionType g;
    public static final SwrveActionType h;
    public static final SwrveActionType i;
    public static final SwrveActionType j;
    public static final SwrveActionType k;
    public static final SwrveActionType l;
    public static final /* synthetic */ SwrveActionType[] m;

    static {
        SwrveActionType swrveActionType = new SwrveActionType("Dismiss", 0);
        d = swrveActionType;
        SwrveActionType swrveActionType2 = new SwrveActionType("Custom", 1);
        e = swrveActionType2;
        SwrveActionType swrveActionType3 = new SwrveActionType("Install", 2);
        f = swrveActionType3;
        SwrveActionType swrveActionType4 = new SwrveActionType("CopyToClipboard", 3);
        g = swrveActionType4;
        SwrveActionType swrveActionType5 = new SwrveActionType("RequestCapabilty", 4);
        h = swrveActionType5;
        SwrveActionType swrveActionType6 = new SwrveActionType("PageLink", 5);
        i = swrveActionType6;
        SwrveActionType swrveActionType7 = new SwrveActionType("OpenNotificationSettings", 6);
        j = swrveActionType7;
        SwrveActionType swrveActionType8 = new SwrveActionType("OpenAppSettings", 7);
        k = swrveActionType8;
        SwrveActionType swrveActionType9 = new SwrveActionType("StartGeo", 8);
        l = swrveActionType9;
        m = new SwrveActionType[]{swrveActionType, swrveActionType2, swrveActionType3, swrveActionType4, swrveActionType5, swrveActionType6, swrveActionType7, swrveActionType8, swrveActionType9};
    }

    public static SwrveActionType valueOf(String str) {
        return (SwrveActionType) Enum.valueOf(SwrveActionType.class, str);
    }

    public static SwrveActionType[] values() {
        return (SwrveActionType[]) m.clone();
    }
}
