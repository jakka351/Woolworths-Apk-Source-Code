package au.com.woolworths.foundation.shop.banners.broadcastbanner.data;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.foundation.shop.banners.BannerDeeplinkModel;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012¨\u0006\u001f"}, d2 = {"Lau/com/woolworths/foundation/shop/banners/broadcastbanner/data/BroadcastBannerData;", "Lau/com/woolworths/foundation/shop/banners/BannerDeeplinkModel;", "", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "deeplink", "actionLabel", "analyticsLabel", "Lau/com/woolworths/foundation/shop/banners/broadcastbanner/data/BroadcastBannerType;", "type", "imageUrl", "", "dismissible", "bannerId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/foundation/shop/banners/broadcastbanner/data/BroadcastBannerType;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "g", "d", "a", "b", "Lau/com/woolworths/foundation/shop/banners/broadcastbanner/data/BroadcastBannerType;", "i", "()Lau/com/woolworths/foundation/shop/banners/broadcastbanner/data/BroadcastBannerType;", "f", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "c", "banners-data"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BroadcastBannerData implements BannerDeeplinkModel {

    @SerializedName("actionLabel")
    @Nullable
    private final String actionLabel;

    @SerializedName("analyticsLabel")
    @Nullable
    private final String analyticsLabel;

    @SerializedName("bannerId")
    @Nullable
    private final String bannerId;

    @SerializedName("deeplink")
    @Nullable
    private final String deeplink;

    @SerializedName("dismissible")
    @Nullable
    private final Boolean dismissible;

    @SerializedName("imageUrl")
    @NotNull
    private final String imageUrl;

    @SerializedName(NotificationMessage.NOTIF_KEY_SUB_TITLE)
    @Nullable
    private final String subtitle;

    @SerializedName("title")
    @NotNull
    private final String title;

    @SerializedName("type")
    @NotNull
    private final BroadcastBannerType type;

    public BroadcastBannerData(@NotNull String title, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull BroadcastBannerType type, @NotNull String imageUrl, @Nullable Boolean bool, @Nullable String str5) {
        Intrinsics.h(title, "title");
        Intrinsics.h(type, "type");
        Intrinsics.h(imageUrl, "imageUrl");
        this.title = title;
        this.subtitle = str;
        this.deeplink = str2;
        this.actionLabel = str3;
        this.analyticsLabel = str4;
        this.type = type;
        this.imageUrl = imageUrl;
        this.dismissible = bool;
        this.bannerId = str5;
    }

    /* renamed from: a, reason: from getter */
    public final String getActionLabel() {
        return this.actionLabel;
    }

    /* renamed from: b, reason: from getter */
    public final String getAnalyticsLabel() {
        return this.analyticsLabel;
    }

    /* renamed from: c, reason: from getter */
    public final String getBannerId() {
        return this.bannerId;
    }

    /* renamed from: d, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: e, reason: from getter */
    public final Boolean getDismissible() {
        return this.dismissible;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BroadcastBannerData)) {
            return false;
        }
        BroadcastBannerData broadcastBannerData = (BroadcastBannerData) obj;
        return Intrinsics.c(this.title, broadcastBannerData.title) && Intrinsics.c(this.subtitle, broadcastBannerData.subtitle) && Intrinsics.c(this.deeplink, broadcastBannerData.deeplink) && Intrinsics.c(this.actionLabel, broadcastBannerData.actionLabel) && Intrinsics.c(this.analyticsLabel, broadcastBannerData.analyticsLabel) && this.type == broadcastBannerData.type && Intrinsics.c(this.imageUrl, broadcastBannerData.imageUrl) && Intrinsics.c(this.dismissible, broadcastBannerData.dismissible) && Intrinsics.c(this.bannerId, broadcastBannerData.bannerId);
    }

    /* renamed from: f, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: g, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deeplink;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.actionLabel;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.analyticsLabel;
        int iC = b.c((this.type.hashCode() + ((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31, 31, this.imageUrl);
        Boolean bool = this.dismissible;
        int iHashCode5 = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.bannerId;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final BroadcastBannerType getType() {
        return this.type;
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.deeplink;
        String str4 = this.actionLabel;
        String str5 = this.analyticsLabel;
        BroadcastBannerType broadcastBannerType = this.type;
        String str6 = this.imageUrl;
        Boolean bool = this.dismissible;
        String str7 = this.bannerId;
        StringBuilder sbV = a.v("BroadcastBannerData(title=", str, ", subtitle=", str2, ", deeplink=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", actionLabel=", str4, ", analyticsLabel=");
        sbV.append(str5);
        sbV.append(", type=");
        sbV.append(broadcastBannerType);
        sbV.append(", imageUrl=");
        au.com.woolworths.android.onesite.a.A(sbV, str6, ", dismissible=", bool, ", bannerId=");
        return a.o(sbV, str7, ")");
    }
}
