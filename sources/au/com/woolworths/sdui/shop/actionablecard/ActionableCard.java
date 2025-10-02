package au.com.woolworths.sdui.shop.actionablecard;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.graphql.TealiumAnalytics;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.graphql.MappedName;
import au.com.woolworths.sdui.shop.dynamicsizecard.DefaultCardHeight;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardHeight;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Lau/com/woolworths/sdui/shop/actionablecard/ActionableCard;", "Lau/com/woolworths/sdui/shop/dynamicsizecard/DynamicSizeCardData;", "Landroid/os/Parcelable;", "", "imageUrl", "altText", "Lau/com/woolworths/sdui/shop/dynamicsizecard/DefaultCardHeight;", "height", "link", "Lau/com/woolworths/analytics/graphql/TealiumAnalytics;", "analytics", "Lau/com/woolworths/analytics/model/AnalyticsData;", "impressionAnalytics", "clickAnalytics", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/sdui/shop/dynamicsizecard/DefaultCardHeight;Ljava/lang/String;Lau/com/woolworths/analytics/graphql/TealiumAnalytics;Lau/com/woolworths/analytics/model/AnalyticsData;Lau/com/woolworths/analytics/model/AnalyticsData;)V", "Ljava/lang/String;", "getImageUrl", "()Ljava/lang/String;", "a", "Lau/com/woolworths/sdui/shop/dynamicsizecard/DefaultCardHeight;", "f", "()Lau/com/woolworths/sdui/shop/dynamicsizecard/DefaultCardHeight;", "h", "Lau/com/woolworths/analytics/graphql/TealiumAnalytics;", "d", "()Lau/com/woolworths/analytics/graphql/TealiumAnalytics;", "Lau/com/woolworths/analytics/model/AnalyticsData;", "g", "()Lau/com/woolworths/analytics/model/AnalyticsData;", "e", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ActionableCard implements DynamicSizeCardData, Parcelable {

    @NotNull
    public static final Parcelable.Creator<ActionableCard> CREATOR = new Creator();

    @SerializedName("altText")
    @NotNull
    private final String altText;

    @SerializedName("analytics")
    @Nullable
    private final TealiumAnalytics analytics;

    @SerializedName("actionableCardClickAnalytics")
    @MappedName
    @Nullable
    private final AnalyticsData clickAnalytics;

    @SerializedName("cardHeight")
    @MappedName
    @NotNull
    private final DefaultCardHeight height;

    @SerializedName("image")
    @MappedName
    @NotNull
    private final String imageUrl;

    @SerializedName("actionableCardImpressionAnalytics")
    @MappedName
    @Nullable
    private final AnalyticsData impressionAnalytics;

    @SerializedName("link")
    @NotNull
    private final String link;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ActionableCard> {
        @Override // android.os.Parcelable.Creator
        public final ActionableCard createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ActionableCard(parcel.readString(), parcel.readString(), DefaultCardHeight.valueOf(parcel.readString()), parcel.readString(), (TealiumAnalytics) parcel.readSerializable(), (AnalyticsData) parcel.readParcelable(ActionableCard.class.getClassLoader()), (AnalyticsData) parcel.readParcelable(ActionableCard.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ActionableCard[] newArray(int i) {
            return new ActionableCard[i];
        }
    }

    public ActionableCard(@NotNull String imageUrl, @NotNull String altText, @NotNull DefaultCardHeight height, @NotNull String link, @Nullable TealiumAnalytics tealiumAnalytics, @Nullable AnalyticsData analyticsData, @Nullable AnalyticsData analyticsData2) {
        Intrinsics.h(imageUrl, "imageUrl");
        Intrinsics.h(altText, "altText");
        Intrinsics.h(height, "height");
        Intrinsics.h(link, "link");
        this.imageUrl = imageUrl;
        this.altText = altText;
        this.height = height;
        this.link = link;
        this.analytics = tealiumAnalytics;
        this.impressionAnalytics = analyticsData;
        this.clickAnalytics = analyticsData2;
    }

    @Override // au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData
    /* renamed from: a, reason: from getter */
    public final String getAltText() {
        return this.altText;
    }

    /* renamed from: d, reason: from getter */
    public final TealiumAnalytics getAnalytics() {
        return this.analytics;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final AnalyticsData getClickAnalytics() {
        return this.clickAnalytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionableCard)) {
            return false;
        }
        ActionableCard actionableCard = (ActionableCard) obj;
        return Intrinsics.c(this.imageUrl, actionableCard.imageUrl) && Intrinsics.c(this.altText, actionableCard.altText) && this.height == actionableCard.height && Intrinsics.c(this.link, actionableCard.link) && Intrinsics.c(this.analytics, actionableCard.analytics) && Intrinsics.c(this.impressionAnalytics, actionableCard.impressionAnalytics) && Intrinsics.c(this.clickAnalytics, actionableCard.clickAnalytics);
    }

    /* renamed from: f, reason: from getter */
    public final DefaultCardHeight getHeight() {
        return this.height;
    }

    /* renamed from: g, reason: from getter */
    public final AnalyticsData getImpressionAnalytics() {
        return this.impressionAnalytics;
    }

    @Override // au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData
    public final DynamicSizeCardHeight getHeight() {
        return this.height;
    }

    @Override // au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: h, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @Override // au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData
    public final int hashCode() {
        int iC = b.c((this.height.hashCode() + b.c(this.imageUrl.hashCode() * 31, 31, this.altText)) * 31, 31, this.link);
        TealiumAnalytics tealiumAnalytics = this.analytics;
        int iHashCode = (iC + (tealiumAnalytics == null ? 0 : tealiumAnalytics.hashCode())) * 31;
        AnalyticsData analyticsData = this.impressionAnalytics;
        int iHashCode2 = (iHashCode + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
        AnalyticsData analyticsData2 = this.clickAnalytics;
        return iHashCode2 + (analyticsData2 != null ? analyticsData2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.imageUrl;
        String str2 = this.altText;
        DefaultCardHeight defaultCardHeight = this.height;
        String str3 = this.link;
        TealiumAnalytics tealiumAnalytics = this.analytics;
        AnalyticsData analyticsData = this.impressionAnalytics;
        AnalyticsData analyticsData2 = this.clickAnalytics;
        StringBuilder sbV = a.v("ActionableCard(imageUrl=", str, ", altText=", str2, ", height=");
        sbV.append(defaultCardHeight);
        sbV.append(", link=");
        sbV.append(str3);
        sbV.append(", analytics=");
        sbV.append(tealiumAnalytics);
        sbV.append(", impressionAnalytics=");
        sbV.append(analyticsData);
        sbV.append(", clickAnalytics=");
        return au.com.woolworths.android.onesite.a.n(sbV, analyticsData2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.imageUrl);
        dest.writeString(this.altText);
        dest.writeString(this.height.name());
        dest.writeString(this.link);
        dest.writeSerializable(this.analytics);
        dest.writeParcelable(this.impressionAnalytics, i);
        dest.writeParcelable(this.clickAnalytics, i);
    }
}
