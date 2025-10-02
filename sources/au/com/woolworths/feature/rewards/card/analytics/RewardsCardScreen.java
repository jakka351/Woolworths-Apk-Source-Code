package au.com.woolworths.feature.rewards.card.analytics;

import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/card/analytics/RewardsCardScreen;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RewardsCardScreen implements Screen {
    public static final RewardsCardScreen d;
    public static final /* synthetic */ RewardsCardScreen[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        RewardsCardScreen rewardsCardScreen = new RewardsCardScreen() { // from class: au.com.woolworths.feature.rewards.card.analytics.RewardsCardScreen.CARD_OVERLAY
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Home";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Rewards Barcode screen";
            }
        };
        d = rewardsCardScreen;
        RewardsCardScreen[] rewardsCardScreenArr = {rewardsCardScreen};
        e = rewardsCardScreenArr;
        f = EnumEntriesKt.a(rewardsCardScreenArr);
    }

    public static RewardsCardScreen valueOf(String str) {
        return (RewardsCardScreen) Enum.valueOf(RewardsCardScreen.class, str);
    }

    public static RewardsCardScreen[] values() {
        return (RewardsCardScreen[]) e.clone();
    }
}
