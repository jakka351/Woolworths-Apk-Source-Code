package me.oriient.ipssdk.realtime.ips.proximity;

import kotlin.Metadata;
import me.oriient.ipssdk.realtime.ips.proximity.ProximityStatsManager;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* synthetic */ class ProximityStatsManagerImpl$onEventTriggered$1$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ProximityStatsManager.EventShape.values().length];
        try {
            iArr[ProximityStatsManager.EventShape.CIRCLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProximityStatsManager.EventShape.POLYGON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProximityStatsManager.EventShape.RECTANGLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ProximityStatsManager.EventShape.WALKING_DISTANCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
