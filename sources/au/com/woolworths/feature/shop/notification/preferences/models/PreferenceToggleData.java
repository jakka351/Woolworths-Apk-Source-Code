package au.com.woolworths.feature.shop.notification.preferences.models;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/models/PreferenceToggleData;", "", "", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "footer", "", "value", "id", "altText", "Lau/com/woolworths/feature/shop/notification/preferences/models/PreferenceAnalyticsData;", "analytics", "iconUrl", "Lau/com/woolworths/feature/shop/notification/preferences/models/PreviewContentData;", "preview", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lau/com/woolworths/feature/shop/notification/preferences/models/PreferenceAnalyticsData;Ljava/lang/String;Lau/com/woolworths/feature/shop/notification/preferences/models/PreviewContentData;)V", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "f", "c", "Z", "h", "()Z", "d", "a", "Lau/com/woolworths/feature/shop/notification/preferences/models/PreferenceAnalyticsData;", "b", "()Lau/com/woolworths/feature/shop/notification/preferences/models/PreferenceAnalyticsData;", "getIconUrl", "Lau/com/woolworths/feature/shop/notification/preferences/models/PreviewContentData;", "e", "()Lau/com/woolworths/feature/shop/notification/preferences/models/PreviewContentData;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PreferenceToggleData {

    @SerializedName("altText")
    @Nullable
    private final String altText;

    @SerializedName("analytics")
    @NotNull
    private final PreferenceAnalyticsData analytics;

    @SerializedName("footer")
    @Nullable
    private final String footer;

    @SerializedName("iconUrl")
    @Nullable
    private final String iconUrl;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("preview")
    @Nullable
    private final PreviewContentData preview;

    @SerializedName(NotificationMessage.NOTIF_KEY_SUB_TITLE)
    @Nullable
    private final String subtitle;

    @SerializedName("title")
    @NotNull
    private final String title;

    @SerializedName("value")
    private final boolean value;

    public PreferenceToggleData(@NotNull String title, @Nullable String str, @Nullable String str2, boolean z, @NotNull String id, @Nullable String str3, @NotNull PreferenceAnalyticsData analytics, @Nullable String str4, @Nullable PreviewContentData previewContentData) {
        Intrinsics.h(title, "title");
        Intrinsics.h(id, "id");
        Intrinsics.h(analytics, "analytics");
        this.title = title;
        this.subtitle = str;
        this.footer = str2;
        this.value = z;
        this.id = id;
        this.altText = str3;
        this.analytics = analytics;
        this.iconUrl = str4;
        this.preview = previewContentData;
    }

    /* renamed from: a, reason: from getter */
    public final String getAltText() {
        return this.altText;
    }

    /* renamed from: b, reason: from getter */
    public final PreferenceAnalyticsData getAnalytics() {
        return this.analytics;
    }

    /* renamed from: c, reason: from getter */
    public final String getFooter() {
        return this.footer;
    }

    /* renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: e, reason: from getter */
    public final PreviewContentData getPreview() {
        return this.preview;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreferenceToggleData)) {
            return false;
        }
        PreferenceToggleData preferenceToggleData = (PreferenceToggleData) obj;
        return Intrinsics.c(this.title, preferenceToggleData.title) && Intrinsics.c(this.subtitle, preferenceToggleData.subtitle) && Intrinsics.c(this.footer, preferenceToggleData.footer) && this.value == preferenceToggleData.value && Intrinsics.c(this.id, preferenceToggleData.id) && Intrinsics.c(this.altText, preferenceToggleData.altText) && Intrinsics.c(this.analytics, preferenceToggleData.analytics) && Intrinsics.c(this.iconUrl, preferenceToggleData.iconUrl) && Intrinsics.c(this.preview, preferenceToggleData.preview);
    }

    /* renamed from: f, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getValue() {
        return this.value;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.footer;
        int iC = b.c(b.e((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.value), 31, this.id);
        String str3 = this.altText;
        int iHashCode3 = (this.analytics.hashCode() + ((iC + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.iconUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PreviewContentData previewContentData = this.preview;
        return iHashCode4 + (previewContentData != null ? previewContentData.hashCode() : 0);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.footer;
        boolean z = this.value;
        String str4 = this.id;
        String str5 = this.altText;
        PreferenceAnalyticsData preferenceAnalyticsData = this.analytics;
        String str6 = this.iconUrl;
        PreviewContentData previewContentData = this.preview;
        StringBuilder sbV = a.v("PreferenceToggleData(title=", str, ", subtitle=", str2, ", footer=");
        d.A(str3, ", value=", ", id=", sbV, z);
        androidx.constraintlayout.core.state.a.B(sbV, str4, ", altText=", str5, ", analytics=");
        sbV.append(preferenceAnalyticsData);
        sbV.append(", iconUrl=");
        sbV.append(str6);
        sbV.append(", preview=");
        sbV.append(previewContentData);
        sbV.append(")");
        return sbV.toString();
    }
}
