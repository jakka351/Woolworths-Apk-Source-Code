package au.com.woolworths.android.onesite.modules.rewards.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsCardMode;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsCardMode {
    public static final RewardsCardMode d;
    public static final RewardsCardMode e;
    public static final /* synthetic */ RewardsCardMode[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        RewardsCardMode rewardsCardMode = new RewardsCardMode("Default", 0);
        d = rewardsCardMode;
        RewardsCardMode rewardsCardMode2 = new RewardsCardMode("Limited", 1);
        e = rewardsCardMode2;
        RewardsCardMode[] rewardsCardModeArr = {rewardsCardMode, rewardsCardMode2};
        f = rewardsCardModeArr;
        g = EnumEntriesKt.a(rewardsCardModeArr);
    }

    public static RewardsCardMode valueOf(String str) {
        return (RewardsCardMode) Enum.valueOf(RewardsCardMode.class, str);
    }

    public static RewardsCardMode[] values() {
        return (RewardsCardMode[]) f.clone();
    }
}
