package au.com.woolworths.foundation.rewards.common.ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/PulsingIndicatorColor;", "", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PulsingIndicatorColor {
    public static final PulsingIndicatorColor d;
    public static final PulsingIndicatorColor e;
    public static final /* synthetic */ PulsingIndicatorColor[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        PulsingIndicatorColor pulsingIndicatorColor = new PulsingIndicatorColor("Available", 0);
        d = pulsingIndicatorColor;
        PulsingIndicatorColor pulsingIndicatorColor2 = new PulsingIndicatorColor("Boosted", 1);
        e = pulsingIndicatorColor2;
        PulsingIndicatorColor[] pulsingIndicatorColorArr = {pulsingIndicatorColor, pulsingIndicatorColor2};
        f = pulsingIndicatorColorArr;
        g = EnumEntriesKt.a(pulsingIndicatorColorArr);
    }

    public static PulsingIndicatorColor valueOf(String str) {
        return (PulsingIndicatorColor) Enum.valueOf(PulsingIndicatorColor.class, str);
    }

    public static PulsingIndicatorColor[] values() {
        return (PulsingIndicatorColor[]) f.clone();
    }
}
