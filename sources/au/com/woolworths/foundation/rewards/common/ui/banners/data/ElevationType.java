package au.com.woolworths.foundation.rewards.common.ui.banners.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/banners/data/ElevationType;", "", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ElevationType {
    public static final /* synthetic */ ElevationType[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        ElevationType[] elevationTypeArr = {new ElevationType("INLINE", 0), new ElevationType("ELEVATED", 1)};
        d = elevationTypeArr;
        e = EnumEntriesKt.a(elevationTypeArr);
    }

    public static ElevationType valueOf(String str) {
        return (ElevationType) Enum.valueOf(ElevationType.class, str);
    }

    public static ElevationType[] values() {
        return (ElevationType[]) d.clone();
    }
}
