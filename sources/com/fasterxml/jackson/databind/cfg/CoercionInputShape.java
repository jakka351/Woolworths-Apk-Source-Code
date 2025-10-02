package com.fasterxml.jackson.databind.cfg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class CoercionInputShape {
    public static final CoercionInputShape d;
    public static final CoercionInputShape e;
    public static final CoercionInputShape f;
    public static final CoercionInputShape g;
    public static final CoercionInputShape h;
    public static final CoercionInputShape i;
    public static final /* synthetic */ CoercionInputShape[] j;

    /* JADX INFO: Fake field, exist only in values array */
    CoercionInputShape EF0;

    static {
        CoercionInputShape coercionInputShape = new CoercionInputShape("Array", 0);
        CoercionInputShape coercionInputShape2 = new CoercionInputShape("Object", 1);
        CoercionInputShape coercionInputShape3 = new CoercionInputShape("Integer", 2);
        d = coercionInputShape3;
        CoercionInputShape coercionInputShape4 = new CoercionInputShape("Float", 3);
        e = coercionInputShape4;
        CoercionInputShape coercionInputShape5 = new CoercionInputShape("Boolean", 4);
        f = coercionInputShape5;
        CoercionInputShape coercionInputShape6 = new CoercionInputShape("String", 5);
        g = coercionInputShape6;
        CoercionInputShape coercionInputShape7 = new CoercionInputShape("Binary", 6);
        CoercionInputShape coercionInputShape8 = new CoercionInputShape("EmptyArray", 7);
        h = coercionInputShape8;
        CoercionInputShape coercionInputShape9 = new CoercionInputShape("EmptyObject", 8);
        CoercionInputShape coercionInputShape10 = new CoercionInputShape("EmptyString", 9);
        i = coercionInputShape10;
        j = new CoercionInputShape[]{coercionInputShape, coercionInputShape2, coercionInputShape3, coercionInputShape4, coercionInputShape5, coercionInputShape6, coercionInputShape7, coercionInputShape8, coercionInputShape9, coercionInputShape10};
    }

    public static CoercionInputShape valueOf(String str) {
        return (CoercionInputShape) Enum.valueOf(CoercionInputShape.class, str);
    }

    public static CoercionInputShape[] values() {
        return (CoercionInputShape[]) j.clone();
    }
}
