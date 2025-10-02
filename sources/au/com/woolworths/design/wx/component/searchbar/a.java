package au.com.woolworths.design.wx.component.searchbar;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.input.TextFieldValue;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.feature.product.list.compose.CoachMarkKt;
import au.com.woolworths.feature.product.list.v2.ProductListUiEvent;
import au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.RewardsOfferListItemSeen;
import au.com.woolworths.feature.shop.brandedshop.UiEvent;
import au.com.woolworths.feature.shop.bundles.BundlesUiEvent;
import au.com.woolworths.feature.shop.contentpage.ContentPageUiEvent;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.rewards.base.data.EmptyStateButtonData;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.shop.aem.components.model.CatalogueCard;
import au.com.woolworths.shop.aem.components.model.contentcard.FullWidthContentCardData;
import au.com.woolworths.shop.aem.components.model.editorialbanner.EditorialBannerData;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListData;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem;
import au.com.woolworths.shop.aem.components.model.productcategorytile.ProductCategoryTileData;
import au.com.woolworths.shop.aem.components.model.verticallist.VerticalListData;
import au.com.woolworths.shop.aem.components.model.video.VideoData;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ a(int i, Function1 function1) {
        this.d = i;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                TextFieldValue it = (TextFieldValue) obj;
                Intrinsics.h(it, "it");
                this.e.invoke(it);
                break;
            case 1:
                Modifier conditional = (Modifier) obj;
                Intrinsics.h(conditional, "$this$conditional");
                break;
            case 2:
                LayoutCoordinates coordinate = (LayoutCoordinates) obj;
                Intrinsics.h(coordinate, "coordinate");
                Function1 function1 = this.e;
                if (function1 != null) {
                    function1.invoke(CoachMarkKt.d(coordinate));
                }
                break;
            case 3:
                ProductCategoryTileData it2 = (ProductCategoryTileData) obj;
                Intrinsics.h(it2, "it");
                this.e.invoke(it2);
                break;
            case 4:
                Modifier conditional2 = (Modifier) obj;
                Intrinsics.h(conditional2, "$this$conditional");
                break;
            case 5:
                LayoutCoordinates coordinate2 = (LayoutCoordinates) obj;
                Intrinsics.h(coordinate2, "coordinate");
                Function1 function12 = this.e;
                if (function12 != null) {
                    function12.invoke(au.com.woolworths.feature.product.list.legacy.compose.CoachMarkKt.d(coordinate2));
                }
                break;
            case 6:
                ProductCategoryTileData it3 = (ProductCategoryTileData) obj;
                Intrinsics.h(it3, "it");
                this.e.invoke(it3);
                break;
            case 7:
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                this.e.invoke(ProductListUiEvent.OnZeroResultScreenVisible.f5521a);
                break;
            case 8:
                ProductCategoryTileData it4 = (ProductCategoryTileData) obj;
                Intrinsics.h(it4, "it");
                this.e.invoke(new ProductListUiEvent.OnProductCategoryTileClick(it4));
                break;
            case 9:
                EmptyStateButtonData it5 = (EmptyStateButtonData) obj;
                Intrinsics.h(it5, "it");
                this.e.invoke(it5.getUrl());
                break;
            case 10:
                RewardsOfferData it6 = (RewardsOfferData) obj;
                Intrinsics.h(it6, "it");
                this.e.invoke(new RewardsOfferListItemSeen.Offer(it6));
                break;
            case 11:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.e.invoke(bool);
                break;
            case 12:
                HorizontalListItem item = (HorizontalListItem) obj;
                Intrinsics.h(item, "item");
                this.e.invoke(new UiEvent.OnListItemClick(item));
                break;
            case 13:
                HorizontalListData it7 = (HorizontalListData) obj;
                Intrinsics.h(it7, "it");
                this.e.invoke(new UiEvent.OnHorizontalListActionClick(it7));
                break;
            case 14:
                FullWidthContentCardData cardData = (FullWidthContentCardData) obj;
                Intrinsics.h(cardData, "cardData");
                this.e.invoke(new UiEvent.OnFullWidthContentCardClick(cardData));
                break;
            case 15:
                ActionData actionData = (ActionData) obj;
                Intrinsics.h(actionData, "actionData");
                this.e.invoke(new BundlesUiEvent.BroadcastBannerActionClick(actionData));
                break;
            case 16:
                AnalyticsData analyticsData = (AnalyticsData) obj;
                if (analyticsData != null) {
                    this.e.invoke(new BundlesUiEvent.TrackBroadcastBannerDismissed(analyticsData));
                }
                break;
            case 17:
                ActionData actionData2 = (ActionData) obj;
                Intrinsics.h(actionData2, "actionData");
                this.e.invoke(new BundlesUiEvent.OnAlertActionClick(actionData2));
                break;
            case 18:
                this.e.invoke(new BundlesUiEvent.TrackAlertImpression((AnalyticsData) obj));
                break;
            case 19:
                List seen = (List) obj;
                Intrinsics.h(seen, "seen");
                Iterator it8 = seen.iterator();
                while (it8.hasNext()) {
                    this.e.invoke(Integer.valueOf(((LazyListItemInfo) it8.next()).getF996a()));
                }
                break;
            case 20:
                VideoData it9 = (VideoData) obj;
                Intrinsics.h(it9, "it");
                this.e.invoke(new ContentPageUiEvent.OnVideoPlayClick(it9));
                break;
            case 21:
                DynamicSizeCardData data = (DynamicSizeCardData) obj;
                Intrinsics.h(data, "data");
                this.e.invoke(new ContentPageUiEvent.OnDynamicSizeCardClick(data));
                break;
            case 22:
                CatalogueCard it10 = (CatalogueCard) obj;
                Intrinsics.h(it10, "it");
                this.e.invoke(new ContentPageUiEvent.OnCatalogueCardImpression(it10));
                break;
            case 23:
                VerticalListData verticalListData = (VerticalListData) obj;
                Intrinsics.h(verticalListData, "verticalListData");
                this.e.invoke(new ContentPageUiEvent.OnVerticalListActionClick(verticalListData));
                break;
            case 24:
                au.com.woolworths.feature.shop.contentpage.data.HorizontalListData data2 = (au.com.woolworths.feature.shop.contentpage.data.HorizontalListData) obj;
                Intrinsics.h(data2, "data");
                this.e.invoke(new ContentPageUiEvent.OnHorizontalListActionClick(data2));
                break;
            case 25:
                ProductCard productCardData = (ProductCard) obj;
                Intrinsics.h(productCardData, "productCardData");
                this.e.invoke(new ContentPageUiEvent.OnInStoreAisleClicked(productCardData));
                break;
            case 26:
                this.e.invoke(new ContentPageUiEvent.OnRowClick((ActionData) obj));
                break;
            case 27:
                InsetBanner it11 = (InsetBanner) obj;
                Intrinsics.h(it11, "it");
                this.e.invoke(new ContentPageUiEvent.OnInsetBannerActionClick(it11));
                break;
            case 28:
                EditorialBannerData bannerData = (EditorialBannerData) obj;
                Intrinsics.h(bannerData, "bannerData");
                this.e.invoke(bannerData);
                break;
            default:
                EditorialBannerData bannerData2 = (EditorialBannerData) obj;
                Intrinsics.h(bannerData2, "bannerData");
                this.e.invoke(bannerData2);
                break;
        }
        return Unit.f24250a;
    }
}
