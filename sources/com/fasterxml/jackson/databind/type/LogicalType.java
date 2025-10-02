package com.fasterxml.jackson.databind.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class LogicalType {
    public static final LogicalType d;
    public static final LogicalType e;
    public static final LogicalType f;
    public static final LogicalType g;
    public static final LogicalType h;
    public static final LogicalType i;
    public static final LogicalType j;
    public static final LogicalType k;
    public static final LogicalType l;
    public static final LogicalType m;
    public static final LogicalType n;
    public static final LogicalType o;
    public static final LogicalType p;
    public static final /* synthetic */ LogicalType[] q;

    static {
        LogicalType logicalType = new LogicalType("Array", 0);
        d = logicalType;
        LogicalType logicalType2 = new LogicalType("Collection", 1);
        e = logicalType2;
        LogicalType logicalType3 = new LogicalType("Map", 2);
        f = logicalType3;
        LogicalType logicalType4 = new LogicalType("POJO", 3);
        g = logicalType4;
        LogicalType logicalType5 = new LogicalType("Untyped", 4);
        h = logicalType5;
        LogicalType logicalType6 = new LogicalType("Integer", 5);
        i = logicalType6;
        LogicalType logicalType7 = new LogicalType("Float", 6);
        j = logicalType7;
        LogicalType logicalType8 = new LogicalType("Boolean", 7);
        k = logicalType8;
        LogicalType logicalType9 = new LogicalType("Enum", 8);
        l = logicalType9;
        LogicalType logicalType10 = new LogicalType("Textual", 9);
        m = logicalType10;
        LogicalType logicalType11 = new LogicalType("Binary", 10);
        n = logicalType11;
        LogicalType logicalType12 = new LogicalType("DateTime", 11);
        o = logicalType12;
        LogicalType logicalType13 = new LogicalType("OtherScalar", 12);
        p = logicalType13;
        q = new LogicalType[]{logicalType, logicalType2, logicalType3, logicalType4, logicalType5, logicalType6, logicalType7, logicalType8, logicalType9, logicalType10, logicalType11, logicalType12, logicalType13};
    }

    public static LogicalType valueOf(String str) {
        return (LogicalType) Enum.valueOf(LogicalType.class, str);
    }

    public static LogicalType[] values() {
        return (LogicalType[]) q.clone();
    }
}
