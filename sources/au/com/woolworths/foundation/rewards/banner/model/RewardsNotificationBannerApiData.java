package au.com.woolworths.foundation.rewards.banner.model;

import YU.a;
import androidx.annotation.DrawableRes;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.design.wx.foundation.AccentColors;
import au.com.woolworths.design.wx.foundation.RewardsColors;
import au.com.woolworths.design.wx.foundation.TintColors;
import au.com.woolworths.foundation.rewards.common.ui.banners.analytics.RewardsBannerAnalytics;
import au.com.woolworths.graphql.DefaultValue;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lau/com/woolworths/foundation/rewards/banner/model/RewardsNotificationBannerApiData;", "", "", "id", "title", "message", "Lau/com/woolworths/foundation/rewards/banner/model/RewardsNotificationBannerApiData$DisplayType;", "displayType", "Lau/com/woolworths/android/onesite/data/ContentCta;", "primaryCta", "", "canDismiss", "shouldShowNewBadge", "Lau/com/woolworths/foundation/rewards/common/ui/banners/analytics/RewardsBannerAnalytics;", "analytics", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/foundation/rewards/banner/model/RewardsNotificationBannerApiData$DisplayType;Lau/com/woolworths/android/onesite/data/ContentCta;ZZLau/com/woolworths/foundation/rewards/common/ui/banners/analytics/RewardsBannerAnalytics;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "h", "e", "Lau/com/woolworths/foundation/rewards/banner/model/RewardsNotificationBannerApiData$DisplayType;", "c", "()Lau/com/woolworths/foundation/rewards/banner/model/RewardsNotificationBannerApiData$DisplayType;", "Lau/com/woolworths/android/onesite/data/ContentCta;", "f", "()Lau/com/woolworths/android/onesite/data/ContentCta;", "Z", "b", "()Z", "g", "Lau/com/woolworths/foundation/rewards/common/ui/banners/analytics/RewardsBannerAnalytics;", "a", "()Lau/com/woolworths/foundation/rewards/common/ui/banners/analytics/RewardsBannerAnalytics;", "DisplayType", "banner-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RewardsNotificationBannerApiData {

    @SerializedName("analytics")
    @Nullable
    private final RewardsBannerAnalytics analytics;

    @SerializedName("canDismiss")
    private final boolean canDismiss;

    @SerializedName("displayType")
    @NotNull
    private final DisplayType displayType;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("message")
    @NotNull
    private final String message;

    @SerializedName("primaryCta")
    @Nullable
    private final ContentCta primaryCta;

    @SerializedName("shouldShowNewBadge")
    private final boolean shouldShowNewBadge;

    @SerializedName("title")
    @Nullable
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lau/com/woolworths/foundation/rewards/banner/model/RewardsNotificationBannerApiData$DisplayType;", "", "", "iconDrawableResId", "Landroidx/compose/ui/graphics/Color;", "backgroundTintColor", "actionTextColor", "<init>", "(Ljava/lang/String;IIJJ)V", "INFO", "WARNING", "ERROR", "banner-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DisplayType {

        @SerializedName("ERROR")
        public static final DisplayType ERROR;

        @DefaultValue
        @SerializedName("INFO")
        public static final DisplayType INFO;

        @SerializedName("WARNING")
        public static final DisplayType WARNING;
        public static final /* synthetic */ DisplayType[] g;
        public static final /* synthetic */ EnumEntries h;
        public final int d;
        public final long e;
        public final long f;

        static {
            int i = TintColors.f;
            long j = TintColors.b;
            int i2 = AccentColors.f;
            DisplayType displayType = new DisplayType("INFO", 0, com.woolworths.R.drawable.ic_info_filled, j, AccentColors.b);
            INFO = displayType;
            long j2 = TintColors.d;
            int i3 = RewardsColors.d;
            DisplayType displayType2 = new DisplayType("WARNING", 1, com.woolworths.R.drawable.ic_warning, j2, RewardsColors.b);
            WARNING = displayType2;
            DisplayType displayType3 = new DisplayType("ERROR", 2, com.woolworths.R.drawable.ic_error_filled, TintColors.f5161a, AccentColors.f5153a);
            ERROR = displayType3;
            DisplayType[] displayTypeArr = {displayType, displayType2, displayType3};
            g = displayTypeArr;
            h = EnumEntriesKt.a(displayTypeArr);
        }

        private DisplayType(@DrawableRes String str, int i, int i2, long j, long j2) {
            this.d = i2;
            this.e = j;
            this.f = j2;
        }

        public static DisplayType valueOf(String str) {
            return (DisplayType) Enum.valueOf(DisplayType.class, str);
        }

        public static DisplayType[] values() {
            return (DisplayType[]) g.clone();
        }
    }

    public RewardsNotificationBannerApiData(@NotNull String id, @Nullable String str, @NotNull String message, @NotNull DisplayType displayType, @Nullable ContentCta contentCta, boolean z, boolean z2, @Nullable RewardsBannerAnalytics rewardsBannerAnalytics) {
        Intrinsics.h(id, "id");
        Intrinsics.h(message, "message");
        Intrinsics.h(displayType, "displayType");
        this.id = id;
        this.title = str;
        this.message = message;
        this.displayType = displayType;
        this.primaryCta = contentCta;
        this.canDismiss = z;
        this.shouldShowNewBadge = z2;
        this.analytics = rewardsBannerAnalytics;
    }

    /* renamed from: a, reason: from getter */
    public final RewardsBannerAnalytics getAnalytics() {
        return this.analytics;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getCanDismiss() {
        return this.canDismiss;
    }

    /* renamed from: c, reason: from getter */
    public final DisplayType getDisplayType() {
        return this.displayType;
    }

    /* renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: e, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsNotificationBannerApiData)) {
            return false;
        }
        RewardsNotificationBannerApiData rewardsNotificationBannerApiData = (RewardsNotificationBannerApiData) obj;
        return Intrinsics.c(this.id, rewardsNotificationBannerApiData.id) && Intrinsics.c(this.title, rewardsNotificationBannerApiData.title) && Intrinsics.c(this.message, rewardsNotificationBannerApiData.message) && this.displayType == rewardsNotificationBannerApiData.displayType && Intrinsics.c(this.primaryCta, rewardsNotificationBannerApiData.primaryCta) && this.canDismiss == rewardsNotificationBannerApiData.canDismiss && this.shouldShowNewBadge == rewardsNotificationBannerApiData.shouldShowNewBadge && Intrinsics.c(this.analytics, rewardsNotificationBannerApiData.analytics);
    }

    /* renamed from: f, reason: from getter */
    public final ContentCta getPrimaryCta() {
        return this.primaryCta;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getShouldShowNewBadge() {
        return this.shouldShowNewBadge;
    }

    /* renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (this.displayType.hashCode() + b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.message)) * 31;
        ContentCta contentCta = this.primaryCta;
        int iE = b.e(b.e((iHashCode2 + (contentCta == null ? 0 : contentCta.hashCode())) * 31, 31, this.canDismiss), 31, this.shouldShowNewBadge);
        RewardsBannerAnalytics rewardsBannerAnalytics = this.analytics;
        return iE + (rewardsBannerAnalytics != null ? rewardsBannerAnalytics.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.message;
        DisplayType displayType = this.displayType;
        ContentCta contentCta = this.primaryCta;
        boolean z = this.canDismiss;
        boolean z2 = this.shouldShowNewBadge;
        RewardsBannerAnalytics rewardsBannerAnalytics = this.analytics;
        StringBuilder sbV = a.v("RewardsNotificationBannerApiData(id=", str, ", title=", str2, ", message=");
        sbV.append(str3);
        sbV.append(", displayType=");
        sbV.append(displayType);
        sbV.append(", primaryCta=");
        sbV.append(contentCta);
        sbV.append(", canDismiss=");
        sbV.append(z);
        sbV.append(", shouldShowNewBadge=");
        sbV.append(z2);
        sbV.append(", analytics=");
        sbV.append(rewardsBannerAnalytics);
        sbV.append(")");
        return sbV.toString();
    }
}
