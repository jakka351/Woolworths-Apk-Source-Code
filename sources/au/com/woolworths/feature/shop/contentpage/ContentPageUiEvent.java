package au.com.woolworths.feature.shop.contentpage;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.feature.shop.contentpage.data.ContentPageData;
import au.com.woolworths.feature.shop.contentpage.data.HorizontalListData;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.shop.aem.components.model.CatalogueCard;
import au.com.woolworths.shop.aem.components.model.QuickLinkCard;
import au.com.woolworths.shop.aem.components.model.gridlist.GridListItem;
import au.com.woolworths.shop.aem.components.model.gridlist.GridRowData;
import au.com.woolworths.shop.aem.components.model.herobanner.HeroBanner;
import au.com.woolworths.shop.aem.components.model.searchnavcard.SearchNavCardData;
import au.com.woolworths.shop.aem.components.model.verticallist.VerticalListData;
import au.com.woolworths.shop.aem.components.model.video.VideoData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u001c\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u0082\u0001\u001c\u001e\u001f !\"#$%&'()*+,-./0123456789ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006:À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "", "OnVideoPlayClick", "OnHorizontalListItemClick", "OnGridRowItemClick", "OnSearchNavCardClicked", "OnRowClick", "OnBroadcastBannerClicked", "OnLinkClick", "OnHorizontalListActionClick", "OnDynamicSizeCardClick", "OnBroadcastBannerImpression", "OnVerticalListActionClick", "OnQuickLinkClick", "OnCoreBroadcastBannerClicked", "OnVideoAdPositionChange", "OnVideoAdLinkClick", "OnShareClick", "OnButtonClick", "OnInsetBannerActionClick", "TrackBroadcastBannerDismissed", "TrackBroadcastBannerImpression", "OnHeroBannerImpression", "OnLoginButtonClick", "OnInfoTileButtonClick", "OnPageImpression", "OnOliveChatBannerClick", "OnCatalogueCardClick", "OnInStoreAisleClicked", "OnCatalogueCardImpression", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnBroadcastBannerClicked;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnBroadcastBannerImpression;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnButtonClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnCatalogueCardClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnCatalogueCardImpression;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnCoreBroadcastBannerClicked;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnDynamicSizeCardClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnGridRowItemClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnHeroBannerImpression;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnHorizontalListActionClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnHorizontalListItemClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnInStoreAisleClicked;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnInfoTileButtonClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnInsetBannerActionClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnLinkClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnLoginButtonClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnOliveChatBannerClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnPageImpression;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnQuickLinkClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnRowClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnSearchNavCardClicked;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnShareClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnVerticalListActionClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnVideoAdLinkClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnVideoAdPositionChange;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnVideoPlayClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$TrackBroadcastBannerDismissed;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$TrackBroadcastBannerImpression;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ContentPageUiEvent {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnBroadcastBannerClicked;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBroadcastBannerClicked implements ContentPageUiEvent {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnBroadcastBannerClicked);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "OnBroadcastBannerClicked(data=null)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnBroadcastBannerImpression;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBroadcastBannerImpression implements ContentPageUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final BroadcastBannerData f6989a;

        public OnBroadcastBannerImpression(BroadcastBannerData data) {
            Intrinsics.h(data, "data");
            this.f6989a = data;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnBroadcastBannerImpression) && Intrinsics.c(this.f6989a, ((OnBroadcastBannerImpression) obj).f6989a);
        }

        public final int hashCode() {
            return this.f6989a.hashCode();
        }

        public final String toString() {
            return "OnBroadcastBannerImpression(data=" + this.f6989a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnButtonClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnButtonClick implements ContentPageUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final ActionData f6990a;

        public OnButtonClick(ActionData actionData) {
            Intrinsics.h(actionData, "actionData");
            this.f6990a = actionData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnButtonClick) && Intrinsics.c(this.f6990a, ((OnButtonClick) obj).f6990a);
        }

        public final int hashCode() {
            return this.f6990a.hashCode();
        }

        public final String toString() {
            return "OnButtonClick(actionData=" + this.f6990a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnCatalogueCardClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCatalogueCardClick implements ContentPageUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final CatalogueCard f6991a;

        public OnCatalogueCardClick(CatalogueCard catalogueCard) {
            Intrinsics.h(catalogueCard, "catalogueCard");
            this.f6991a = catalogueCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCatalogueCardClick) && Intrinsics.c(this.f6991a, ((OnCatalogueCardClick) obj).f6991a);
        }

        public final int hashCode() {
            return this.f6991a.hashCode();
        }

        public final String toString() {
            return "OnCatalogueCardClick(catalogueCard=" + this.f6991a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnCatalogueCardImpression;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCatalogueCardImpression implements ContentPageUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final CatalogueCard f6992a;

        public OnCatalogueCardImpression(CatalogueCard catalogueCard) {
            Intrinsics.h(catalogueCard, "catalogueCard");
            this.f6992a = catalogueCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCatalogueCardImpression) && Intrinsics.c(this.f6992a, ((OnCatalogueCardImpression) obj).f6992a);
        }

        public final int hashCode() {
            return this.f6992a.hashCode();
        }

        public final String toString() {
            return "OnCatalogueCardImpression(catalogueCard=" + this.f6992a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnCoreBroadcastBannerClicked;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCoreBroadcastBannerClicked implements ContentPageUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final ActionData f6993a;

        public OnCoreBroadcastBannerClicked(ActionData action) {
            Intrinsics.h(action, "action");
            this.f6993a = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCoreBroadcastBannerClicked) && Intrinsics.c(this.f6993a, ((OnCoreBroadcastBannerClicked) obj).f6993a);
        }

        public final int hashCode() {
            return this.f6993a.hashCode();
        }

        public final String toString() {
            return "OnCoreBroadcastBannerClicked(action=" + this.f6993a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnDynamicSizeCardClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnDynamicSizeCardClick implements ContentPageUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final DynamicSizeCardData f6994a;

        public OnDynamicSizeCardClick(DynamicSizeCardData data) {
            Intrinsics.h(data, "data");
            this.f6994a = data;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnDynamicSizeCardClick) && Intrinsics.c(this.f6994a, ((OnDynamicSizeCardClick) obj).f6994a);
        }

        public final int hashCode() {
            return this.f6994a.hashCode();
        }

        public final String toString() {
            return "OnDynamicSizeCardClick(data=" + this.f6994a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnGridRowItemClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnGridRowItemClick implements ContentPageUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final GridRowData f6995a;
        public final GridListItem b;

        public OnGridRowItemClick(GridRowData gridRowData, GridListItem item) {
            Intrinsics.h(gridRowData, "gridRowData");
            Intrinsics.h(item, "item");
            this.f6995a = gridRowData;
            this.b = item;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnGridRowItemClick)) {
                return false;
            }
            OnGridRowItemClick onGridRowItemClick = (OnGridRowItemClick) obj;
            return Intrinsics.c(this.f6995a, onGridRowItemClick.f6995a) && Intrinsics.c(this.b, onGridRowItemClick.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6995a.hashCode() * 31);
        }

        public final String toString() {
            return "OnGridRowItemClick(gridRowData=" + this.f6995a + ", item=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnHeroBannerImpression;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHeroBannerImpression implements ContentPageUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final HeroBanner f6996a;

        public OnHeroBannerImpression(HeroBanner heroBanner) {
            Intrinsics.h(heroBanner, "heroBanner");
            this.f6996a = heroBanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHeroBannerImpression) && Intrinsics.c(this.f6996a, ((OnHeroBannerImpression) obj).f6996a);
        }

        public final int hashCode() {
            return this.f6996a.hashCode();
        }

        public final String toString() {
            return "OnHeroBannerImpression(heroBanner=" + this.f6996a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnHorizontalListActionClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHorizontalListActionClick implements ContentPageUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final HorizontalListData f6997a;

        public OnHorizontalListActionClick(HorizontalListData data) {
            Intrinsics.h(data, "data");
            this.f6997a = data;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHorizontalListActionClick) && Intrinsics.c(this.f6997a, ((OnHorizontalListActionClick) obj).f6997a);
        }

        public final int hashCode() {
            return this.f6997a.hashCode();
        }

        public final String toString() {
            return "OnHorizontalListActionClick(data=" + this.f6997a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnHorizontalListItemClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHorizontalListItemClick implements ContentPageUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final HorizontalListData f6998a;
        public final Object b;

        public OnHorizontalListItemClick(HorizontalListData horizontalListData, Object obj) {
            Intrinsics.h(horizontalListData, "horizontalListData");
            this.f6998a = horizontalListData;
            this.b = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnHorizontalListItemClick)) {
                return false;
            }
            OnHorizontalListItemClick onHorizontalListItemClick = (OnHorizontalListItemClick) obj;
            return Intrinsics.c(this.f6998a, onHorizontalListItemClick.f6998a) && Intrinsics.c(this.b, onHorizontalListItemClick.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6998a.hashCode() * 31);
        }

        public final String toString() {
            return "OnHorizontalListItemClick(horizontalListData=" + this.f6998a + ", item=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnInStoreAisleClicked;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnInStoreAisleClicked implements ContentPageUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final ProductCard f6999a;

        static {
            int i = ProductCard.$stable;
        }

        public OnInStoreAisleClicked(ProductCard productCard) {
            Intrinsics.h(productCard, "productCard");
            this.f6999a = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnInStoreAisleClicked) && Intrinsics.c(this.f6999a, ((OnInStoreAisleClicked) obj).f6999a);
        }

        public final int hashCode() {
            return this.f6999a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.dynamic.page.ui.content.d.n("OnInStoreAisleClicked(productCard=", this.f6999a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnInfoTileButtonClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnInfoTileButtonClick implements ContentPageUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final ActionData f7000a;

        public OnInfoTileButtonClick(ActionData action) {
            Intrinsics.h(action, "action");
            this.f7000a = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnInfoTileButtonClick) && Intrinsics.c(this.f7000a, ((OnInfoTileButtonClick) obj).f7000a);
        }

        public final int hashCode() {
            return this.f7000a.hashCode();
        }

        public final String toString() {
            return "OnInfoTileButtonClick(action=" + this.f7000a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnInsetBannerActionClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnInsetBannerActionClick implements ContentPageUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBanner f7001a;

        public OnInsetBannerActionClick(InsetBanner insetBanner) {
            Intrinsics.h(insetBanner, "insetBanner");
            this.f7001a = insetBanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnInsetBannerActionClick) && Intrinsics.c(this.f7001a, ((OnInsetBannerActionClick) obj).f7001a);
        }

        public final int hashCode() {
            return this.f7001a.hashCode();
        }

        public final String toString() {
            return "OnInsetBannerActionClick(insetBanner=" + this.f7001a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnLinkClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnLinkClick implements ContentPageUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f7002a;
        public final String b;

        public OnLinkClick(String link, String text) {
            Intrinsics.h(link, "link");
            Intrinsics.h(text, "text");
            this.f7002a = link;
            this.b = text;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnLinkClick)) {
                return false;
            }
            OnLinkClick onLinkClick = (OnLinkClick) obj;
            return Intrinsics.c(this.f7002a, onLinkClick.f7002a) && Intrinsics.c(this.b, onLinkClick.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f7002a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("OnLinkClick(link=", this.f7002a, ", text=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnLoginButtonClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnLoginButtonClick implements ContentPageUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final OnLoginButtonClick f7003a = new OnLoginButtonClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnLoginButtonClick);
        }

        public final int hashCode() {
            return 494649123;
        }

        public final String toString() {
            return "OnLoginButtonClick";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnOliveChatBannerClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOliveChatBannerClick implements ContentPageUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final ActionData f7004a;

        public OnOliveChatBannerClick(ActionData actionData) {
            Intrinsics.h(actionData, "actionData");
            this.f7004a = actionData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnOliveChatBannerClick) && Intrinsics.c(this.f7004a, ((OnOliveChatBannerClick) obj).f7004a);
        }

        public final int hashCode() {
            return this.f7004a.hashCode();
        }

        public final String toString() {
            return "OnOliveChatBannerClick(actionData=" + this.f7004a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnPageImpression;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPageImpression implements ContentPageUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final ContentPageData f7005a;

        public OnPageImpression(ContentPageData pageData) {
            Intrinsics.h(pageData, "pageData");
            this.f7005a = pageData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnPageImpression) && Intrinsics.c(this.f7005a, ((OnPageImpression) obj).f7005a);
        }

        public final int hashCode() {
            return this.f7005a.hashCode();
        }

        public final String toString() {
            return "OnPageImpression(pageData=" + this.f7005a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnQuickLinkClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnQuickLinkClick implements ContentPageUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final HorizontalListData f7006a;
        public final QuickLinkCard b;

        public OnQuickLinkClick(HorizontalListData data, QuickLinkCard quickLinkCard) {
            Intrinsics.h(data, "data");
            Intrinsics.h(quickLinkCard, "quickLinkCard");
            this.f7006a = data;
            this.b = quickLinkCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnQuickLinkClick)) {
                return false;
            }
            OnQuickLinkClick onQuickLinkClick = (OnQuickLinkClick) obj;
            return Intrinsics.c(this.f7006a, onQuickLinkClick.f7006a) && Intrinsics.c(this.b, onQuickLinkClick.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f7006a.hashCode() * 31);
        }

        public final String toString() {
            return "OnQuickLinkClick(data=" + this.f7006a + ", quickLinkCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnRowClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRowClick implements ContentPageUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final ActionData f7007a;

        public OnRowClick(ActionData actionData) {
            this.f7007a = actionData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRowClick) && Intrinsics.c(this.f7007a, ((OnRowClick) obj).f7007a);
        }

        public final int hashCode() {
            ActionData actionData = this.f7007a;
            if (actionData == null) {
                return 0;
            }
            return actionData.hashCode();
        }

        public final String toString() {
            return "OnRowClick(action=" + this.f7007a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnSearchNavCardClicked;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnSearchNavCardClicked implements ContentPageUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final SearchNavCardData f7008a;

        public OnSearchNavCardClicked(SearchNavCardData searchNavCardData) {
            Intrinsics.h(searchNavCardData, "searchNavCardData");
            this.f7008a = searchNavCardData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSearchNavCardClicked) && Intrinsics.c(this.f7008a, ((OnSearchNavCardClicked) obj).f7008a);
        }

        public final int hashCode() {
            return this.f7008a.hashCode();
        }

        public final String toString() {
            return "OnSearchNavCardClicked(searchNavCardData=" + this.f7008a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnShareClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnShareClick implements ContentPageUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final OnShareClick f7009a = new OnShareClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnShareClick);
        }

        public final int hashCode() {
            return -1295473089;
        }

        public final String toString() {
            return "OnShareClick";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnVerticalListActionClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnVerticalListActionClick implements ContentPageUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final VerticalListData f7010a;

        public OnVerticalListActionClick(VerticalListData data) {
            Intrinsics.h(data, "data");
            this.f7010a = data;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnVerticalListActionClick) && Intrinsics.c(this.f7010a, ((OnVerticalListActionClick) obj).f7010a);
        }

        public final int hashCode() {
            return this.f7010a.hashCode();
        }

        public final String toString() {
            return "OnVerticalListActionClick(data=" + this.f7010a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnVideoAdLinkClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnVideoAdLinkClick implements ContentPageUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final ActionData f7011a;

        public OnVideoAdLinkClick(ActionData linkAction) {
            Intrinsics.h(linkAction, "linkAction");
            this.f7011a = linkAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnVideoAdLinkClick) && Intrinsics.c(this.f7011a, ((OnVideoAdLinkClick) obj).f7011a);
        }

        public final int hashCode() {
            return this.f7011a.hashCode();
        }

        public final String toString() {
            return "OnVideoAdLinkClick(linkAction=" + this.f7011a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnVideoAdPositionChange;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnVideoAdPositionChange implements ContentPageUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final float f7012a;
        public final float b;
        public final float c;

        public OnVideoAdPositionChange(float f, float f2, float f3) {
            this.f7012a = f;
            this.b = f2;
            this.c = f3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnVideoAdPositionChange)) {
                return false;
            }
            OnVideoAdPositionChange onVideoAdPositionChange = (OnVideoAdPositionChange) obj;
            return Float.compare(this.f7012a, onVideoAdPositionChange.f7012a) == 0 && Float.compare(this.b, onVideoAdPositionChange.b) == 0 && Float.compare(this.c, onVideoAdPositionChange.c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.c) + android.support.v4.media.session.a.b(this.b, Float.hashCode(this.f7012a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnVideoAdPositionChange(yPos=");
            sb.append(this.f7012a);
            sb.append(", height=");
            sb.append(this.b);
            sb.append(", screenHeight=");
            return android.support.v4.media.session.a.j(this.c, ")", sb);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$OnVideoPlayClick;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnVideoPlayClick implements ContentPageUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final VideoData f7013a;

        public OnVideoPlayClick(VideoData videoData) {
            Intrinsics.h(videoData, "videoData");
            this.f7013a = videoData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnVideoPlayClick) && Intrinsics.c(this.f7013a, ((OnVideoPlayClick) obj).f7013a);
        }

        public final int hashCode() {
            return this.f7013a.hashCode();
        }

        public final String toString() {
            return "OnVideoPlayClick(videoData=" + this.f7013a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$TrackBroadcastBannerDismissed;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TrackBroadcastBannerDismissed implements ContentPageUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final AnalyticsData f7014a;

        public TrackBroadcastBannerDismissed(AnalyticsData analytics) {
            Intrinsics.h(analytics, "analytics");
            this.f7014a = analytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TrackBroadcastBannerDismissed) && Intrinsics.c(this.f7014a, ((TrackBroadcastBannerDismissed) obj).f7014a);
        }

        public final int hashCode() {
            return this.f7014a.hashCode();
        }

        public final String toString() {
            return "TrackBroadcastBannerDismissed(analytics=" + this.f7014a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent$TrackBroadcastBannerImpression;", "Lau/com/woolworths/feature/shop/contentpage/ContentPageUiEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TrackBroadcastBannerImpression implements ContentPageUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final AnalyticsData f7015a;

        public TrackBroadcastBannerImpression(AnalyticsData analytics) {
            Intrinsics.h(analytics, "analytics");
            this.f7015a = analytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TrackBroadcastBannerImpression) && Intrinsics.c(this.f7015a, ((TrackBroadcastBannerImpression) obj).f7015a);
        }

        public final int hashCode() {
            return this.f7015a.hashCode();
        }

        public final String toString() {
            return "TrackBroadcastBannerImpression(analytics=" + this.f7015a + ")";
        }
    }
}
