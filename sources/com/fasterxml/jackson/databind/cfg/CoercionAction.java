package com.fasterxml.jackson.databind.cfg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class CoercionAction {
    public static final CoercionAction d;
    public static final CoercionAction e;
    public static final CoercionAction f;
    public static final CoercionAction g;
    public static final /* synthetic */ CoercionAction[] h;

    static {
        CoercionAction coercionAction = new CoercionAction("Fail", 0);
        d = coercionAction;
        CoercionAction coercionAction2 = new CoercionAction("TryConvert", 1);
        e = coercionAction2;
        CoercionAction coercionAction3 = new CoercionAction("AsNull", 2);
        f = coercionAction3;
        CoercionAction coercionAction4 = new CoercionAction("AsEmpty", 3);
        g = coercionAction4;
        h = new CoercionAction[]{coercionAction, coercionAction2, coercionAction3, coercionAction4};
    }

    public static CoercionAction valueOf(String str) {
        return (CoercionAction) Enum.valueOf(CoercionAction.class, str);
    }

    public static CoercionAction[] values() {
        return (CoercionAction[]) h.clone();
    }
}
