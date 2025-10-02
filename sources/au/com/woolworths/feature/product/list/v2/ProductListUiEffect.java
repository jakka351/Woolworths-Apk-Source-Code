package au.com.woolworths.feature.product.list.v2;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect;", "", "OnNavigateBackClick", "LaunchCartScreen", "LaunchProductsTab", "OpenOliveChat", "LaunchWatchlistGuestOnboardingScreen", "LaunchProductSearch", "LaunchDeeplink", "LaunchInstoreMap", "LaunchProductDetails", "DisplaySnackbarForWatchlist", "LaunchProductAvailability", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect$DisplaySnackbarForWatchlist;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect$LaunchCartScreen;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect$LaunchDeeplink;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect$LaunchInstoreMap;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect$LaunchProductAvailability;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect$LaunchProductDetails;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect$LaunchProductSearch;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect$LaunchProductsTab;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect$LaunchWatchlistGuestOnboardingScreen;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect$OnNavigateBackClick;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect$OpenOliveChat;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ProductListUiEffect {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect$DisplaySnackbarForWatchlist;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DisplaySnackbarForWatchlist implements ProductListUiEffect {

        /* renamed from: a, reason: collision with root package name */
        public final String f5499a;
        public final ResText b;
        public final boolean c;
        public final ProductCard d;

        public DisplaySnackbarForWatchlist(String str, ResText resText, boolean z, ProductCard productCard) {
            Intrinsics.h(productCard, "productCard");
            this.f5499a = str;
            this.b = resText;
            this.c = z;
            this.d = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DisplaySnackbarForWatchlist)) {
                return false;
            }
            DisplaySnackbarForWatchlist displaySnackbarForWatchlist = (DisplaySnackbarForWatchlist) obj;
            return this.f5499a.equals(displaySnackbarForWatchlist.f5499a) && this.b.equals(displaySnackbarForWatchlist.b) && this.c == displaySnackbarForWatchlist.c && Intrinsics.c(this.d, displaySnackbarForWatchlist.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + b.e((this.b.hashCode() + (this.f5499a.hashCode() * 31)) * 31, 31, this.c);
        }

        public final String toString() {
            return "DisplaySnackbarForWatchlist(watchlistId=" + this.f5499a + ", message=" + this.b + ", showViewListAction=" + this.c + ", productCard=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect$LaunchCartScreen;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LaunchCartScreen implements ProductListUiEffect {

        /* renamed from: a, reason: collision with root package name */
        public static final LaunchCartScreen f5500a = new LaunchCartScreen();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LaunchCartScreen);
        }

        public final int hashCode() {
            return 1970541569;
        }

        public final String toString() {
            return "LaunchCartScreen";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect$LaunchDeeplink;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LaunchDeeplink implements ProductListUiEffect {

        /* renamed from: a, reason: collision with root package name */
        public final String f5501a;

        public LaunchDeeplink(String uri) {
            Intrinsics.h(uri, "uri");
            this.f5501a = uri;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LaunchDeeplink) && Intrinsics.c(this.f5501a, ((LaunchDeeplink) obj).f5501a);
        }

        public final int hashCode() {
            return this.f5501a.hashCode();
        }

        public final String toString() {
            return YU.a.h("LaunchDeeplink(uri=", this.f5501a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect$LaunchInstoreMap;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LaunchInstoreMap implements ProductListUiEffect {

        /* renamed from: a, reason: collision with root package name */
        public final ProductCard f5502a;

        static {
            int i = ProductCard.$stable;
        }

        public LaunchInstoreMap(ProductCard productCard) {
            Intrinsics.h(productCard, "productCard");
            this.f5502a = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LaunchInstoreMap) && Intrinsics.c(this.f5502a, ((LaunchInstoreMap) obj).f5502a);
        }

        public final int hashCode() {
            return this.f5502a.hashCode();
        }

        public final String toString() {
            return d.n("LaunchInstoreMap(productCard=", this.f5502a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect$LaunchProductAvailability;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LaunchProductAvailability implements ProductListUiEffect {

        /* renamed from: a, reason: collision with root package name */
        public final ProductCard f5503a;

        static {
            int i = ProductCard.$stable;
        }

        public LaunchProductAvailability(ProductCard data) {
            Intrinsics.h(data, "data");
            this.f5503a = data;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LaunchProductAvailability) && Intrinsics.c(this.f5503a, ((LaunchProductAvailability) obj).f5503a);
        }

        public final int hashCode() {
            return this.f5503a.hashCode();
        }

        public final String toString() {
            return d.n("LaunchProductAvailability(data=", this.f5503a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect$LaunchProductDetails;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LaunchProductDetails implements ProductListUiEffect {

        /* renamed from: a, reason: collision with root package name */
        public final ProductCard f5504a;

        static {
            int i = ProductCard.$stable;
        }

        public LaunchProductDetails(ProductCard productCard) {
            Intrinsics.h(productCard, "productCard");
            this.f5504a = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LaunchProductDetails) && Intrinsics.c(this.f5504a, ((LaunchProductDetails) obj).f5504a);
        }

        public final int hashCode() {
            return this.f5504a.hashCode();
        }

        public final String toString() {
            return d.n("LaunchProductDetails(productCard=", this.f5504a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect$LaunchProductSearch;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LaunchProductSearch implements ProductListUiEffect {

        /* renamed from: a, reason: collision with root package name */
        public final String f5505a;
        public final ProductCard b;

        static {
            int i = ProductCard.$stable;
        }

        public LaunchProductSearch(ProductCard productCard, String str) {
            this.f5505a = str;
            this.b = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LaunchProductSearch)) {
                return false;
            }
            LaunchProductSearch launchProductSearch = (LaunchProductSearch) obj;
            return Intrinsics.c(this.f5505a, launchProductSearch.f5505a) && Intrinsics.c(this.b, launchProductSearch.b);
        }

        public final int hashCode() {
            String str = this.f5505a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            ProductCard productCard = this.b;
            return iHashCode + (productCard != null ? productCard.hashCode() : 0);
        }

        public final String toString() {
            return "LaunchProductSearch(searchTerm=" + this.f5505a + ", productToReplace=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect$LaunchProductsTab;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LaunchProductsTab implements ProductListUiEffect {

        /* renamed from: a, reason: collision with root package name */
        public static final LaunchProductsTab f5506a = new LaunchProductsTab();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LaunchProductsTab);
        }

        public final int hashCode() {
            return -849210916;
        }

        public final String toString() {
            return "LaunchProductsTab";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect$LaunchWatchlistGuestOnboardingScreen;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LaunchWatchlistGuestOnboardingScreen implements ProductListUiEffect {

        /* renamed from: a, reason: collision with root package name */
        public static final LaunchWatchlistGuestOnboardingScreen f5507a = new LaunchWatchlistGuestOnboardingScreen();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LaunchWatchlistGuestOnboardingScreen);
        }

        public final int hashCode() {
            return 855206983;
        }

        public final String toString() {
            return "LaunchWatchlistGuestOnboardingScreen";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect$OnNavigateBackClick;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnNavigateBackClick implements ProductListUiEffect {

        /* renamed from: a, reason: collision with root package name */
        public static final OnNavigateBackClick f5508a = new OnNavigateBackClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnNavigateBackClick);
        }

        public final int hashCode() {
            return 216348367;
        }

        public final String toString() {
            return "OnNavigateBackClick";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect$OpenOliveChat;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEffect;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenOliveChat implements ProductListUiEffect {

        /* renamed from: a, reason: collision with root package name */
        public static final OpenOliveChat f5509a = new OpenOliveChat();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenOliveChat);
        }

        public final int hashCode() {
            return 799874983;
        }

        public final String toString() {
            return "OpenOliveChat";
        }
    }
}
