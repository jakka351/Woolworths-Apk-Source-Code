package me.oriient.ipssdk.realtime.ips;

import kotlin.Metadata;
import me.oriient.internal.services.dataManager.preloading.DataPreloadingManager;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* synthetic */ class CoreLogic$startPositioning$2$onSessionStart$1$2$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[DataPreloadingManager.PreloadingStatus.values().length];
        try {
            iArr[DataPreloadingManager.PreloadingStatus.NOT_PRELOADED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DataPreloadingManager.PreloadingStatus.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DataPreloadingManager.PreloadingStatus.READY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
