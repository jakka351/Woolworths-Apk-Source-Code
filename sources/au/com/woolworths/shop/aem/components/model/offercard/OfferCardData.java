package au.com.woolworths.shop.aem.components.model.offercard;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem;
import com.google.gson.annotations.SerializedName;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/offercard/OfferCardData;", "Lau/com/woolworths/shop/aem/components/model/horizontalList/HorizontalListItem;", "", "imageUrl", "title", lqlqqlq.mmm006Dm006Dm, "deepLink", "Lau/com/woolworths/shop/aem/components/model/ImageWithAltText;", "badgeImage", "Lau/com/woolworths/shop/aem/components/model/offercard/OfferCardTextColor;", "textColor", "backgroundColor", "Lau/com/woolworths/shop/aem/components/model/offercard/OfferCardPriceInfo;", "priceInfo", "Lau/com/woolworths/sdui/model/action/ActionData;", "offerCardAction", "Lau/com/woolworths/analytics/model/AnalyticsData;", "offerCardAnalytics", "Lau/com/woolworths/shop/aem/components/model/offercard/OfferCardVariant;", "variant", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/shop/aem/components/model/ImageWithAltText;Lau/com/woolworths/shop/aem/components/model/offercard/OfferCardTextColor;Ljava/lang/String;Lau/com/woolworths/shop/aem/components/model/offercard/OfferCardPriceInfo;Lau/com/woolworths/sdui/model/action/ActionData;Lau/com/woolworths/analytics/model/AnalyticsData;Lau/com/woolworths/shop/aem/components/model/offercard/OfferCardVariant;)V", "Lau/com/woolworths/sdui/model/action/ActionData;", "a", "()Lau/com/woolworths/sdui/model/action/ActionData;", "Lau/com/woolworths/analytics/model/AnalyticsData;", "b", "()Lau/com/woolworths/analytics/model/AnalyticsData;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OfferCardData implements HorizontalListItem {
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final ImageWithAltText h;
    public final OfferCardTextColor i;
    public final String j;
    public final OfferCardPriceInfo k;
    public final OfferCardVariant l;
    public final AnalyticsData m;

    @SerializedName("offerCardAction")
    @Nullable
    private final ActionData offerCardAction;

    @SerializedName("offerCardAnalytics")
    @Nullable
    private final AnalyticsData offerCardAnalytics;

    public OfferCardData(@NotNull String imageUrl, @NotNull String title, @Nullable String str, @Nullable String str2, @Nullable ImageWithAltText imageWithAltText, @NotNull OfferCardTextColor textColor, @NotNull String backgroundColor, @Nullable OfferCardPriceInfo offerCardPriceInfo, @Nullable ActionData actionData, @Nullable AnalyticsData analyticsData, @Nullable OfferCardVariant offerCardVariant) {
        Intrinsics.h(imageUrl, "imageUrl");
        Intrinsics.h(title, "title");
        Intrinsics.h(textColor, "textColor");
        Intrinsics.h(backgroundColor, "backgroundColor");
        this.d = imageUrl;
        this.e = title;
        this.f = str;
        this.g = str2;
        this.h = imageWithAltText;
        this.i = textColor;
        this.j = backgroundColor;
        this.k = offerCardPriceInfo;
        this.offerCardAction = actionData;
        this.offerCardAnalytics = analyticsData;
        this.l = offerCardVariant;
        this.m = analyticsData;
    }

    /* renamed from: a, reason: from getter */
    public final ActionData getOfferCardAction() {
        return this.offerCardAction;
    }

    /* renamed from: b, reason: from getter */
    public final AnalyticsData getOfferCardAnalytics() {
        return this.offerCardAnalytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferCardData)) {
            return false;
        }
        OfferCardData offerCardData = (OfferCardData) obj;
        return Intrinsics.c(this.d, offerCardData.d) && Intrinsics.c(this.e, offerCardData.e) && Intrinsics.c(this.f, offerCardData.f) && Intrinsics.c(this.g, offerCardData.g) && Intrinsics.c(this.h, offerCardData.h) && this.i == offerCardData.i && Intrinsics.c(this.j, offerCardData.j) && Intrinsics.c(this.k, offerCardData.k) && Intrinsics.c(this.offerCardAction, offerCardData.offerCardAction) && Intrinsics.c(this.offerCardAnalytics, offerCardData.offerCardAnalytics) && this.l == offerCardData.l;
    }

    @Override // au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem
    /* renamed from: getImpressionAnalyticsData, reason: from getter */
    public final AnalyticsData getM() {
        return this.m;
    }

    public final int hashCode() {
        int iC = b.c(this.d.hashCode() * 31, 31, this.e);
        String str = this.f;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ImageWithAltText imageWithAltText = this.h;
        int iC2 = b.c((this.i.hashCode() + ((iHashCode2 + (imageWithAltText == null ? 0 : imageWithAltText.hashCode())) * 31)) * 31, 31, this.j);
        OfferCardPriceInfo offerCardPriceInfo = this.k;
        int iHashCode3 = (iC2 + (offerCardPriceInfo == null ? 0 : offerCardPriceInfo.hashCode())) * 31;
        ActionData actionData = this.offerCardAction;
        int iHashCode4 = (iHashCode3 + (actionData == null ? 0 : actionData.hashCode())) * 31;
        AnalyticsData analyticsData = this.offerCardAnalytics;
        int iHashCode5 = (iHashCode4 + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
        OfferCardVariant offerCardVariant = this.l;
        return iHashCode5 + (offerCardVariant != null ? offerCardVariant.hashCode() : 0);
    }

    public final String toString() {
        ActionData actionData = this.offerCardAction;
        AnalyticsData analyticsData = this.offerCardAnalytics;
        StringBuilder sbV = a.v("OfferCardData(imageUrl=", this.d, ", title=", this.e, ", description=");
        androidx.constraintlayout.core.state.a.B(sbV, this.f, ", deepLink=", this.g, ", badgeImage=");
        sbV.append(this.h);
        sbV.append(", textColor=");
        sbV.append(this.i);
        sbV.append(", backgroundColor=");
        sbV.append(this.j);
        sbV.append(", priceInfo=");
        sbV.append(this.k);
        sbV.append(", offerCardAction=");
        sbV.append(actionData);
        sbV.append(", offerCardAnalytics=");
        sbV.append(analyticsData);
        sbV.append(", variant=");
        sbV.append(this.l);
        sbV.append(")");
        return sbV.toString();
    }
}
