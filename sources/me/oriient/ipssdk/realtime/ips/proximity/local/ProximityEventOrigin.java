package me.oriient.ipssdk.realtime.ips.proximity.local;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/proximity/local/ProximityEventOrigin;", "", "shouldReportStatistics", "", "(Ljava/lang/String;IZ)V", "getShouldReportStatistics", "()Z", "CLIENT", "EXIT_REGION", "DASHBOARD_REGION", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ProximityEventOrigin {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProximityEventOrigin[] $VALUES;
    private final boolean shouldReportStatistics;
    public static final ProximityEventOrigin CLIENT = new ProximityEventOrigin("CLIENT", 0, true);
    public static final ProximityEventOrigin EXIT_REGION = new ProximityEventOrigin("EXIT_REGION", 1, false);
    public static final ProximityEventOrigin DASHBOARD_REGION = new ProximityEventOrigin("DASHBOARD_REGION", 2, true);

    private static final /* synthetic */ ProximityEventOrigin[] $values() {
        return new ProximityEventOrigin[]{CLIENT, EXIT_REGION, DASHBOARD_REGION};
    }

    static {
        ProximityEventOrigin[] proximityEventOriginArr$values = $values();
        $VALUES = proximityEventOriginArr$values;
        $ENTRIES = EnumEntriesKt.a(proximityEventOriginArr$values);
    }

    private ProximityEventOrigin(String str, int i, boolean z) {
        this.shouldReportStatistics = z;
    }

    @NotNull
    public static EnumEntries<ProximityEventOrigin> getEntries() {
        return $ENTRIES;
    }

    public static ProximityEventOrigin valueOf(String str) {
        return (ProximityEventOrigin) Enum.valueOf(ProximityEventOrigin.class, str);
    }

    public static ProximityEventOrigin[] values() {
        return (ProximityEventOrigin[]) $VALUES.clone();
    }

    public final boolean getShouldReportStatistics() {
        return this.shouldReportStatistics;
    }
}
