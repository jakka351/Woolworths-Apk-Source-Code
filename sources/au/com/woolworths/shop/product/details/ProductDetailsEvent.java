package au.com.woolworths.shop.product.details;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.product.details.data.ButtonData;
import au.com.woolworths.shop.product.details.data.ProductDetailsRowAccordion;
import au.com.woolworths.shop.product.details.data.ProductDetailsRowLink;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0016\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0082\u0001\u0016\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006.À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsEvent;", "", "OnBannerActionClick", "OnAlertActionClick", "OnProductRowActionClick", "OnWriteReviewClick", "OnReadReviewsClick", "OnSeeAllRatingsAndReviewsClicked", "OnShowAllReviewsClicked", "OnShareClick", "OnErrorTryAgain", "OnCartClick", "OnSwipeImageGallery", "OnCloseImageGallery", "OnOpenImageGallery", "OnLocationInfoClick", "OnAccordionClicked", "OnLinkRowClicked", "OnHealthierOptionCtaClicked", "OnEverydayMarketCouponCodeClicked", "OnEverydayMarketTermsAndConditionsClicked", "OnFooterButtonClick", "OnImageGalleryThumbnailClicked", "OnProductDetailsThumbnailClicked", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnAccordionClicked;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnAlertActionClick;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnBannerActionClick;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnCartClick;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnCloseImageGallery;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnErrorTryAgain;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnEverydayMarketCouponCodeClicked;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnEverydayMarketTermsAndConditionsClicked;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnFooterButtonClick;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnHealthierOptionCtaClicked;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnImageGalleryThumbnailClicked;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnLinkRowClicked;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnLocationInfoClick;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnOpenImageGallery;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnProductDetailsThumbnailClicked;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnProductRowActionClick;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnReadReviewsClick;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnSeeAllRatingsAndReviewsClicked;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnShareClick;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnShowAllReviewsClicked;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnSwipeImageGallery;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnWriteReviewClick;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ProductDetailsEvent {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnAccordionClicked;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAccordionClicked implements ProductDetailsEvent {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f12567a;
        public final ProductDetailsRowAccordion b;

        public OnAccordionClicked(boolean z, ProductDetailsRowAccordion productDetailsRowAccordion) {
            this.f12567a = z;
            this.b = productDetailsRowAccordion;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnAccordionClicked)) {
                return false;
            }
            OnAccordionClicked onAccordionClicked = (OnAccordionClicked) obj;
            return this.f12567a == onAccordionClicked.f12567a && Intrinsics.c(this.b, onAccordionClicked.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.f12567a) * 31);
        }

        public final String toString() {
            return "OnAccordionClicked(open=" + this.f12567a + ", accordionData=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnAlertActionClick;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAlertActionClick implements ProductDetailsEvent {

        /* renamed from: a, reason: collision with root package name */
        public final ActionData f12568a;

        public OnAlertActionClick(ActionData actionData) {
            this.f12568a = actionData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnAlertActionClick) && Intrinsics.c(this.f12568a, ((OnAlertActionClick) obj).f12568a);
        }

        public final int hashCode() {
            ActionData actionData = this.f12568a;
            if (actionData == null) {
                return 0;
            }
            return actionData.hashCode();
        }

        public final String toString() {
            return "OnAlertActionClick(actionData=" + this.f12568a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnBannerActionClick;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBannerActionClick implements ProductDetailsEvent {

        /* renamed from: a, reason: collision with root package name */
        public final ActionData f12569a;

        public OnBannerActionClick(ActionData actionData) {
            this.f12569a = actionData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnBannerActionClick) && Intrinsics.c(this.f12569a, ((OnBannerActionClick) obj).f12569a);
        }

        public final int hashCode() {
            ActionData actionData = this.f12569a;
            if (actionData == null) {
                return 0;
            }
            return actionData.hashCode();
        }

        public final String toString() {
            return "OnBannerActionClick(actionData=" + this.f12569a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnCartClick;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCartClick implements ProductDetailsEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final OnCartClick f12570a = new OnCartClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnCartClick);
        }

        public final int hashCode() {
            return 2072747660;
        }

        public final String toString() {
            return "OnCartClick";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnCloseImageGallery;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCloseImageGallery implements ProductDetailsEvent {

        /* renamed from: a, reason: collision with root package name */
        public final int f12571a;

        public OnCloseImageGallery(int i) {
            this.f12571a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCloseImageGallery) && this.f12571a == ((OnCloseImageGallery) obj).f12571a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f12571a);
        }

        public final String toString() {
            return YU.a.e(this.f12571a, "OnCloseImageGallery(currentIndex=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnErrorTryAgain;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnErrorTryAgain implements ProductDetailsEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final OnErrorTryAgain f12572a = new OnErrorTryAgain();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnErrorTryAgain);
        }

        public final int hashCode() {
            return -1919182127;
        }

        public final String toString() {
            return "OnErrorTryAgain";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnEverydayMarketCouponCodeClicked;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnEverydayMarketCouponCodeClicked implements ProductDetailsEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f12573a;

        public OnEverydayMarketCouponCodeClicked(String couponCode) {
            Intrinsics.h(couponCode, "couponCode");
            this.f12573a = couponCode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnEverydayMarketCouponCodeClicked) && Intrinsics.c(this.f12573a, ((OnEverydayMarketCouponCodeClicked) obj).f12573a);
        }

        public final int hashCode() {
            return this.f12573a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnEverydayMarketCouponCodeClicked(couponCode=", this.f12573a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnEverydayMarketTermsAndConditionsClicked;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnEverydayMarketTermsAndConditionsClicked implements ProductDetailsEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f12574a;

        public OnEverydayMarketTermsAndConditionsClicked(String url) {
            Intrinsics.h(url, "url");
            this.f12574a = url;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnEverydayMarketTermsAndConditionsClicked) && Intrinsics.c(this.f12574a, ((OnEverydayMarketTermsAndConditionsClicked) obj).f12574a);
        }

        public final int hashCode() {
            return this.f12574a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnEverydayMarketTermsAndConditionsClicked(url=", this.f12574a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnFooterButtonClick;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnFooterButtonClick implements ProductDetailsEvent {

        /* renamed from: a, reason: collision with root package name */
        public final ButtonData f12575a;

        public OnFooterButtonClick(ButtonData buttonData) {
            Intrinsics.h(buttonData, "buttonData");
            this.f12575a = buttonData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnFooterButtonClick) && Intrinsics.c(this.f12575a, ((OnFooterButtonClick) obj).f12575a);
        }

        public final int hashCode() {
            return this.f12575a.hashCode();
        }

        public final String toString() {
            return "OnFooterButtonClick(buttonData=" + this.f12575a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnHealthierOptionCtaClicked;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHealthierOptionCtaClicked implements ProductDetailsEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f12576a;
        public final AnalyticsData b;

        public OnHealthierOptionCtaClicked(String str, AnalyticsData analyticsData) {
            this.f12576a = str;
            this.b = analyticsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnHealthierOptionCtaClicked)) {
                return false;
            }
            OnHealthierOptionCtaClicked onHealthierOptionCtaClicked = (OnHealthierOptionCtaClicked) obj;
            return Intrinsics.c(this.f12576a, onHealthierOptionCtaClicked.f12576a) && Intrinsics.c(this.b, onHealthierOptionCtaClicked.b);
        }

        public final int hashCode() {
            String str = this.f12576a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AnalyticsData analyticsData = this.b;
            return iHashCode + (analyticsData != null ? analyticsData.hashCode() : 0);
        }

        public final String toString() {
            return "OnHealthierOptionCtaClicked(url=" + this.f12576a + ", onCtaClickAnalytics=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnImageGalleryThumbnailClicked;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnImageGalleryThumbnailClicked implements ProductDetailsEvent {

        /* renamed from: a, reason: collision with root package name */
        public final int f12577a;

        public OnImageGalleryThumbnailClicked(int i) {
            this.f12577a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnImageGalleryThumbnailClicked) && this.f12577a == ((OnImageGalleryThumbnailClicked) obj).f12577a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f12577a);
        }

        public final String toString() {
            return YU.a.e(this.f12577a, "OnImageGalleryThumbnailClicked(index=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnLinkRowClicked;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnLinkRowClicked implements ProductDetailsEvent {

        /* renamed from: a, reason: collision with root package name */
        public final ProductDetailsRowLink f12578a;

        public OnLinkRowClicked(ProductDetailsRowLink linkRowData) {
            Intrinsics.h(linkRowData, "linkRowData");
            this.f12578a = linkRowData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnLinkRowClicked) && Intrinsics.c(this.f12578a, ((OnLinkRowClicked) obj).f12578a);
        }

        public final int hashCode() {
            return this.f12578a.hashCode();
        }

        public final String toString() {
            return "OnLinkRowClicked(linkRowData=" + this.f12578a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnLocationInfoClick;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnLocationInfoClick implements ProductDetailsEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final OnLocationInfoClick f12579a = new OnLocationInfoClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnLocationInfoClick);
        }

        public final int hashCode() {
            return -1974315639;
        }

        public final String toString() {
            return "OnLocationInfoClick";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnOpenImageGallery;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOpenImageGallery implements ProductDetailsEvent {

        /* renamed from: a, reason: collision with root package name */
        public final int f12580a;

        public OnOpenImageGallery(int i) {
            this.f12580a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnOpenImageGallery) && this.f12580a == ((OnOpenImageGallery) obj).f12580a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f12580a);
        }

        public final String toString() {
            return YU.a.e(this.f12580a, "OnOpenImageGallery(currentIndex=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnProductDetailsThumbnailClicked;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductDetailsThumbnailClicked implements ProductDetailsEvent {

        /* renamed from: a, reason: collision with root package name */
        public final int f12581a;

        public OnProductDetailsThumbnailClicked(int i) {
            this.f12581a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnProductDetailsThumbnailClicked) && this.f12581a == ((OnProductDetailsThumbnailClicked) obj).f12581a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f12581a);
        }

        public final String toString() {
            return YU.a.e(this.f12581a, "OnProductDetailsThumbnailClicked(index=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnProductRowActionClick;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductRowActionClick implements ProductDetailsEvent {

        /* renamed from: a, reason: collision with root package name */
        public final ActionData f12582a;

        public OnProductRowActionClick(ActionData actionData) {
            this.f12582a = actionData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnProductRowActionClick) && Intrinsics.c(this.f12582a, ((OnProductRowActionClick) obj).f12582a);
        }

        public final int hashCode() {
            ActionData actionData = this.f12582a;
            if (actionData == null) {
                return 0;
            }
            return actionData.hashCode();
        }

        public final String toString() {
            return "OnProductRowActionClick(actionData=" + this.f12582a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnReadReviewsClick;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnReadReviewsClick implements ProductDetailsEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f12583a;

        public OnReadReviewsClick(String str) {
            this.f12583a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnReadReviewsClick) && Intrinsics.c(this.f12583a, ((OnReadReviewsClick) obj).f12583a);
        }

        public final int hashCode() {
            return this.f12583a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnReadReviewsClick(link=", this.f12583a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnSeeAllRatingsAndReviewsClicked;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnSeeAllRatingsAndReviewsClicked implements ProductDetailsEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f12584a;
        public final String b;

        public OnSeeAllRatingsAndReviewsClicked(String link, String linkLabel) {
            Intrinsics.h(link, "link");
            Intrinsics.h(linkLabel, "linkLabel");
            this.f12584a = link;
            this.b = linkLabel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnSeeAllRatingsAndReviewsClicked)) {
                return false;
            }
            OnSeeAllRatingsAndReviewsClicked onSeeAllRatingsAndReviewsClicked = (OnSeeAllRatingsAndReviewsClicked) obj;
            return Intrinsics.c(this.f12584a, onSeeAllRatingsAndReviewsClicked.f12584a) && Intrinsics.c(this.b, onSeeAllRatingsAndReviewsClicked.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f12584a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("OnSeeAllRatingsAndReviewsClicked(link=", this.f12584a, ", linkLabel=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnShareClick;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnShareClick implements ProductDetailsEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final OnShareClick f12585a = new OnShareClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnShareClick);
        }

        public final int hashCode() {
            return 811749669;
        }

        public final String toString() {
            return "OnShareClick";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnShowAllReviewsClicked;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnShowAllReviewsClicked implements ProductDetailsEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f12586a;
        public final String b;

        public OnShowAllReviewsClicked(String link, String linkLabel) {
            Intrinsics.h(link, "link");
            Intrinsics.h(linkLabel, "linkLabel");
            this.f12586a = link;
            this.b = linkLabel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnShowAllReviewsClicked)) {
                return false;
            }
            OnShowAllReviewsClicked onShowAllReviewsClicked = (OnShowAllReviewsClicked) obj;
            return Intrinsics.c(this.f12586a, onShowAllReviewsClicked.f12586a) && Intrinsics.c(this.b, onShowAllReviewsClicked.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f12586a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("OnShowAllReviewsClicked(link=", this.f12586a, ", linkLabel=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnSwipeImageGallery;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnSwipeImageGallery implements ProductDetailsEvent {

        /* renamed from: a, reason: collision with root package name */
        public final int f12587a;
        public final int b;

        public OnSwipeImageGallery(int i, int i2) {
            this.f12587a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnSwipeImageGallery)) {
                return false;
            }
            OnSwipeImageGallery onSwipeImageGallery = (OnSwipeImageGallery) obj;
            return this.f12587a == onSwipeImageGallery.f12587a && this.b == onSwipeImageGallery.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.f12587a) * 31);
        }

        public final String toString() {
            return androidx.camera.core.impl.b.j(this.f12587a, this.b, "OnSwipeImageGallery(previousPage=", ", nextPage=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsEvent$OnWriteReviewClick;", "Lau/com/woolworths/shop/product/details/ProductDetailsEvent;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnWriteReviewClick implements ProductDetailsEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f12588a;
        public final String b;

        public OnWriteReviewClick(String link, String linkLabel) {
            Intrinsics.h(link, "link");
            Intrinsics.h(linkLabel, "linkLabel");
            this.f12588a = link;
            this.b = linkLabel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnWriteReviewClick)) {
                return false;
            }
            OnWriteReviewClick onWriteReviewClick = (OnWriteReviewClick) obj;
            return Intrinsics.c(this.f12588a, onWriteReviewClick.f12588a) && Intrinsics.c(this.b, onWriteReviewClick.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f12588a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("OnWriteReviewClick(link=", this.f12588a, ", linkLabel=", this.b, ")");
        }
    }
}
