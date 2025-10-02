package au.com.woolworths.feature.shop.bundles;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.bundles.data.Bundle;
import au.com.woolworths.feature.shop.bundles.data.BundlesData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEffect;", "", "OpenBundlesAddToCartBottomSheet", "OpenProductDetailsActivity", "LaunchDeepLink", "OpenCartScreen", "OpenSortBottomSheetModal", "RetryPaginationClick", "CloseSortBottomSheetModal", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEffect$CloseSortBottomSheetModal;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEffect$LaunchDeepLink;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEffect$OpenBundlesAddToCartBottomSheet;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEffect$OpenCartScreen;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEffect$OpenProductDetailsActivity;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEffect$OpenSortBottomSheetModal;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEffect$RetryPaginationClick;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BundlesUiEffect {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEffect$CloseSortBottomSheetModal;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEffect;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CloseSortBottomSheetModal implements BundlesUiEffect {

        /* renamed from: a, reason: collision with root package name */
        public static final CloseSortBottomSheetModal f6711a = new CloseSortBottomSheetModal();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseSortBottomSheetModal);
        }

        public final int hashCode() {
            return 1069604935;
        }

        public final String toString() {
            return "CloseSortBottomSheetModal";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEffect$LaunchDeepLink;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEffect;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LaunchDeepLink implements BundlesUiEffect {

        /* renamed from: a, reason: collision with root package name */
        public final String f6712a;

        public LaunchDeepLink(String deeplink) {
            Intrinsics.h(deeplink, "deeplink");
            this.f6712a = deeplink;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LaunchDeepLink) && Intrinsics.c(this.f6712a, ((LaunchDeepLink) obj).f6712a);
        }

        public final int hashCode() {
            return this.f6712a.hashCode();
        }

        public final String toString() {
            return YU.a.h("LaunchDeepLink(deeplink=", this.f6712a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEffect$OpenBundlesAddToCartBottomSheet;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEffect;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenBundlesAddToCartBottomSheet implements BundlesUiEffect {

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f6713a;
        public final BundlesData.BundlesLandingPage b;

        public OpenBundlesAddToCartBottomSheet(Bundle bundle, BundlesData.BundlesLandingPage bundlesData) {
            Intrinsics.h(bundlesData, "bundlesData");
            this.f6713a = bundle;
            this.b = bundlesData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenBundlesAddToCartBottomSheet)) {
                return false;
            }
            OpenBundlesAddToCartBottomSheet openBundlesAddToCartBottomSheet = (OpenBundlesAddToCartBottomSheet) obj;
            return Intrinsics.c(this.f6713a, openBundlesAddToCartBottomSheet.f6713a) && Intrinsics.c(this.b, openBundlesAddToCartBottomSheet.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6713a.hashCode() * 31);
        }

        public final String toString() {
            return "OpenBundlesAddToCartBottomSheet(bundle=" + this.f6713a + ", bundlesData=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEffect$OpenCartScreen;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEffect;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenCartScreen implements BundlesUiEffect {

        /* renamed from: a, reason: collision with root package name */
        public static final OpenCartScreen f6714a = new OpenCartScreen();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenCartScreen);
        }

        public final int hashCode() {
            return -1567845058;
        }

        public final String toString() {
            return "OpenCartScreen";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEffect$OpenProductDetailsActivity;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEffect;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenProductDetailsActivity implements BundlesUiEffect {

        /* renamed from: a, reason: collision with root package name */
        public final String f6715a;

        public OpenProductDetailsActivity(String productId) {
            Intrinsics.h(productId, "productId");
            this.f6715a = productId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenProductDetailsActivity) && Intrinsics.c(this.f6715a, ((OpenProductDetailsActivity) obj).f6715a);
        }

        public final int hashCode() {
            return this.f6715a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OpenProductDetailsActivity(productId=", this.f6715a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEffect$OpenSortBottomSheetModal;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEffect;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenSortBottomSheetModal implements BundlesUiEffect {

        /* renamed from: a, reason: collision with root package name */
        public static final OpenSortBottomSheetModal f6716a = new OpenSortBottomSheetModal();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenSortBottomSheetModal);
        }

        public final int hashCode() {
            return -1910349335;
        }

        public final String toString() {
            return "OpenSortBottomSheetModal";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesUiEffect$RetryPaginationClick;", "Lau/com/woolworths/feature/shop/bundles/BundlesUiEffect;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RetryPaginationClick implements BundlesUiEffect {

        /* renamed from: a, reason: collision with root package name */
        public static final RetryPaginationClick f6717a = new RetryPaginationClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryPaginationClick);
        }

        public final int hashCode() {
            return -1667237906;
        }

        public final String toString() {
            return "RetryPaginationClick";
        }
    }
}
