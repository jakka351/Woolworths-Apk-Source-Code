package au.com.woolworths.design.core.ui.component.experimental.tag;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.appdata.AppEnvironment;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetState;
import au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec;
import au.com.woolworths.feature.product.list.compose.AlternativeProductsPageKt;
import au.com.woolworths.feature.product.list.data.IngredientCardApiData;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationContractNew;
import au.com.woolworths.feature.rewards.account.authentication.ui.RewardsSignUpScreenKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.InnerContentAccessibilityKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasLandingFeed;
import au.com.woolworths.feature.rewards.offers.points.ui.RewardsErrorDialogUiKt;
import au.com.woolworths.feature.shop.bundles.data.BundleQuantityStepper;
import au.com.woolworths.feature.shop.bundles.ui.BundleAddToCartUiKt;
import au.com.woolworths.feature.shop.homepage.presentation.carousel.ProductCardsLazyRowUiKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.OrderProofOfDeliveryDetailsItemKt;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.GiftCardItem;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentFlowTypeData;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardModalKt;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardViewModel;
import au.com.woolworths.feature.shop.wpay.ui.wpay.ModalBottomSheetData;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContentKt;
import au.com.woolworths.foundation.rewards.common.ui.TigerBannerKt;
import au.com.woolworths.foundation.rewards.common.ui.TigerBannerStatus;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage;
import au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBannerData;
import au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBoostState;
import au.com.woolworths.foundation.shop.nhp.ui.edr.EdrOfferBannerKt;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdData;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdPlayerState;
import au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdPlayerKt;
import au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdUnitKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.shop.cart.domain.model.OfferProductList;
import au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferSuccessScreenKt;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.ui.TwoButtonDialogKt;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ d(int i, BundleQuantityStepper bundleQuantityStepper, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i2) {
        this.d = 6;
        this.e = i;
        this.f = bundleQuantityStepper;
        this.g = function0;
        this.h = function02;
        this.i = function03;
        this.j = function04;
        this.k = function05;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                TagKt.a((String) this.f, (TagColorPalette) this.g, (Modifier) this.h, (TagSpec.Size) this.i, (TagSpec.Image) this.j, (TagSpec.IconPosition) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                AlternativeProductsPageKt.a((IngredientCardApiData) this.f, (ProductCardConfig) this.g, (LazyGridState) this.h, (Function1) this.i, (Function2) this.j, (Function1) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                au.com.woolworths.feature.product.list.legacy.compose.AlternativeProductsPageKt.a((au.com.woolworths.feature.product.list.legacy.data.IngredientCardApiData) this.f, (ProductCardConfig) this.g, (LazyGridState) this.h, (Function1) this.i, (Function2) this.j, (Function1) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                RewardsSignUpScreenKt.b((RewardsAuthenticationContractNew.ViewState) this.f, (AppEnvironment) this.g, (Function0) this.h, (Function0) this.i, (Function0) this.j, (Function1) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                InnerContentAccessibilityKt.a((EverydayExtrasLandingFeed) this.f, (RewardsServiceMessage) this.g, (Function0) this.i, (Function1) this.j, (Function1) this.k, (Modifier) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                RewardsErrorDialogUiKt.b((String) this.f, (String) this.g, (ContentCta) this.h, (ContentCta) this.i, (Function1) this.j, (Function0) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                BundleAddToCartUiKt.a(this.e, (BundleQuantityStepper) this.f, (Function0) this.g, (Function0) this.h, (Function0) this.i, (Function0) this.j, (Function0) this.k, (Composer) obj, iA);
                break;
            case 7:
                ((Integer) obj2).intValue();
                ProductCardsLazyRowUiKt.a((List) this.g, (String) this.f, (LazyListState) this.h, (ProductClickListener) this.i, (ProductCardConfig) this.j, (List) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                OrderProofOfDeliveryDetailsItemKt.a((String) this.f, (String) this.g, (InsetBannerData) this.h, (Function0) this.i, (Function0) this.j, (Function0) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                AddCreditCardModalKt.a((ModalBottomSheetData.AddCreditCard) this.f, (SheetState) this.g, (Function1) this.i, (PaymentFlowTypeData) this.j, (Modifier) this.h, (AddCreditCardViewModel) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                WPayForOrderContentKt.f((GiftCardItem) this.f, (Map) this.g, (Map) this.i, (Map) this.j, (Function1) this.k, (Modifier) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                TigerBannerKt.c((TigerBannerStatus) this.g, (String) this.f, (String) this.i, (String) this.j, (Modifier) this.h, (Function0) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                EdrOfferBannerKt.a((EdrOfferBannerData) this.f, (EdrOfferBoostState) this.g, (Function1) this.i, (Function1) this.j, (Function1) this.k, (Modifier) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                VideoAdPlayerKt.b((VideoAdData) this.f, (VideoAdPlayerState) this.g, (Function1) this.i, (Function0) this.j, (Function1) this.k, (Modifier) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                VideoAdUnitKt.c((VideoAdData) this.f, (VideoAdPlayerState) this.g, (Function1) this.i, (Function1) this.j, (Function1) this.k, (Modifier) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 15:
                ((Integer) obj2).intValue();
                QuickAddOfferSuccessScreenKt.e((ProductCard) this.f, (Map) this.g, (Function0) this.h, (Function0) this.i, (Function0) this.j, (Function0) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 16:
                ((Integer) obj2).intValue();
                QuickAddOfferSuccessScreenKt.b((OfferProductList.Success) this.f, (Map) this.g, (Function1) this.h, (Function1) this.i, (Function1) this.j, (Function1) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                TwoButtonDialogKt.a((Text) this.f, (ResText) this.g, (ResText) this.h, (Function0) this.i, (Text) this.j, (Function0) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ d(ModalBottomSheetData.AddCreditCard addCreditCard, SheetState sheetState, Function1 function1, PaymentFlowTypeData paymentFlowTypeData, Modifier modifier, AddCreditCardViewModel addCreditCardViewModel, int i) {
        this.d = 9;
        this.f = addCreditCard;
        this.g = sheetState;
        this.i = function1;
        this.j = paymentFlowTypeData;
        this.h = modifier;
        this.k = addCreditCardViewModel;
        this.e = i;
    }

    public /* synthetic */ d(TigerBannerStatus tigerBannerStatus, String str, String str2, String str3, Modifier modifier, Function0 function0, int i) {
        this.d = 11;
        this.g = tigerBannerStatus;
        this.f = str;
        this.i = str2;
        this.j = str3;
        this.h = modifier;
        this.k = function0;
        this.e = i;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        this.d = i2;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
        this.j = obj5;
        this.k = obj6;
        this.e = i;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Function1 function1, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.f = obj;
        this.g = obj2;
        this.i = obj3;
        this.j = obj4;
        this.k = function1;
        this.h = modifier;
        this.e = i;
    }

    public /* synthetic */ d(String str, String str2, ContentCta contentCta, ContentCta contentCta2, Function1 function1, Function0 function0, int i) {
        this.d = 5;
        this.f = str;
        this.g = str2;
        this.h = contentCta;
        this.i = contentCta2;
        this.j = function1;
        this.k = function0;
        this.e = i;
    }

    public /* synthetic */ d(List list, String str, LazyListState lazyListState, ProductClickListener productClickListener, ProductCardConfig productCardConfig, List list2, int i) {
        this.d = 7;
        this.g = list;
        this.f = str;
        this.h = lazyListState;
        this.i = productClickListener;
        this.j = productCardConfig;
        this.k = list2;
        this.e = i;
    }
}
