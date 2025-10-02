package au.com.woolworths.design.core.ui.component.experimental.chip;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.ScaffoldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import au.com.woolworths.android.onesite.modules.common.InlineErrorCause;
import au.com.woolworths.android.onesite.modules.insetbanner.ActionPlacement;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.design.core.ui.component.experimental.chip.spec.ChipVariant;
import au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerSpec;
import au.com.woolworths.feature.rewards.offers.detail.composable.OfferDetailsContentLegacyKt;
import au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiScreenKt;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.PromotionCardKt;
import au.com.woolworths.feature.shop.editorder.review.components.CmoReviewContentScreenKt;
import au.com.woolworths.feature.shop.homepage.data.QuickLinkHorizontalListData;
import au.com.woolworths.feature.shop.homepage.presentation.quicklinks.HorizontalQuickLinkListKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapScreenKt;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSection;
import au.com.woolworths.feature.shop.modeselector.ui.ShoppingModeOptionKt;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionAddItemKt;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkContent;
import au.com.woolworths.foundation.rewards.onboarding.ui.ProgressiveCoachMarkKt;
import au.com.woolworths.product.composeui.ProductCardButtonsKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.common.broadcastbanner.BroadcastBannerKt;
import au.com.woolworths.sdui.common.broadcastbanner.model.CoreBroadcastBannerModel;
import au.com.woolworths.sdui.legacy.banner.inlineerrorcause.InlineErrorCauseUiKt;
import au.com.woolworths.sdui.legacy.button.ApiDrivenButtonKt;
import au.com.woolworths.shop.aem.components.model.CatalogueCard;
import au.com.woolworths.shop.aem.components.model.contentcard.FullWidthContentCardData;
import au.com.woolworths.shop.aem.components.model.contentcard.NavRoundelCardData;
import au.com.woolworths.shop.aem.components.model.merchcard.MerchCardData;
import au.com.woolworths.shop.aem.components.model.merchcardfullimage.MerchCardFullImageData;
import au.com.woolworths.shop.aem.components.model.morecard.MoreCardData;
import au.com.woolworths.shop.aem.components.ui.CatalogueCardKt;
import au.com.woolworths.shop.aem.components.ui.contentcard.FullWidthContentCardKt;
import au.com.woolworths.shop.aem.components.ui.contentcard.NavRoundelCardKt;
import au.com.woolworths.shop.aem.components.ui.merchcard.MerchCardKt;
import au.com.woolworths.shop.aem.components.ui.merchcardfullimage.MerchCardFullImageKt;
import au.com.woolworths.shop.aem.components.ui.morecard.MoreCardKt;
import au.com.woolworths.shop.checkout.ui.contactdetails.ContactDetailsContentKt;
import au.com.woolworths.shop.checkout.ui.contactdetails.ContactDetailsContract;
import au.com.woolworths.shop.checkout.ui.summary.rewards.slider.BaseStepSliderKt;
import au.com.woolworths.shop.lists.data.model.ShoppingListWithItems;
import au.com.woolworths.shop.lists.ui.ListTitleRowKt;
import au.com.woolworths.shop.product.details.ui.CountryOfOriginAndHelathInfoKt;
import au.com.woolworths.shop.product.details.ui.ProductDetailsLinkRowKt;
import com.woolworths.shop.product.ui.boost.BoostingAnimationKt;
import com.woolworths.shop.product.ui.boost.BoostingState;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ b(int i, String str, Function2 function2, String str2, Modifier modifier, int i2) {
        this.d = 2;
        this.f = i;
        this.h = str;
        this.i = function2;
        this.j = str2;
        this.e = modifier;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ChipImplKt.a((ImageVector) this.h, (ChipVariant) this.i, (Modifier) this.e, (Color) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            case 1:
                ((Integer) obj2).getClass();
                OfferDetailsContentLegacyKt.a((String) this.h, (RewardsOfferData) this.i, (Function0) this.j, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            case 2:
                ((Integer) obj2).getClass();
                InstoreWifiScreenKt.d(this.f, (String) this.h, (Function2) this.i, (String) this.j, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                PromotionCardKt.a((ProductCard) this.h, (SharedIntrinsicHeightState) this.i, (Function1) this.j, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            case 4:
                ((Integer) obj2).getClass();
                CmoReviewContentScreenKt.f((String) this.h, (String) this.i, (String) this.e, (String) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            case 5:
                ((Integer) obj2).getClass();
                HorizontalQuickLinkListKt.b((QuickLinkHorizontalListData) this.h, (Function1) this.i, (Function1) this.j, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            case 6:
                ((Integer) obj2).getClass();
                InstoreMapScreenKt.c((InstoreMapCallbacks) this.h, (InstoreMapContract.ViewState) this.i, (ScaffoldState) this.j, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            case 7:
                ((Integer) obj2).getClass();
                ShoppingModeOptionKt.a((ShoppingModeSection.ShoppingModeSelectorOptionsSection) this.h, (Function1) this.i, (Function2) this.j, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            case 8:
                ((Integer) obj2).getClass();
                SectionOptionAddItemKt.a((String) this.h, (Modifier) this.e, (Function2) this.i, (Function0) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            case 9:
                ((Integer) obj2).getClass();
                ProgressiveCoachMarkKt.a((ProgressiveCoachMarkContent) this.h, (Function0) this.i, (Function1) this.j, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            case 10:
                ((Integer) obj2).getClass();
                ProductCardButtonsKt.f((Function0) this.h, (String) this.i, (Modifier) this.e, (Integer) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            case 11:
                ((Integer) obj2).getClass();
                BroadcastBannerKt.a((CoreBroadcastBannerModel) this.h, (Modifier) this.e, (Function0) this.i, (BroadcastBannerSpec.Action) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            case 12:
                ((Integer) obj2).getClass();
                InlineErrorCauseUiKt.a((InlineErrorCause) this.h, (Modifier) this.e, (ActionPlacement) this.i, (Function0) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            case 13:
                ((Integer) obj2).getClass();
                ApiDrivenButtonKt.a((ButtonApiData) this.h, (Function1) this.i, (Modifier) this.e, (PaddingValues) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            case 14:
                ((Integer) obj2).getClass();
                CatalogueCardKt.a((CatalogueCard) this.h, (Function1) this.i, (Modifier) this.e, (Function1) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            case 15:
                ((Integer) obj2).getClass();
                FullWidthContentCardKt.a((Orientation) this.h, (FullWidthContentCardData) this.i, (Function1) this.j, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            case 16:
                ((Integer) obj2).getClass();
                NavRoundelCardKt.a((NavRoundelCardData) this.h, (Function1) this.i, (ContentScale) this.j, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            case 17:
                ((Integer) obj2).getClass();
                MerchCardKt.b((MerchCardData) this.h, (Function1) this.i, (Function1) this.j, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            case 18:
                ((Integer) obj2).getClass();
                MerchCardFullImageKt.a((MerchCardFullImageData) this.h, (Function1) this.i, (SharedIntrinsicHeightState) this.j, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            case 19:
                ((Integer) obj2).getClass();
                MoreCardKt.a((MoreCardData) this.h, (String) this.i, (Function1) this.j, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            case 20:
                ((Integer) obj2).getClass();
                ContactDetailsContentKt.a((ContactDetailsContract.ViewState) this.h, (Function1) this.i, (Function0) this.j, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            case 21:
                ((Integer) obj2).getClass();
                BaseStepSliderKt.a((ArrayList) this.h, (Modifier) this.e, this.f, (Function1) this.i, (Function0) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                ListTitleRowKt.a((ShoppingListWithItems) this.h, (Modifier) this.e, (String) this.i, (Function3) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            case 23:
                ((Integer) obj2).getClass();
                CountryOfOriginAndHelathInfoKt.a((String) this.h, (String) this.i, (String) this.j, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            case 24:
                ((Integer) obj2).getClass();
                ProductDetailsLinkRowKt.a((String) this.h, (IconAsset) this.i, (String) this.e, (Function0) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                BoostingAnimationKt.b((Modifier) this.e, (BoostingState) this.h, (Function0) this.i, (String) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ b(Modifier modifier, BoostingState boostingState, Function0 function0, String str, int i, int i2) {
        this.d = 25;
        this.e = modifier;
        this.h = boostingState;
        this.i = function0;
        this.j = str;
        this.f = i;
        this.g = i2;
    }

    public /* synthetic */ b(Object obj, Modifier modifier, Object obj2, Object obj3, int i, int i2, int i3) {
        this.d = i3;
        this.h = obj;
        this.e = modifier;
        this.i = obj2;
        this.j = obj3;
        this.f = i;
        this.g = i2;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Modifier modifier, int i, int i2, int i3) {
        this.d = i3;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
        this.e = modifier;
        this.f = i;
        this.g = i2;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3) {
        this.d = i3;
        this.h = obj;
        this.i = obj2;
        this.e = obj3;
        this.j = obj4;
        this.f = i;
        this.g = i2;
    }

    public /* synthetic */ b(ArrayList arrayList, Modifier modifier, int i, Function1 function1, Function0 function0, int i2) {
        this.d = 21;
        this.h = arrayList;
        this.e = modifier;
        this.f = i;
        this.i = function1;
        this.j = function0;
        this.g = i2;
    }
}
