package au.com.woolworths.feature.rewards.account.settings.v2.model;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.rewards.banner.model.RewardsNotificationBannerApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/v2/model/AccountItemSeen;", "", "Banner", "Lau/com/woolworths/feature/rewards/account/settings/v2/model/AccountItemSeen$Banner;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AccountItemSeen {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/v2/model/AccountItemSeen$Banner;", "Lau/com/woolworths/feature/rewards/account/settings/v2/model/AccountItemSeen;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Banner implements AccountItemSeen {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsNotificationBannerApiData f5791a;

        public Banner(RewardsNotificationBannerApiData banner) {
            Intrinsics.h(banner, "banner");
            this.f5791a = banner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Banner) && Intrinsics.c(this.f5791a, ((Banner) obj).f5791a);
        }

        public final int hashCode() {
            return this.f5791a.hashCode();
        }

        public final String toString() {
            return "Banner(banner=" + this.f5791a + ")";
        }
    }
}
