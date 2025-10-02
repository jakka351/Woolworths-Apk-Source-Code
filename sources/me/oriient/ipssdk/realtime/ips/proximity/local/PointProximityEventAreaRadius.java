package me.oriient.ipssdk.realtime.ips.proximity.local;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/proximity/local/PointProximityEventAreaRadius;", "", "(Ljava/lang/String;I)V", "SMALL", "MEDIUM", "LARGE", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PointProximityEventAreaRadius {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PointProximityEventAreaRadius[] $VALUES;
    public static final PointProximityEventAreaRadius SMALL = new PointProximityEventAreaRadius("SMALL", 0);
    public static final PointProximityEventAreaRadius MEDIUM = new PointProximityEventAreaRadius("MEDIUM", 1);
    public static final PointProximityEventAreaRadius LARGE = new PointProximityEventAreaRadius("LARGE", 2);

    private static final /* synthetic */ PointProximityEventAreaRadius[] $values() {
        return new PointProximityEventAreaRadius[]{SMALL, MEDIUM, LARGE};
    }

    static {
        PointProximityEventAreaRadius[] pointProximityEventAreaRadiusArr$values = $values();
        $VALUES = pointProximityEventAreaRadiusArr$values;
        $ENTRIES = EnumEntriesKt.a(pointProximityEventAreaRadiusArr$values);
    }

    private PointProximityEventAreaRadius(String str, int i) {
    }

    @NotNull
    public static EnumEntries<PointProximityEventAreaRadius> getEntries() {
        return $ENTRIES;
    }

    public static PointProximityEventAreaRadius valueOf(String str) {
        return (PointProximityEventAreaRadius) Enum.valueOf(PointProximityEventAreaRadius.class, str);
    }

    public static PointProximityEventAreaRadius[] values() {
        return (PointProximityEventAreaRadius[]) $VALUES.clone();
    }
}
