package au.com.woolworths.base.rewards.account.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003JU\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006%"}, d2 = {"Lau/com/woolworths/base/rewards/account/data/PreferenceToggleData;", "", "title", "", NotificationMessage.NOTIF_KEY_SUB_TITLE, "value", "", "id", "altText", "analytics", "Lau/com/woolworths/base/rewards/account/data/PreferenceDetailsAnalyticsData;", "iconUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lau/com/woolworths/base/rewards/account/data/PreferenceDetailsAnalyticsData;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getValue", "()Z", "getId", "getAltText", "getAnalytics", "()Lau/com/woolworths/base/rewards/account/data/PreferenceDetailsAnalyticsData;", "getIconUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PreferenceToggleData {
    public static final int $stable = 0;

    @SerializedName("altText")
    @Nullable
    private final String altText;

    @SerializedName("analytics")
    @NotNull
    private final PreferenceDetailsAnalyticsData analytics;

    @SerializedName("iconUrl")
    @Nullable
    private final String iconUrl;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName(NotificationMessage.NOTIF_KEY_SUB_TITLE)
    @Nullable
    private final String subtitle;

    @SerializedName("title")
    @NotNull
    private final String title;

    @SerializedName("value")
    private final boolean value;

    public PreferenceToggleData(@NotNull String title, @Nullable String str, boolean z, @NotNull String id, @Nullable String str2, @NotNull PreferenceDetailsAnalyticsData analytics, @Nullable String str3) {
        Intrinsics.h(title, "title");
        Intrinsics.h(id, "id");
        Intrinsics.h(analytics, "analytics");
        this.title = title;
        this.subtitle = str;
        this.value = z;
        this.id = id;
        this.altText = str2;
        this.analytics = analytics;
        this.iconUrl = str3;
    }

    public static /* synthetic */ PreferenceToggleData copy$default(PreferenceToggleData preferenceToggleData, String str, String str2, boolean z, String str3, String str4, PreferenceDetailsAnalyticsData preferenceDetailsAnalyticsData, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = preferenceToggleData.title;
        }
        if ((i & 2) != 0) {
            str2 = preferenceToggleData.subtitle;
        }
        if ((i & 4) != 0) {
            z = preferenceToggleData.value;
        }
        if ((i & 8) != 0) {
            str3 = preferenceToggleData.id;
        }
        if ((i & 16) != 0) {
            str4 = preferenceToggleData.altText;
        }
        if ((i & 32) != 0) {
            preferenceDetailsAnalyticsData = preferenceToggleData.analytics;
        }
        if ((i & 64) != 0) {
            str5 = preferenceToggleData.iconUrl;
        }
        PreferenceDetailsAnalyticsData preferenceDetailsAnalyticsData2 = preferenceDetailsAnalyticsData;
        String str6 = str5;
        String str7 = str4;
        boolean z2 = z;
        return preferenceToggleData.copy(str, str2, z2, str3, str7, preferenceDetailsAnalyticsData2, str6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getValue() {
        return this.value;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getAltText() {
        return this.altText;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final PreferenceDetailsAnalyticsData getAnalytics() {
        return this.analytics;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final PreferenceToggleData copy(@NotNull String title, @Nullable String subtitle, boolean value, @NotNull String id, @Nullable String altText, @NotNull PreferenceDetailsAnalyticsData analytics, @Nullable String iconUrl) {
        Intrinsics.h(title, "title");
        Intrinsics.h(id, "id");
        Intrinsics.h(analytics, "analytics");
        return new PreferenceToggleData(title, subtitle, value, id, altText, analytics, iconUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreferenceToggleData)) {
            return false;
        }
        PreferenceToggleData preferenceToggleData = (PreferenceToggleData) other;
        return Intrinsics.c(this.title, preferenceToggleData.title) && Intrinsics.c(this.subtitle, preferenceToggleData.subtitle) && this.value == preferenceToggleData.value && Intrinsics.c(this.id, preferenceToggleData.id) && Intrinsics.c(this.altText, preferenceToggleData.altText) && Intrinsics.c(this.analytics, preferenceToggleData.analytics) && Intrinsics.c(this.iconUrl, preferenceToggleData.iconUrl);
    }

    @Nullable
    public final String getAltText() {
        return this.altText;
    }

    @NotNull
    public final PreferenceDetailsAnalyticsData getAnalytics() {
        return this.analytics;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final boolean getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iC = b.c(b.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.value), 31, this.id);
        String str2 = this.altText;
        int iHashCode2 = (this.analytics.hashCode() + ((iC + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.iconUrl;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        boolean z = this.value;
        String str3 = this.id;
        String str4 = this.altText;
        PreferenceDetailsAnalyticsData preferenceDetailsAnalyticsData = this.analytics;
        String str5 = this.iconUrl;
        StringBuilder sbV = a.v("PreferenceToggleData(title=", str, ", subtitle=", str2, ", value=");
        au.com.woolworths.android.onesite.a.y(", id=", str3, ", altText=", sbV, z);
        sbV.append(str4);
        sbV.append(", analytics=");
        sbV.append(preferenceDetailsAnalyticsData);
        sbV.append(", iconUrl=");
        return a.o(sbV, str5, ")");
    }
}
