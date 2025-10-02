package me.oriient.internal.infra.logAndroid;

import me.oriient.internal.infra.utils.core.Logger;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[Logger.Level.values().length];
        try {
            iArr[Logger.Level.VERBOSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Logger.Level.DEBUG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
