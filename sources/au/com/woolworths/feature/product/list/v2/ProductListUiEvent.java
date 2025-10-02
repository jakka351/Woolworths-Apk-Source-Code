package au.com.woolworths.feature.product.list.v2;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.feature.shop.contentpage.data.HorizontalListData;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.productcategorytile.ProductCategoryTileData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent;", "", "OnNavigateBackClick", "OnClearSearchClick", "OnSearchBarClick", "OnSearchButtonClick", "OnVoiceSearchClick", "OnCartClick", "OnZeroResultScreenVisible", "OnErrorScreenClearFiltersClicked", "OnProductCategoryTileClick", "OnBrowseAllAislesClicked", "OnZeroResultHorizontalListVisible", "OnChatEntryBannerClick", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent$OnBrowseAllAislesClicked;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent$OnCartClick;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent$OnChatEntryBannerClick;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent$OnClearSearchClick;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent$OnErrorScreenClearFiltersClicked;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent$OnNavigateBackClick;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent$OnProductCategoryTileClick;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent$OnSearchBarClick;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent$OnSearchButtonClick;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent$OnVoiceSearchClick;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent$OnZeroResultHorizontalListVisible;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent$OnZeroResultScreenVisible;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ProductListUiEvent {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent$OnBrowseAllAislesClicked;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBrowseAllAislesClicked implements ProductListUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f5510a;

        public OnBrowseAllAislesClicked(String str) {
            this.f5510a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnBrowseAllAislesClicked) && Intrinsics.c(this.f5510a, ((OnBrowseAllAislesClicked) obj).f5510a);
        }

        public final int hashCode() {
            return this.f5510a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnBrowseAllAislesClicked(text=", this.f5510a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent$OnCartClick;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCartClick implements ProductListUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final OnCartClick f5511a = new OnCartClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnCartClick);
        }

        public final int hashCode() {
            return 2043173594;
        }

        public final String toString() {
            return "OnCartClick";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent$OnChatEntryBannerClick;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnChatEntryBannerClick implements ProductListUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f5512a;

        public OnChatEntryBannerClick(String str) {
            this.f5512a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnChatEntryBannerClick) && Intrinsics.c(this.f5512a, ((OnChatEntryBannerClick) obj).f5512a);
        }

        public final int hashCode() {
            return this.f5512a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnChatEntryBannerClick(title=", this.f5512a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent$OnClearSearchClick;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnClearSearchClick implements ProductListUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final OnClearSearchClick f5513a = new OnClearSearchClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnClearSearchClick);
        }

        public final int hashCode() {
            return -1403735199;
        }

        public final String toString() {
            return "OnClearSearchClick";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent$OnErrorScreenClearFiltersClicked;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnErrorScreenClearFiltersClicked implements ProductListUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final ActionData f5514a;
        public final AnalyticsData b;

        public OnErrorScreenClearFiltersClicked(ActionData action, AnalyticsData analyticsData) {
            Intrinsics.h(action, "action");
            this.f5514a = action;
            this.b = analyticsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnErrorScreenClearFiltersClicked)) {
                return false;
            }
            OnErrorScreenClearFiltersClicked onErrorScreenClearFiltersClicked = (OnErrorScreenClearFiltersClicked) obj;
            return Intrinsics.c(this.f5514a, onErrorScreenClearFiltersClicked.f5514a) && Intrinsics.c(this.b, onErrorScreenClearFiltersClicked.b);
        }

        public final int hashCode() {
            int iHashCode = this.f5514a.hashCode() * 31;
            AnalyticsData analyticsData = this.b;
            return iHashCode + (analyticsData == null ? 0 : analyticsData.hashCode());
        }

        public final String toString() {
            return "OnErrorScreenClearFiltersClicked(action=" + this.f5514a + ", analytics=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent$OnNavigateBackClick;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnNavigateBackClick implements ProductListUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final OnNavigateBackClick f5515a = new OnNavigateBackClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnNavigateBackClick);
        }

        public final int hashCode() {
            return -27833086;
        }

        public final String toString() {
            return "OnNavigateBackClick";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent$OnProductCategoryTileClick;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCategoryTileClick implements ProductListUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final ProductCategoryTileData f5516a;

        public OnProductCategoryTileClick(ProductCategoryTileData productCategoryTileData) {
            Intrinsics.h(productCategoryTileData, "productCategoryTileData");
            this.f5516a = productCategoryTileData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnProductCategoryTileClick) && Intrinsics.c(this.f5516a, ((OnProductCategoryTileClick) obj).f5516a);
        }

        public final int hashCode() {
            return this.f5516a.hashCode();
        }

        public final String toString() {
            return "OnProductCategoryTileClick(productCategoryTileData=" + this.f5516a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent$OnSearchBarClick;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnSearchBarClick implements ProductListUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final OnSearchBarClick f5517a = new OnSearchBarClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnSearchBarClick);
        }

        public final int hashCode() {
            return -1584755285;
        }

        public final String toString() {
            return "OnSearchBarClick";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent$OnSearchButtonClick;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnSearchButtonClick implements ProductListUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final OnSearchButtonClick f5518a = new OnSearchButtonClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnSearchButtonClick);
        }

        public final int hashCode() {
            return -2139791040;
        }

        public final String toString() {
            return "OnSearchButtonClick";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent$OnVoiceSearchClick;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnVoiceSearchClick implements ProductListUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final OnVoiceSearchClick f5519a = new OnVoiceSearchClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnVoiceSearchClick);
        }

        public final int hashCode() {
            return 2016556892;
        }

        public final String toString() {
            return "OnVoiceSearchClick";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent$OnZeroResultHorizontalListVisible;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnZeroResultHorizontalListVisible implements ProductListUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final HorizontalListData f5520a;

        public OnZeroResultHorizontalListVisible(HorizontalListData horizontalListData) {
            this.f5520a = horizontalListData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnZeroResultHorizontalListVisible) && Intrinsics.c(this.f5520a, ((OnZeroResultHorizontalListVisible) obj).f5520a);
        }

        public final int hashCode() {
            return this.f5520a.hashCode();
        }

        public final String toString() {
            return "OnZeroResultHorizontalListVisible(categoryData=" + this.f5520a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent$OnZeroResultScreenVisible;", "Lau/com/woolworths/feature/product/list/v2/ProductListUiEvent;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnZeroResultScreenVisible implements ProductListUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final OnZeroResultScreenVisible f5521a = new OnZeroResultScreenVisible();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnZeroResultScreenVisible);
        }

        public final int hashCode() {
            return -1570352493;
        }

        public final String toString() {
            return "OnZeroResultScreenVisible";
        }
    }
}
