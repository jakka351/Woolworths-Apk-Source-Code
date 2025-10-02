package me.oriient.internal.services.elog;

import me.oriient.internal.services.elog.ELog;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ELog.Level.values().length];
        try {
            iArr[ELog.Level.INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ELog.Level.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ELog.Level.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ELog.Level.SEVERE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
