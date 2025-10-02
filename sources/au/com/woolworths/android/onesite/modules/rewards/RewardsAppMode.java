package au.com.woolworths.android.onesite.modules.rewards;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/modules/rewards/RewardsAppMode;", "", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsAppMode {
    public static final RewardsAppMode d;
    public static final RewardsAppMode e;
    public static final RewardsAppMode f;
    public static final /* synthetic */ RewardsAppMode[] g;
    public static final /* synthetic */ EnumEntries h;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/rewards/RewardsAppMode$Companion;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        RewardsAppMode rewardsAppMode = new RewardsAppMode("Default", 0);
        d = rewardsAppMode;
        RewardsAppMode rewardsAppMode2 = new RewardsAppMode("NewZealand", 1);
        e = rewardsAppMode2;
        RewardsAppMode rewardsAppMode3 = new RewardsAppMode("Lite", 2);
        f = rewardsAppMode3;
        RewardsAppMode[] rewardsAppModeArr = {rewardsAppMode, rewardsAppMode2, rewardsAppMode3};
        g = rewardsAppModeArr;
        h = EnumEntriesKt.a(rewardsAppModeArr);
    }

    public static RewardsAppMode valueOf(String str) {
        return (RewardsAppMode) Enum.valueOf(RewardsAppMode.class, str);
    }

    public static RewardsAppMode[] values() {
        return (RewardsAppMode[]) g.clone();
    }
}
