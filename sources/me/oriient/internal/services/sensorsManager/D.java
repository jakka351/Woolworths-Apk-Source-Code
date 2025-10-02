package me.oriient.internal.services.sensorsManager;

import me.oriient.internal.services.sensorsManager.SensorFreezeMonitor;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class D {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[SensorFreezeMonitor.State.values().length];
        try {
            iArr[SensorFreezeMonitor.State.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SensorFreezeMonitor.State.NON_CRITICAL_RECOVERY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SensorFreezeMonitor.State.RECOVERY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SensorFreezeMonitor.State.RESTART.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SensorFreezeMonitor.State.ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
