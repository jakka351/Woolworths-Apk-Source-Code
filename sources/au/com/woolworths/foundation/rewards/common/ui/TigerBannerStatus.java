package au.com.woolworths.foundation.rewards.common.ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/TigerBannerStatus;", "", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TigerBannerStatus {
    public static final TigerBannerStatus d;
    public static final TigerBannerStatus e;
    public static final TigerBannerStatus f;
    public static final /* synthetic */ TigerBannerStatus[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        TigerBannerStatus tigerBannerStatus = new TigerBannerStatus("Available", 0);
        d = tigerBannerStatus;
        TigerBannerStatus tigerBannerStatus2 = new TigerBannerStatus("Boosted", 1);
        e = tigerBannerStatus2;
        TigerBannerStatus tigerBannerStatus3 = new TigerBannerStatus("Ended", 2);
        f = tigerBannerStatus3;
        TigerBannerStatus[] tigerBannerStatusArr = {tigerBannerStatus, tigerBannerStatus2, tigerBannerStatus3};
        g = tigerBannerStatusArr;
        h = EnumEntriesKt.a(tigerBannerStatusArr);
    }

    public static TigerBannerStatus valueOf(String str) {
        return (TigerBannerStatus) Enum.valueOf(TigerBannerStatus.class, str);
    }

    public static TigerBannerStatus[] values() {
        return (TigerBannerStatus[]) g.clone();
    }
}
