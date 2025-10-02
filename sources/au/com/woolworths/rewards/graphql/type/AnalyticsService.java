package au.com.woolworths.rewards.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/AnalyticsService;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AnalyticsService {
    public static final Companion e;
    public static final EnumType f;
    public static final AnalyticsService g;
    public static final /* synthetic */ AnalyticsService[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/AnalyticsService$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        AnalyticsService analyticsService = new AnalyticsService("SWRVE", 0, "SWRVE");
        AnalyticsService analyticsService2 = new AnalyticsService("TEALIUM_SCREENS", 1, "TEALIUM_SCREENS");
        AnalyticsService analyticsService3 = new AnalyticsService("FIREBASE", 2, "FIREBASE");
        AnalyticsService analyticsService4 = new AnalyticsService("UNKNOWN__", 3, "UNKNOWN__");
        g = analyticsService4;
        AnalyticsService[] analyticsServiceArr = {analyticsService, analyticsService2, analyticsService3, analyticsService4};
        h = analyticsServiceArr;
        i = EnumEntriesKt.a(analyticsServiceArr);
        e = new Companion();
        f = new EnumType("AnalyticsService", CollectionsKt.R("SWRVE", "TEALIUM_SCREENS", "FIREBASE"));
    }

    public AnalyticsService(String str, int i2, String str2) {
        this.d = str2;
    }

    public static AnalyticsService valueOf(String str) {
        return (AnalyticsService) Enum.valueOf(AnalyticsService.class, str);
    }

    public static AnalyticsService[] values() {
        return (AnalyticsService[]) h.clone();
    }
}
