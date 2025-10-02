package me.oriient.internal.services.uploadingManager.scheduling;

import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class f {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[DataUploadScheduler.WakeUpReason.values().length];
        try {
            iArr[DataUploadScheduler.WakeUpReason.CHARGER_RECEIVER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DataUploadScheduler.WakeUpReason.CONTROL_RECEIVER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DataUploadScheduler.WakeUpReason.SCHEDULED_JOB.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DataUploadScheduler.WakeUpReason.AGGRESSIVE_MODE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
