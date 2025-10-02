package au.com.woolworths.rewards.base;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/rewards/base/RewardsDeepLink;", "", "Extras", "BoostersTabs", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsDeepLink {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/base/RewardsDeepLink$BoostersTabs;", "", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BoostersTabs {
        public static final /* synthetic */ BoostersTabs[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            BoostersTabs[] boostersTabsArr = {new BoostersTabs("OFFERS", 0), new BoostersTabs("SPECIALS", 1)};
            d = boostersTabsArr;
            e = EnumEntriesKt.a(boostersTabsArr);
        }

        public static BoostersTabs valueOf(String str) {
            return (BoostersTabs) Enum.valueOf(BoostersTabs.class, str);
        }

        public static BoostersTabs[] values() {
            return (BoostersTabs[]) d.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/base/RewardsDeepLink$Extras;", "", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Extras {
    }
}
