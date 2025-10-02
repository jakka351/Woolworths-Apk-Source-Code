package au.com.woolworths.feature.shop.bundles;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.feature.shop.bundles.data.Bundle;
import au.com.woolworths.feature.shop.bundles.data.BundleSortOption;
import au.com.woolworths.feature.shop.bundles.data.BundlesData;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.sdui.model.action.ActionData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0015\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0082\u0001\u0015\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006,À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent;", "", "AddBundleToCartClick", "ProductClick", "BundlesIncrementClick", "BundlesDecrementClick", "BundlesQuantityClick", "RefreshClick", "SortOptionClick", "NoBundlesCtaClick", "TrackBundleImpression", "TrackBundlesMaxQuantityReached", "TrackErrorScreenImpression", "TrackSnackbarImpression", "TrackBroadcastBannerDismissed", "BroadcastBannerActionClick", "OnAlertActionClick", "TrackAlertImpression", "UpdateCachedProducts", "CartIconClick", "OpenSortBottomSheetModal", "CloseSortBottomSheetModal", "RetryPaginationClick", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$AddBundleToCartClick;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$BroadcastBannerActionClick;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$BundlesDecrementClick;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$BundlesIncrementClick;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$BundlesQuantityClick;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$CartIconClick;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$CloseSortBottomSheetModal;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$NoBundlesCtaClick;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$OnAlertActionClick;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$OpenSortBottomSheetModal;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$ProductClick;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$RefreshClick;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$RetryPaginationClick;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$SortOptionClick;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$TrackAlertImpression;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$TrackBroadcastBannerDismissed;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$TrackBundleImpression;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$TrackBundlesMaxQuantityReached;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$TrackErrorScreenImpression;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$TrackSnackbarImpression;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$UpdateCachedProducts;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BundlesUiEvent {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$AddBundleToCartClick;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AddBundleToCartClick implements BundlesUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f6718a;

        public AddBundleToCartClick(Bundle bundle) {
            this.f6718a = bundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddBundleToCartClick) && Intrinsics.c(this.f6718a, ((AddBundleToCartClick) obj).f6718a);
        }

        public final int hashCode() {
            return this.f6718a.hashCode();
        }

        public final String toString() {
            return "AddBundleToCartClick(bundle=" + this.f6718a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$BroadcastBannerActionClick;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BroadcastBannerActionClick implements BundlesUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final ActionData f6719a;

        public BroadcastBannerActionClick(ActionData actionData) {
            Intrinsics.h(actionData, "actionData");
            this.f6719a = actionData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BroadcastBannerActionClick) && Intrinsics.c(this.f6719a, ((BroadcastBannerActionClick) obj).f6719a);
        }

        public final int hashCode() {
            return this.f6719a.hashCode();
        }

        public final String toString() {
            return "BroadcastBannerActionClick(actionData=" + this.f6719a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$BundlesDecrementClick;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BundlesDecrementClick implements BundlesUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f6720a;
        public final int b;

        public BundlesDecrementClick(Bundle bundle, int i) {
            this.f6720a = bundle;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BundlesDecrementClick)) {
                return false;
            }
            BundlesDecrementClick bundlesDecrementClick = (BundlesDecrementClick) obj;
            return Intrinsics.c(this.f6720a, bundlesDecrementClick.f6720a) && this.b == bundlesDecrementClick.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.f6720a.hashCode() * 31);
        }

        public final String toString() {
            return "BundlesDecrementClick(bundle=" + this.f6720a + ", bundleQuantity=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$BundlesIncrementClick;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BundlesIncrementClick implements BundlesUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f6721a;
        public final int b;

        public BundlesIncrementClick(Bundle bundle, int i) {
            this.f6721a = bundle;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BundlesIncrementClick)) {
                return false;
            }
            BundlesIncrementClick bundlesIncrementClick = (BundlesIncrementClick) obj;
            return Intrinsics.c(this.f6721a, bundlesIncrementClick.f6721a) && this.b == bundlesIncrementClick.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.f6721a.hashCode() * 31);
        }

        public final String toString() {
            return "BundlesIncrementClick(bundle=" + this.f6721a + ", bundleQuantity=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$BundlesQuantityClick;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BundlesQuantityClick implements BundlesUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f6722a;
        public final BundlesData.BundlesLandingPage b;

        public BundlesQuantityClick(Bundle bundle, BundlesData.BundlesLandingPage bundlesData) {
            Intrinsics.h(bundlesData, "bundlesData");
            this.f6722a = bundle;
            this.b = bundlesData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BundlesQuantityClick)) {
                return false;
            }
            BundlesQuantityClick bundlesQuantityClick = (BundlesQuantityClick) obj;
            return Intrinsics.c(this.f6722a, bundlesQuantityClick.f6722a) && Intrinsics.c(this.b, bundlesQuantityClick.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6722a.hashCode() * 31);
        }

        public final String toString() {
            return "BundlesQuantityClick(bundle=" + this.f6722a + ", bundlesData=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$CartIconClick;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CartIconClick implements BundlesUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final CartIconClick f6723a = new CartIconClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CartIconClick);
        }

        public final int hashCode() {
            return 1912878374;
        }

        public final String toString() {
            return "CartIconClick";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$CloseSortBottomSheetModal;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CloseSortBottomSheetModal implements BundlesUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final CloseSortBottomSheetModal f6724a = new CloseSortBottomSheetModal();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseSortBottomSheetModal);
        }

        public final int hashCode() {
            return 936203846;
        }

        public final String toString() {
            return "CloseSortBottomSheetModal";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$NoBundlesCtaClick;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NoBundlesCtaClick implements BundlesUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final BundlesData.BundlesLandingErrorPage f6725a;

        public NoBundlesCtaClick(BundlesData.BundlesLandingErrorPage errorPage) {
            Intrinsics.h(errorPage, "errorPage");
            this.f6725a = errorPage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoBundlesCtaClick) && Intrinsics.c(this.f6725a, ((NoBundlesCtaClick) obj).f6725a);
        }

        public final int hashCode() {
            return this.f6725a.hashCode();
        }

        public final String toString() {
            return "NoBundlesCtaClick(errorPage=" + this.f6725a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$OnAlertActionClick;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAlertActionClick implements BundlesUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final ActionData f6726a;

        public OnAlertActionClick(ActionData actionData) {
            Intrinsics.h(actionData, "actionData");
            this.f6726a = actionData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnAlertActionClick) && Intrinsics.c(this.f6726a, ((OnAlertActionClick) obj).f6726a);
        }

        public final int hashCode() {
            return this.f6726a.hashCode();
        }

        public final String toString() {
            return "OnAlertActionClick(actionData=" + this.f6726a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$OpenSortBottomSheetModal;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenSortBottomSheetModal implements BundlesUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final OpenSortBottomSheetModal f6727a = new OpenSortBottomSheetModal();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenSortBottomSheetModal);
        }

        public final int hashCode() {
            return 163557386;
        }

        public final String toString() {
            return "OpenSortBottomSheetModal";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$ProductClick;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductClick implements BundlesUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final ProductCard f6728a;
        public final Bundle b;

        public ProductClick(ProductCard productCard, Bundle bundle) {
            Intrinsics.h(productCard, "productCard");
            this.f6728a = productCard;
            this.b = bundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductClick)) {
                return false;
            }
            ProductClick productClick = (ProductClick) obj;
            return Intrinsics.c(this.f6728a, productClick.f6728a) && Intrinsics.c(this.b, productClick.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6728a.hashCode() * 31);
        }

        public final String toString() {
            return "ProductClick(productCard=" + this.f6728a + ", bundle=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$RefreshClick;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RefreshClick implements BundlesUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f6729a;
        public final String b;
        public final String c;

        public RefreshClick(String str, String str2, String str3) {
            this.f6729a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RefreshClick)) {
                return false;
            }
            RefreshClick refreshClick = (RefreshClick) obj;
            return Intrinsics.c(this.f6729a, refreshClick.f6729a) && Intrinsics.c(this.b, refreshClick.b) && Intrinsics.c(this.c, refreshClick.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + androidx.camera.core.impl.b.c(this.f6729a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("RefreshClick(headerText=", this.f6729a, ", bodyText=", this.b, ", buttonText="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$RetryPaginationClick;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RetryPaginationClick implements BundlesUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final RetryPaginationClick f6730a = new RetryPaginationClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryPaginationClick);
        }

        public final int hashCode() {
            return -527204721;
        }

        public final String toString() {
            return "RetryPaginationClick";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$SortOptionClick;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SortOptionClick implements BundlesUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final BundleSortOption f6731a;

        public SortOptionClick(BundleSortOption option) {
            Intrinsics.h(option, "option");
            this.f6731a = option;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SortOptionClick) && Intrinsics.c(this.f6731a, ((SortOptionClick) obj).f6731a);
        }

        public final int hashCode() {
            return this.f6731a.hashCode();
        }

        public final String toString() {
            return "SortOptionClick(option=" + this.f6731a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$TrackAlertImpression;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TrackAlertImpression implements BundlesUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final AnalyticsData f6732a;

        public TrackAlertImpression(AnalyticsData analyticsData) {
            this.f6732a = analyticsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TrackAlertImpression) && Intrinsics.c(this.f6732a, ((TrackAlertImpression) obj).f6732a);
        }

        public final int hashCode() {
            AnalyticsData analyticsData = this.f6732a;
            if (analyticsData == null) {
                return 0;
            }
            return analyticsData.hashCode();
        }

        public final String toString() {
            return "TrackAlertImpression(analytics=" + this.f6732a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$TrackBroadcastBannerDismissed;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TrackBroadcastBannerDismissed implements BundlesUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final AnalyticsData f6733a;

        public TrackBroadcastBannerDismissed(AnalyticsData analytics) {
            Intrinsics.h(analytics, "analytics");
            this.f6733a = analytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TrackBroadcastBannerDismissed) && Intrinsics.c(this.f6733a, ((TrackBroadcastBannerDismissed) obj).f6733a);
        }

        public final int hashCode() {
            return this.f6733a.hashCode();
        }

        public final String toString() {
            return "TrackBroadcastBannerDismissed(analytics=" + this.f6733a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$TrackBundleImpression;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TrackBundleImpression implements BundlesUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f6734a;
        public final BundlesData.BundlesLandingPage b;

        public TrackBundleImpression(Bundle data, BundlesData.BundlesLandingPage bundlesData) {
            Intrinsics.h(data, "data");
            Intrinsics.h(bundlesData, "bundlesData");
            this.f6734a = data;
            this.b = bundlesData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrackBundleImpression)) {
                return false;
            }
            TrackBundleImpression trackBundleImpression = (TrackBundleImpression) obj;
            return Intrinsics.c(this.f6734a, trackBundleImpression.f6734a) && Intrinsics.c(this.b, trackBundleImpression.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6734a.hashCode() * 31);
        }

        public final String toString() {
            return "TrackBundleImpression(data=" + this.f6734a + ", bundlesData=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$TrackBundlesMaxQuantityReached;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TrackBundlesMaxQuantityReached implements BundlesUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f6735a;
        public final BundlesData.BundlesLandingPage b;

        public TrackBundlesMaxQuantityReached(Bundle bundle, BundlesData.BundlesLandingPage page) {
            Intrinsics.h(page, "page");
            this.f6735a = bundle;
            this.b = page;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrackBundlesMaxQuantityReached)) {
                return false;
            }
            TrackBundlesMaxQuantityReached trackBundlesMaxQuantityReached = (TrackBundlesMaxQuantityReached) obj;
            return Intrinsics.c(this.f6735a, trackBundlesMaxQuantityReached.f6735a) && Intrinsics.c(this.b, trackBundlesMaxQuantityReached.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6735a.hashCode() * 31);
        }

        public final String toString() {
            return "TrackBundlesMaxQuantityReached(bundle=" + this.f6735a + ", page=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$TrackErrorScreenImpression;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TrackErrorScreenImpression implements BundlesUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f6736a;
        public final String b;

        public TrackErrorScreenImpression(String str, String str2) {
            this.f6736a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrackErrorScreenImpression)) {
                return false;
            }
            TrackErrorScreenImpression trackErrorScreenImpression = (TrackErrorScreenImpression) obj;
            return Intrinsics.c(this.f6736a, trackErrorScreenImpression.f6736a) && Intrinsics.c(this.b, trackErrorScreenImpression.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6736a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("TrackErrorScreenImpression(headerText=", this.f6736a, ", bodyText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$TrackSnackbarImpression;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TrackSnackbarImpression implements BundlesUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f6737a;

        public TrackSnackbarImpression(String str) {
            this.f6737a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TrackSnackbarImpression) && Intrinsics.c(this.f6737a, ((TrackSnackbarImpression) obj).f6737a);
        }

        public final int hashCode() {
            return this.f6737a.hashCode();
        }

        public final String toString() {
            return YU.a.h("TrackSnackbarImpression(message=", this.f6737a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent$UpdateCachedProducts;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEvent;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdateCachedProducts implements BundlesUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final List f6738a;

        public UpdateCachedProducts(List bundles) {
            Intrinsics.h(bundles, "bundles");
            this.f6738a = bundles;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateCachedProducts) && Intrinsics.c(this.f6738a, ((UpdateCachedProducts) obj).f6738a);
        }

        public final int hashCode() {
            return this.f6738a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.l("UpdateCachedProducts(bundles=", ")", this.f6738a);
        }
    }
}
