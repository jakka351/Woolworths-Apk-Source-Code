package me.oriient.internal.infra.scheduler;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ExistingWorkPolicy.values().length];
        try {
            iArr[ExistingWorkPolicy.KEEP_EXISTING_AND_DO_NOTHING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ExistingWorkPolicy.REPLACE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ExistingWorkPolicy.APPEND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
