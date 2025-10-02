package me.oriient.internal.services.dataManager.plaiCategories;

import me.oriient.internal.services.dataManager.CachedDataStatus;

/* renamed from: me.oriient.internal.services.dataManager.plaiCategories.q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC1392q {
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
