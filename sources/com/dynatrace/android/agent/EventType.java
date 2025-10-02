package com.dynatrace.android.agent;

import com.dynatrace.android.agent.conf.DataCollectionLevel;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class EventType {
    public static final EventType f;
    public static final EventType g;
    public static final EventType h;
    public static final EventType i;
    public static final EventType j;
    public static final EventType k;
    public static final EventType l;
    public static final EventType m;
    public static final EventType n;
    public static final EventType o;
    public static final EventType p;
    public static final EventType q;
    public static final EventType r;
    public static final EventType s;
    public static final EventType t;
    public static final EventType u;
    public static final EventType v;
    public static final /* synthetic */ EventType[] w;
    public final int d;
    public final DataCollectionLevel e;

    static {
        DataCollectionLevel dataCollectionLevel = DataCollectionLevel.PERFORMANCE;
        EventType eventType = new EventType("ACTION_MANUAL", 0, 1, dataCollectionLevel);
        f = eventType;
        EventType eventType2 = new EventType("ACTION_AUTO", 1, 6, dataCollectionLevel);
        g = eventType2;
        DataCollectionLevel dataCollectionLevel2 = DataCollectionLevel.OFF;
        EventType eventType3 = new EventType("ACTION_AUTO_LOADING_APP", 2, 6, dataCollectionLevel2);
        h = eventType3;
        DataCollectionLevel dataCollectionLevel3 = DataCollectionLevel.USER_BEHAVIOR;
        EventType eventType4 = new EventType("NAMED_EVENT", 3, 10, dataCollectionLevel3);
        i = eventType4;
        EventType eventType5 = new EventType("VALUE_STRING", 4, 11, dataCollectionLevel3);
        j = eventType5;
        EventType eventType6 = new EventType("VALUE_INT64", 5, 12, dataCollectionLevel3);
        k = eventType6;
        EventType eventType7 = new EventType("VALUE_DOUBLE", 6, 13, dataCollectionLevel3);
        l = eventType7;
        EventType eventType8 = new EventType("VISIT_END", 7, 19, dataCollectionLevel);
        EventType eventType9 = new EventType("APP_START", 8, 20, dataCollectionLevel);
        m = eventType9;
        EventType eventType10 = new EventType("DISPLAY", 9, 21, dataCollectionLevel);
        n = eventType10;
        EventType eventType11 = new EventType("REDISPLAY", 10, 22, dataCollectionLevel);
        o = eventType11;
        EventType eventType12 = new EventType("WEB_REQUEST", 11, 30, dataCollectionLevel);
        p = eventType12;
        EventType eventType13 = new EventType("ERROR_INT", 12, 40, dataCollectionLevel);
        q = eventType13;
        EventType eventType14 = new EventType("ERROR_EXCEPTION", 13, 42, dataCollectionLevel);
        r = eventType14;
        EventType eventType15 = new EventType("CRASH", 14, 50, dataCollectionLevel2);
        s = eventType15;
        EventType eventType16 = new EventType("IDENTIFY_USER", 15, 60, dataCollectionLevel3);
        t = eventType16;
        EventType eventType17 = new EventType("SELF_MONITORING_EVENT", 16, 90, dataCollectionLevel);
        EventType eventType18 = new EventType("RAGE_TAP", 17, 97, dataCollectionLevel);
        u = eventType18;
        EventType eventType19 = new EventType("EVENT_API", 18, 98, dataCollectionLevel2);
        EventType eventType20 = new EventType("PLACEHOLDER", 19, -1, dataCollectionLevel3);
        v = eventType20;
        w = new EventType[]{eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7, eventType8, eventType9, eventType10, eventType11, eventType12, eventType13, eventType14, eventType15, eventType16, eventType17, eventType18, eventType19, eventType20};
    }

    public EventType(String str, int i2, int i3, DataCollectionLevel dataCollectionLevel) {
        this.d = i3;
        this.e = dataCollectionLevel;
    }

    public static EventType valueOf(String str) {
        return (EventType) Enum.valueOf(EventType.class, str);
    }

    public static EventType[] values() {
        return (EventType[]) w.clone();
    }
}
