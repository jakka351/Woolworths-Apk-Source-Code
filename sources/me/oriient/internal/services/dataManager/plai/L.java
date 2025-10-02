package me.oriient.internal.services.dataManager.plai;

import me.oriient.internal.services.dataManager.CachedDataStatus;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class L {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[CachedDataStatus.values().length];
        try {
            iArr[CachedDataStatus.VALID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CachedDataStatus.INVALID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CachedDataStatus.REFRESH_RECOMMENDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
