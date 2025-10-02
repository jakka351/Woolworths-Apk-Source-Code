package au.com.woolworths.feature.shop.healthylifefoodtracker.ui;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.base.shopapp.modules.text.ParagraphTextApiData;
import au.com.woolworths.feature.shop.homepage.data.FulfilmentStatusBannerData;
import au.com.woolworths.feature.shop.homepage.data.HomeOnlineShoppingModeVariantTileData;
import au.com.woolworths.feature.shop.homepage.data.MarketplaceCard;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment;
import au.com.woolworths.feature.shop.homepage.presentation.fulfilmentstatusbanner.FulfilmentStatusBannerKt;
import au.com.woolworths.feature.shop.homepage.presentation.marketplace.MarketplaceCardTileKt;
import au.com.woolworths.feature.shop.homepage.presentation.modeselector.ModeSelectorSubHeaderKt;
import au.com.woolworths.feature.shop.homepage.presentation.order.OrderCardUIKt;
import au.com.woolworths.feature.shop.inbox.domain.NotificationSection;
import au.com.woolworths.feature.shop.inbox.ui.MessageSectionHeaderKt;
import au.com.woolworths.feature.shop.inbox.ui.component.CategoryTagKt;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientError;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapScreenKt;
import au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderCallbacks;
import au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderContract;
import au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderScreenKt;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceCategories;
import au.com.woolworths.feature.shop.marketplace.ui.categories.MarketplaceCategoriesListener;
import au.com.woolworths.feature.shop.marketplace.ui.categories.MarketplaceCategoriesScreenKt;
import au.com.woolworths.feature.shop.marketplace.ui.facet.ErrorScreenKt;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState;
import au.com.woolworths.feature.shop.modeselector.model.IconTextBanner;
import au.com.woolworths.feature.shop.modeselector.ui.FeaturesSectionKt;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesFilterGroupItem;
import au.com.woolworths.feature.shop.myorders.details.models.EditOrderWarning;
import au.com.woolworths.feature.shop.myorders.details.models.OrderPaymentDetailsData;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.YourGroceriesFilterRowKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.YourGroceriesPaymentSummaryScreenKt;
import au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionScreenKt;
import au.com.woolworths.feature.shop.storelocator.details.StoreDetailsContract;
import au.com.woolworths.feature.shop.storelocator.details.StoreDetailsScreenKt;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsContract;
import au.com.woolworths.feature.shop.voc.score.VocContract;
import au.com.woolworths.feature.shop.voc.score.VocSurveyCardKt;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionExpiredCreditCardItemKt;
import au.com.woolworths.foundation.appcomms.inbox.client.model.InboxMessage;
import au.com.woolworths.foundation.rewards.common.ui.iconasset.IconAssetUiKt;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchError;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchState;
import au.com.woolworths.foundation.shop.olive.voice.ui.search.ContentStateKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.search.OliveStateKt;
import au.com.woolworths.foundation.shop.prompt.handler.data.PromptBottomSheet;
import au.com.woolworths.foundation.shop.prompt.handler.ui.BottomSheetPromptContentKt;
import au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdPlayerKt;
import au.com.woolworths.promotion.banner.ui.PromotionBanner;
import au.com.woolworths.rewards.base.data.IconAsset;
import au.com.woolworths.shop.aem.components.model.contentcard.FullWidthImageCardData;
import au.com.woolworths.shop.aem.components.model.editorialbanner.EditorialBannerData;
import au.com.woolworths.shop.aem.components.ui.contentcard.FullWidthImageCardKt;
import au.com.woolworths.shop.aem.components.ui.editorialbanner.EditorialBannerKt;
import au.com.woolworths.shop.cart.ui.cart.CartPromotionBannerKt;
import au.com.woolworths.shop.checkout.domain.model.ContactDetails;
import au.com.woolworths.shop.checkout.domain.model.PackagingMethodOption;
import au.com.woolworths.shop.checkout.ui.components.compose.PackagingMethodOptionItemKt;
import au.com.woolworths.shop.checkout.ui.details.ContactDetailsUiKt;
import coil3.request.ImageRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ h(EditorialBannerData editorialBannerData, Function1 function1, int i) {
        this.d = 26;
        this.f = editorialBannerData;
        this.g = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ParagraphTextKt.a((ParagraphTextApiData) this.f, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((HomePageFragment) this.f).Q1(RecomposeScopeImplKt.a(this.e | 1), (Composer) obj, this.g);
                break;
            case 2:
                ((Integer) obj2).getClass();
                FulfilmentStatusBannerKt.a((FulfilmentStatusBannerData) this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                MarketplaceCardTileKt.a((MarketplaceCard) this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                ModeSelectorSubHeaderKt.b((HomeOnlineShoppingModeVariantTileData) this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                OrderCardUIKt.a((FulfilmentStatusBannerData) this.f, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                MessageSectionHeaderKt.a((NotificationSection) this.f, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                CategoryTagKt.a((InboxMessage.Category) this.f, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                InstoreMapScreenKt.a((OriientError) this.f, (InstoreMapCallbacks) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ProductFinderScreenKt.c((ProductFinderContract.ViewState) this.f, (ProductFinderCallbacks) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                MarketplaceCategoriesScreenKt.b((MarketplaceCategories) this.f, (MarketplaceCategoriesListener) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                ErrorScreenKt.a((MarketplaceErrorState) this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                FeaturesSectionKt.a((IconTextBanner) this.f, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                YourGroceriesFilterRowKt.a((YourGroceriesFilterGroupItem) this.f, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                YourGroceriesPaymentSummaryScreenKt.d((OrderPaymentDetailsData) this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 15:
                ((Integer) obj2).intValue();
                EditOrderConditionScreenKt.a((EditOrderWarning) this.f, (PaddingValues) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                StoreDetailsScreenKt.k((StoreDetailsContract.ViewState) this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsScreenKt.k((StoreDetailsContract.ViewState) this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 18:
                ((Integer) obj2).intValue();
                VocSurveyCardKt.b((VocContract.ViewState) this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                SectionOptionExpiredCreditCardItemKt.a((PaymentMethodItem.CreditCard.Expired) this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                IconAssetUiKt.a((IconAsset.HostedIcon) this.f, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                ContentStateKt.c((VoiceSearchError) this.f, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                OliveStateKt.e((VoiceSearchState) this.f, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                BottomSheetPromptContentKt.a((PromptBottomSheet) this.f, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                VideoAdPlayerKt.d((ImageRequest) this.f, (String) this.g, (Composer) obj, RecomposeScopeImplKt.a(1), this.e);
                break;
            case 25:
                ((Integer) obj2).getClass();
                FullWidthImageCardKt.a((FullWidthImageCardData) this.f, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                EditorialBannerKt.f((EditorialBannerData) this.f, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                CartPromotionBannerKt.a((PromotionBanner) this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                PackagingMethodOptionItemKt.a((PackagingMethodOption) this.f, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ContactDetailsUiKt.a((ContactDetails) this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ h(ImageRequest imageRequest, String str, int i, int i2) {
        this.d = 24;
        this.f = imageRequest;
        this.g = str;
        this.e = i2;
    }

    public /* synthetic */ h(Object obj, int i, int i2, Object obj2) {
        this.d = i2;
        this.f = obj;
        this.g = obj2;
        this.e = i;
    }
}
