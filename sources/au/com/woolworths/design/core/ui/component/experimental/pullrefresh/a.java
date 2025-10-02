package au.com.woolworths.design.core.ui.component.experimental.pullrefresh;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec;
import au.com.woolworths.design.core.ui.component.stable.button.SecondaryButtonKt;
import au.com.woolworths.feature.product.list.ComposeProductListCallbacks;
import au.com.woolworths.feature.product.list.compose.productfinder.ProductFinderTopBarKt;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContentKt;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContract;
import au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.data.RewardsSecurePreference;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.SecurePreferenceUIKt;
import au.com.woolworths.feature.shop.catalogue.listing.category.ui.ProductCardKt;
import au.com.woolworths.feature.shop.countryselector.ui.ConfirmDialogKt;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionGooglePayItemKt;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsFooter;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdBottomSheet;
import au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdBottomSheetUiKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.shop.cart.ui.cart.CartScreenKt;
import au.com.woolworths.shop.deliveryunlimited.signup.domain.model.DeliveryUnlimitedPaymentResponse;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContentKt;
import au.com.woolworths.shop.lists.ui.shoppinglist.compose.ComposableSingletons$ListDetailsEmptyUiKt;
import au.com.woolworths.shop.lists.ui.substitutions.SelectAlternativeOptionsBottomSheetContentKt;
import au.com.woolworths.shop.product.details.ui.ProductDetailsScreenKt;
import au.com.woolworths.shop.ratingsandreviews.ui.reviewitem.ReviewItemRecommendationKt;
import au.com.woolworths.shop.rewards.priming.ui.PrimingFooterUiKt;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ a(int i, int i2, Object obj, Object obj2, Object obj3, boolean z) {
        this.d = i2;
        this.e = obj;
        this.h = obj2;
        this.i = obj3;
        this.f = z;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        int i2 = this.g;
        Unit unit = Unit.f24250a;
        Object obj3 = this.h;
        Object obj4 = this.i;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj4;
                Composer composer = (Composer) obj;
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(i2 | 1);
                PullRefreshBoxKt.a(iA, composer, composableLambdaImpl, (Modifier) obj3, (Function0) obj5, this.f);
                break;
            case 1:
                ComposableLambdaImpl composableLambdaImpl2 = ComposableSingletons$ListDetailsEmptyUiKt.f12373a;
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(i2 | 1);
                SecondaryButtonKt.b((String) obj3, (Function0) obj5, this.f, (ButtonSpec.Size) obj4, (Composer) obj, iA2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iA3 = RecomposeScopeImplKt.a(i2 | 1);
                ProductFinderTopBarKt.a((String) obj5, (String) obj3, this.f, (ComposeProductListCallbacks) obj4, (Composer) obj, iA3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iA4 = RecomposeScopeImplKt.a(i2 | 1);
                au.com.woolworths.feature.product.list.legacy.compose.productfinder.ProductFinderTopBarKt.a((String) obj5, (String) obj3, this.f, (au.com.woolworths.feature.product.list.legacy.ComposeProductListCallbacks) obj4, (Composer) obj, iA4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iA5 = RecomposeScopeImplKt.a(i2 | 1);
                RewardsPreferenceDetailsContentKt.e((List) obj5, (Function2) obj3, (Function1) obj4, this.f, (Composer) obj, iA5);
                break;
            case 5:
                ((Integer) obj2).intValue();
                int iA6 = RecomposeScopeImplKt.a(i2 | 1);
                RewardsPreferenceDetailsContentKt.b((RewardsPreferenceDetailsContract.ViewState.Error) obj3, (Function0) obj5, (Function0) obj4, this.f, (Composer) obj, iA6);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iA7 = RecomposeScopeImplKt.a(i2 | 1);
                OfferDetailsScreenKt.d((OfferDetailsFooter) obj3, this.f, (Function0) obj5, (Function1) obj4, (Composer) obj, iA7);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int iA8 = RecomposeScopeImplKt.a(i2 | 1);
                SecurePreferenceUIKt.b((RewardsSecurePreference) obj5, this.f, (Function1) obj4, (Modifier) obj3, (Composer) obj, iA8);
                break;
            case 8:
                ((Integer) obj2).intValue();
                int iA9 = RecomposeScopeImplKt.a(i2 | 1);
                ProductCardKt.a((ProductCard) obj5, (ProductClickListener) obj3, (SharedIntrinsicHeightState) obj4, this.f, (Composer) obj, iA9);
                break;
            case 9:
                ((Integer) obj2).intValue();
                int iA10 = RecomposeScopeImplKt.a(i2 | 1);
                ConfirmDialogKt.a((Region) obj3, this.f, (Function0) obj5, (Function0) obj4, (Composer) obj, iA10);
                break;
            case 10:
                ((Integer) obj2).getClass();
                int iA11 = RecomposeScopeImplKt.a(i2 | 1);
                SectionOptionGooglePayItemKt.a((PaymentMethodItem.GooglePay) obj5, this.f, (Function1) obj4, (Modifier) obj3, (Composer) obj, iA11);
                break;
            case 11:
                ((Integer) obj2).getClass();
                int iA12 = RecomposeScopeImplKt.a(i2 | 1);
                VideoAdBottomSheetUiKt.b((VideoAdBottomSheet) obj4, this.f, (Function0) obj5, (Modifier) obj3, (Composer) obj, iA12);
                break;
            case 12:
                ((Integer) obj2).getClass();
                int iA13 = RecomposeScopeImplKt.a(1);
                CartScreenKt.c((Function0) obj5, this.f, (String) obj3, (Function0) obj4, (Composer) obj, iA13, this.g);
                break;
            case 13:
                ((Integer) obj2).getClass();
                int iA14 = RecomposeScopeImplKt.a(i2 | 1);
                PaymentContentKt.e((DeliveryUnlimitedPaymentResponse) obj4, this.f, (Function0) obj5, (Modifier) obj3, (Composer) obj, iA14);
                break;
            case 14:
                ((Integer) obj2).getClass();
                int iA15 = RecomposeScopeImplKt.a(i2 | 1);
                SelectAlternativeOptionsBottomSheetContentKt.c((Function0) obj5, (Function0) obj3, (Function0) obj4, this.f, (Composer) obj, iA15);
                break;
            case 15:
                ((Integer) obj2).intValue();
                int iA16 = RecomposeScopeImplKt.a(i2 | 1);
                ProductDetailsScreenKt.m((PromotionInfo) obj5, (RewardsOfferInfo) obj3, (List) obj4, this.f, (Composer) obj, iA16);
                break;
            case 16:
                ((Integer) obj2).getClass();
                int iA17 = RecomposeScopeImplKt.a(i2 | 1);
                ReviewItemRecommendationKt.a((String) obj5, (String) obj4, this.f, (Modifier) obj3, (Composer) obj, iA17);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA18 = RecomposeScopeImplKt.a(i2 | 1);
                PrimingFooterUiKt.a((Function0) obj5, (Function0) obj4, this.f, (Modifier) obj3, (Composer) obj, iA18);
                break;
        }
        return unit;
    }

    public /* synthetic */ a(int i, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Function0 function0, boolean z) {
        this.d = 0;
        this.f = z;
        this.e = function0;
        this.h = modifier;
        this.i = composableLambdaImpl;
        this.g = i;
    }

    public /* synthetic */ a(RewardsPreferenceDetailsContract.ViewState.Error error, Function0 function0, Function0 function02, boolean z, int i) {
        this.d = 5;
        this.h = error;
        this.e = function0;
        this.i = function02;
        this.f = z;
        this.g = i;
    }

    public /* synthetic */ a(Object obj, Object obj2, boolean z, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.e = obj;
        this.i = obj2;
        this.f = z;
        this.h = modifier;
        this.g = i;
    }

    public /* synthetic */ a(Object obj, boolean z, Function0 function0, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.i = obj;
        this.f = z;
        this.e = function0;
        this.h = modifier;
        this.g = i;
    }

    public /* synthetic */ a(Object obj, boolean z, Function0 function0, Function function, int i, int i2) {
        this.d = i2;
        this.h = obj;
        this.f = z;
        this.e = function0;
        this.i = function;
        this.g = i;
    }

    public /* synthetic */ a(Object obj, boolean z, Function1 function1, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.e = obj;
        this.f = z;
        this.i = function1;
        this.h = modifier;
        this.g = i;
    }

    public /* synthetic */ a(String str, String str2, boolean z, Object obj, int i, int i2) {
        this.d = i2;
        this.e = str;
        this.h = str2;
        this.f = z;
        this.i = obj;
        this.g = i;
    }

    public /* synthetic */ a(String str, Function0 function0, boolean z, ButtonSpec.Size size, int i) {
        this.d = 1;
        ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$ListDetailsEmptyUiKt.f12373a;
        this.h = str;
        this.e = function0;
        this.f = z;
        this.i = size;
        this.g = i;
    }

    public /* synthetic */ a(Function0 function0, boolean z, String str, Function0 function02, int i, int i2) {
        this.d = 12;
        this.e = function0;
        this.f = z;
        this.h = str;
        this.i = function02;
        this.g = i2;
    }
}
