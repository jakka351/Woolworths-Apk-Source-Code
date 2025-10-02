package au.com.woolworths.shop.aem.components.offercard.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.OfferCardTextColor;
import au.com.woolworths.shop.graphql.type.OfferCardVariant;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/shop/aem/components/offercard/fragment/OfferCard;", "Lcom/apollographql/apollo/api/Fragment$Data;", "OfferCardBadgeImage", "OfferCardPriceInfo", "OfferCardAnalytics", "OfferCardAction", "Analytics", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OfferCard implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f10187a;
    public final String b;
    public final String c;
    public final OfferCardBadgeImage d;
    public final OfferCardTextColor e;
    public final String f;
    public final OfferCardPriceInfo g;
    public final OfferCardAnalytics h;
    public final OfferCardAction i;
    public final OfferCardVariant j;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/offercard/fragment/OfferCard$Analytics;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f10188a;
        public final AnalyticsFields b;

        public Analytics(String str, AnalyticsFields analyticsFields) {
            this.f10188a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics)) {
                return false;
            }
            Analytics analytics = (Analytics) obj;
            return Intrinsics.c(this.f10188a, analytics.f10188a) && Intrinsics.c(this.b, analytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10188a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics(__typename=", this.f10188a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/offercard/fragment/OfferCard$OfferCardAction;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferCardAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f10189a;
        public final Analytics b;
        public final ActionType c;

        public OfferCardAction(String str, Analytics analytics, ActionType actionType) {
            this.f10189a = str;
            this.b = analytics;
            this.c = actionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferCardAction)) {
                return false;
            }
            OfferCardAction offerCardAction = (OfferCardAction) obj;
            return Intrinsics.c(this.f10189a, offerCardAction.f10189a) && Intrinsics.c(this.b, offerCardAction.b) && this.c == offerCardAction.c;
        }

        public final int hashCode() {
            int iHashCode = this.f10189a.hashCode() * 31;
            Analytics analytics = this.b;
            return this.c.hashCode() + ((iHashCode + (analytics == null ? 0 : analytics.hashCode())) * 31);
        }

        public final String toString() {
            return "OfferCardAction(action=" + this.f10189a + ", analytics=" + this.b + ", type=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/offercard/fragment/OfferCard$OfferCardAnalytics;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferCardAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f10190a;
        public final AnalyticsFields b;

        public OfferCardAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f10190a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferCardAnalytics)) {
                return false;
            }
            OfferCardAnalytics offerCardAnalytics = (OfferCardAnalytics) obj;
            return Intrinsics.c(this.f10190a, offerCardAnalytics.f10190a) && Intrinsics.c(this.b, offerCardAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10190a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("OfferCardAnalytics(__typename=", this.f10190a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/offercard/fragment/OfferCard$OfferCardBadgeImage;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferCardBadgeImage {

        /* renamed from: a, reason: collision with root package name */
        public final String f10191a;
        public final String b;

        public OfferCardBadgeImage(String str, String str2) {
            this.f10191a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferCardBadgeImage)) {
                return false;
            }
            OfferCardBadgeImage offerCardBadgeImage = (OfferCardBadgeImage) obj;
            return Intrinsics.c(this.f10191a, offerCardBadgeImage.f10191a) && Intrinsics.c(this.b, offerCardBadgeImage.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10191a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("OfferCardBadgeImage(imageUrl=", this.f10191a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/offercard/fragment/OfferCard$OfferCardPriceInfo;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferCardPriceInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f10192a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public OfferCardPriceInfo(String str, String str2, String str3, String str4, String str5) {
            this.f10192a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferCardPriceInfo)) {
                return false;
            }
            OfferCardPriceInfo offerCardPriceInfo = (OfferCardPriceInfo) obj;
            return Intrinsics.c(this.f10192a, offerCardPriceInfo.f10192a) && Intrinsics.c(this.b, offerCardPriceInfo.b) && Intrinsics.c(this.c, offerCardPriceInfo.c) && Intrinsics.c(this.d, offerCardPriceInfo.d) && Intrinsics.c(this.e, offerCardPriceInfo.e);
        }

        public final int hashCode() {
            String str = this.f10192a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OfferCardPriceInfo(offerCardPriceInfoPriceDollars=", this.f10192a, ", offerCardPriceInfoPriceCents=", this.b, ", offerCardPriceInfoPrefix1=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", offerCardPriceInfoPrefix2=", this.d, ", offerCardPriceInfoSuffix=");
            return a.o(sbV, this.e, ")");
        }
    }

    public OfferCard(String str, String str2, String str3, OfferCardBadgeImage offerCardBadgeImage, OfferCardTextColor offerCardTextColor, String str4, OfferCardPriceInfo offerCardPriceInfo, OfferCardAnalytics offerCardAnalytics, OfferCardAction offerCardAction, OfferCardVariant offerCardVariant) {
        this.f10187a = str;
        this.b = str2;
        this.c = str3;
        this.d = offerCardBadgeImage;
        this.e = offerCardTextColor;
        this.f = str4;
        this.g = offerCardPriceInfo;
        this.h = offerCardAnalytics;
        this.i = offerCardAction;
        this.j = offerCardVariant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferCard)) {
            return false;
        }
        OfferCard offerCard = (OfferCard) obj;
        return Intrinsics.c(this.f10187a, offerCard.f10187a) && Intrinsics.c(this.b, offerCard.b) && Intrinsics.c(this.c, offerCard.c) && Intrinsics.c(this.d, offerCard.d) && this.e == offerCard.e && Intrinsics.c(this.f, offerCard.f) && Intrinsics.c(this.g, offerCard.g) && Intrinsics.c(this.h, offerCard.h) && Intrinsics.c(this.i, offerCard.i) && this.j == offerCard.j;
    }

    public final int hashCode() {
        int iC = b.c(this.f10187a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        OfferCardBadgeImage offerCardBadgeImage = this.d;
        int iC2 = b.c((this.e.hashCode() + ((iHashCode + (offerCardBadgeImage == null ? 0 : offerCardBadgeImage.hashCode())) * 31)) * 31, 31, this.f);
        OfferCardPriceInfo offerCardPriceInfo = this.g;
        int iHashCode2 = (iC2 + (offerCardPriceInfo == null ? 0 : offerCardPriceInfo.hashCode())) * 31;
        OfferCardAnalytics offerCardAnalytics = this.h;
        int iHashCode3 = (iHashCode2 + (offerCardAnalytics == null ? 0 : offerCardAnalytics.hashCode())) * 31;
        OfferCardAction offerCardAction = this.i;
        int iHashCode4 = (iHashCode3 + (offerCardAction == null ? 0 : offerCardAction.hashCode())) * 31;
        OfferCardVariant offerCardVariant = this.j;
        return iHashCode4 + (offerCardVariant != null ? offerCardVariant.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("OfferCard(offerCardImageUrl=", this.f10187a, ", offerCardTitle=", this.b, ", offerCardDescription=");
        sbV.append(this.c);
        sbV.append(", offerCardBadgeImage=");
        sbV.append(this.d);
        sbV.append(", offerCardTextColor=");
        sbV.append(this.e);
        sbV.append(", offerCardTextBackgroundColor=");
        sbV.append(this.f);
        sbV.append(", offerCardPriceInfo=");
        sbV.append(this.g);
        sbV.append(", offerCardAnalytics=");
        sbV.append(this.h);
        sbV.append(", offerCardAction=");
        sbV.append(this.i);
        sbV.append(", offerCardVariant=");
        sbV.append(this.j);
        sbV.append(")");
        return sbV.toString();
    }
}
