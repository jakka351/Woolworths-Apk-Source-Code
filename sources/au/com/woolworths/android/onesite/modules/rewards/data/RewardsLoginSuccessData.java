package au.com.woolworths.android.onesite.modules.rewards.data;

import au.com.woolworths.android.onesite.network.Component;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsLoginSuccessData;", "", "Lau/com/woolworths/android/onesite/network/Component;", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsTokenData;", "tokenData", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsCardData;", "card", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsAnalyticsData;", "analytics", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsRegionData;", "region", "<init>", "(Lau/com/woolworths/android/onesite/network/Component;Lau/com/woolworths/android/onesite/network/Component;Lau/com/woolworths/android/onesite/network/Component;Lau/com/woolworths/android/onesite/network/Component;)V", "Lau/com/woolworths/android/onesite/network/Component;", "c", "()Lau/com/woolworths/android/onesite/network/Component;", "b", "a", "getRegion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RewardsLoginSuccessData {

    @SerializedName("analytics")
    @NotNull
    private final Component<RewardsAnalyticsData> analytics;

    @SerializedName("rewardsCard")
    @NotNull
    private final Component<RewardsCardData> card;

    @SerializedName("region")
    @Nullable
    private final Component<RewardsRegionData> region;

    @SerializedName("auth")
    @NotNull
    private final Component<RewardsTokenData> tokenData;

    public RewardsLoginSuccessData(@NotNull Component<RewardsTokenData> tokenData, @NotNull Component<RewardsCardData> card, @NotNull Component<RewardsAnalyticsData> analytics, @Nullable Component<RewardsRegionData> component) {
        Intrinsics.h(tokenData, "tokenData");
        Intrinsics.h(card, "card");
        Intrinsics.h(analytics, "analytics");
        this.tokenData = tokenData;
        this.card = card;
        this.analytics = analytics;
        this.region = component;
    }

    /* renamed from: a, reason: from getter */
    public final Component getAnalytics() {
        return this.analytics;
    }

    /* renamed from: b, reason: from getter */
    public final Component getCard() {
        return this.card;
    }

    /* renamed from: c, reason: from getter */
    public final Component getTokenData() {
        return this.tokenData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsLoginSuccessData)) {
            return false;
        }
        RewardsLoginSuccessData rewardsLoginSuccessData = (RewardsLoginSuccessData) obj;
        return Intrinsics.c(this.tokenData, rewardsLoginSuccessData.tokenData) && Intrinsics.c(this.card, rewardsLoginSuccessData.card) && Intrinsics.c(this.analytics, rewardsLoginSuccessData.analytics) && Intrinsics.c(this.region, rewardsLoginSuccessData.region);
    }

    public final int hashCode() {
        int iHashCode = (this.analytics.hashCode() + ((this.card.hashCode() + (this.tokenData.hashCode() * 31)) * 31)) * 31;
        Component<RewardsRegionData> component = this.region;
        return iHashCode + (component == null ? 0 : component.hashCode());
    }

    public final String toString() {
        return "RewardsLoginSuccessData(tokenData=" + this.tokenData + ", card=" + this.card + ", analytics=" + this.analytics + ", region=" + this.region + ")";
    }
}
