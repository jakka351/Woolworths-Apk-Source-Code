package au.com.woolworths.foundation.rewards.banner.model;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.foundation.rewards.common.ui.banners.analytics.RewardsBannerAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lau/com/woolworths/foundation/rewards/banner/model/RewardsBroadcastBannerApiData;", "", "", "id", "iconUrl", "title", "message", "Lau/com/woolworths/android/onesite/data/ContentCta;", "primaryCta", "", "canDismiss", "Lau/com/woolworths/foundation/rewards/banner/model/ApiElevationType;", "elevationType", "Lau/com/woolworths/foundation/rewards/common/ui/banners/analytics/RewardsBannerAnalytics;", "analytics", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/android/onesite/data/ContentCta;ZLau/com/woolworths/foundation/rewards/banner/model/ApiElevationType;Lau/com/woolworths/foundation/rewards/common/ui/banners/analytics/RewardsBannerAnalytics;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getIconUrl", "getTitle", "getMessage", "Lau/com/woolworths/android/onesite/data/ContentCta;", "getPrimaryCta", "()Lau/com/woolworths/android/onesite/data/ContentCta;", "Z", "getCanDismiss", "()Z", "Lau/com/woolworths/foundation/rewards/banner/model/ApiElevationType;", "getElevationType", "()Lau/com/woolworths/foundation/rewards/banner/model/ApiElevationType;", "Lau/com/woolworths/foundation/rewards/common/ui/banners/analytics/RewardsBannerAnalytics;", "getAnalytics", "()Lau/com/woolworths/foundation/rewards/common/ui/banners/analytics/RewardsBannerAnalytics;", "banner-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RewardsBroadcastBannerApiData {

    @SerializedName("analytics")
    @NotNull
    private final RewardsBannerAnalytics analytics;

    @SerializedName("canDismiss")
    private final boolean canDismiss;

    @SerializedName("elevationType")
    @NotNull
    private final ApiElevationType elevationType;

    @SerializedName("iconUrl")
    @Nullable
    private final String iconUrl;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("message")
    @NotNull
    private final String message;

    @SerializedName("primaryCta")
    @Nullable
    private final ContentCta primaryCta;

    @SerializedName("title")
    @Nullable
    private final String title;

    public RewardsBroadcastBannerApiData(@NotNull String id, @Nullable String str, @Nullable String str2, @NotNull String message, @Nullable ContentCta contentCta, boolean z, @NotNull ApiElevationType elevationType, @NotNull RewardsBannerAnalytics analytics) {
        Intrinsics.h(id, "id");
        Intrinsics.h(message, "message");
        Intrinsics.h(elevationType, "elevationType");
        Intrinsics.h(analytics, "analytics");
        this.id = id;
        this.iconUrl = str;
        this.title = str2;
        this.message = message;
        this.primaryCta = contentCta;
        this.canDismiss = z;
        this.elevationType = elevationType;
        this.analytics = analytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsBroadcastBannerApiData)) {
            return false;
        }
        RewardsBroadcastBannerApiData rewardsBroadcastBannerApiData = (RewardsBroadcastBannerApiData) obj;
        return Intrinsics.c(this.id, rewardsBroadcastBannerApiData.id) && Intrinsics.c(this.iconUrl, rewardsBroadcastBannerApiData.iconUrl) && Intrinsics.c(this.title, rewardsBroadcastBannerApiData.title) && Intrinsics.c(this.message, rewardsBroadcastBannerApiData.message) && Intrinsics.c(this.primaryCta, rewardsBroadcastBannerApiData.primaryCta) && this.canDismiss == rewardsBroadcastBannerApiData.canDismiss && this.elevationType == rewardsBroadcastBannerApiData.elevationType && Intrinsics.c(this.analytics, rewardsBroadcastBannerApiData.analytics);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.iconUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iC = b.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.message);
        ContentCta contentCta = this.primaryCta;
        return this.analytics.hashCode() + ((this.elevationType.hashCode() + b.e((iC + (contentCta != null ? contentCta.hashCode() : 0)) * 31, 31, this.canDismiss)) * 31);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.iconUrl;
        String str3 = this.title;
        String str4 = this.message;
        ContentCta contentCta = this.primaryCta;
        boolean z = this.canDismiss;
        ApiElevationType apiElevationType = this.elevationType;
        RewardsBannerAnalytics rewardsBannerAnalytics = this.analytics;
        StringBuilder sbV = a.v("RewardsBroadcastBannerApiData(id=", str, ", iconUrl=", str2, ", title=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", message=", str4, ", primaryCta=");
        sbV.append(contentCta);
        sbV.append(", canDismiss=");
        sbV.append(z);
        sbV.append(", elevationType=");
        sbV.append(apiElevationType);
        sbV.append(", analytics=");
        sbV.append(rewardsBannerAnalytics);
        sbV.append(")");
        return sbV.toString();
    }
}
