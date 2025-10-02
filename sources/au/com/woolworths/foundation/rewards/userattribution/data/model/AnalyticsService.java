package au.com.woolworths.foundation.rewards.userattribution.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/userattribution/data/model/AnalyticsService;", "", "userattribution-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AnalyticsService {
    public static final /* synthetic */ AnalyticsService[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        AnalyticsService[] analyticsServiceArr = {new AnalyticsService("SWRVE", 0), new AnalyticsService("TEALIUM_SCREENS", 1), new AnalyticsService("FIREBASE", 2)};
        d = analyticsServiceArr;
        e = EnumEntriesKt.a(analyticsServiceArr);
    }

    public static AnalyticsService valueOf(String str) {
        return (AnalyticsService) Enum.valueOf(AnalyticsService.class, str);
    }

    public static AnalyticsService[] values() {
        return (AnalyticsService[]) d.clone();
    }
}
