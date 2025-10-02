package me.oriient.positioningengine.support;

import me.oriient.internal.services.dataManager.preloading.DataPreloadingManager;
import me.oriient.positioningengine.common.InitiatedBy;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class a0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[InitiatedBy.values().length];
        try {
            iArr[InitiatedBy.CLIENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InitiatedBy.AUTO_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[DataPreloadingManager.PreloadingStatus.values().length];
        try {
            iArr2[DataPreloadingManager.PreloadingStatus.NOT_PRELOADED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[DataPreloadingManager.PreloadingStatus.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[DataPreloadingManager.PreloadingStatus.READY.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
