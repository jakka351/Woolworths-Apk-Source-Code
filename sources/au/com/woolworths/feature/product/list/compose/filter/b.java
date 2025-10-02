package au.com.woolworths.feature.product.list.compose.filter;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.modules.common.InlineErrorCause;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.base.rewards.account.data.PreferenceToggleData;
import au.com.woolworths.feature.product.list.ProductsDisplayMode;
import au.com.woolworths.feature.rewards.account.closeaccount.ui.CheckBoxUiKt;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContentKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui.TimelineBreakdownUiKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.OnboardingScreenKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.finalglance.EverydayExtrasFinalGlanceContentItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasSubscribeFooter;
import au.com.woolworths.feature.shop.countryselector.ui.CountrySelectorUiKt;
import au.com.woolworths.feature.shop.homepage.data.HomeFulfilmentWindowTileData;
import au.com.woolworths.feature.shop.homepage.presentation.modeselector.ModeSelectorSubHeaderKt;
import au.com.woolworths.feature.shop.instore.navigation.map.data.Floor;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.FloorSelectorKt;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesProductItem;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.YourGroceriesProductItemKt;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.foundation.shop.olive.voice.ui.onboarding.OliveVoiceOnboardingScreenKt;
import au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdPlayerFunctionsKt;
import au.com.woolworths.product.composeui.LowestMarketPriceDescriptionKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.sdui.legacy.banner.InlineErrorDesign;
import au.com.woolworths.sdui.legacy.banner.InsetBannerUiKt;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAndDiscount;
import au.com.woolworths.shop.checkout.ui.components.compose.CheckoutPromoCodeUiKt;
import au.com.woolworths.shop.checkout.ui.components.compose.CheckoutRewardsUiKt;
import au.com.woolworths.shop.checkout.ui.components.compose.CheckoutStoreCreditUiKt;
import au.com.woolworths.shop.checkout.ui.substitution.component.CheaperSubtitutesBannerKt;
import au.com.woolworths.shop.checkout.ui.timeselector.compose.TimeSelectorFooterKt;
import au.com.woolworths.shop.lists.ui.shoppinglist.compose.ListDetailsEmptyUiKt;
import com.halilibo.richtext.ui.CodeBlock_androidKt;
import com.halilibo.richtext.ui.RichTextScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ b(Object obj, Object obj2, boolean z, int i, int i2) {
        this.d = i2;
        this.h = obj;
        this.f = obj2;
        this.e = z;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(this.g | 1);
                DisplayModeItemKt.a((ProductsDisplayMode) this.h, this.e, (Function1) this.f, (Composer) obj, iA);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(this.g | 1);
                au.com.woolworths.feature.product.list.legacy.compose.filter.DisplayModeItemKt.a((au.com.woolworths.feature.product.list.legacy.ProductsDisplayMode) this.h, this.e, (Function1) this.f, (Composer) obj, iA2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iA3 = RecomposeScopeImplKt.a(this.g | 1);
                CheckBoxUiKt.a((String) this.h, this.e, (Function1) this.f, (Composer) obj, iA3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iA4 = RecomposeScopeImplKt.a(this.g | 1);
                RewardsPreferenceDetailsContentKt.j((PreferenceToggleData) this.h, this.e, (Function2) this.f, (Composer) obj, iA4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iA5 = RecomposeScopeImplKt.a(this.g | 1);
                TimelineBreakdownUiKt.b((EverydayExtrasFinalGlanceContentItem.TimelineBreakdownItem) this.h, this.e, (Modifier) this.f, (Composer) obj, iA5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iA6 = RecomposeScopeImplKt.a(this.g | 1);
                OnboardingScreenKt.a((EverydayExtrasSubscribeFooter) this.h, this.e, (Function1) this.f, (Composer) obj, iA6);
                break;
            case 6:
                ((Integer) obj2).intValue();
                int iA7 = RecomposeScopeImplKt.a(this.g | 1);
                CountrySelectorUiKt.a((Region) this.h, this.e, (Function1) this.f, (Composer) obj, iA7);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int iA8 = RecomposeScopeImplKt.a(this.g | 1);
                ModeSelectorSubHeaderKt.c((HomeFulfilmentWindowTileData) this.h, this.e, (Modifier) this.f, (Composer) obj, iA8);
                break;
            case 8:
                ((Integer) obj2).getClass();
                int iA9 = RecomposeScopeImplKt.a(this.g | 1);
                FloorSelectorKt.b((Floor) this.h, this.e, (Function0) this.f, (Composer) obj, iA9);
                break;
            case 9:
                ((Integer) obj2).getClass();
                int iA10 = RecomposeScopeImplKt.a(this.g | 1);
                YourGroceriesProductItemKt.b((YourGroceriesProductItem) this.h, (Function1) this.f, this.e, (Composer) obj, iA10);
                break;
            case 10:
                ((Integer) obj2).intValue();
                int iA11 = RecomposeScopeImplKt.a(this.g | 1);
                OliveVoiceOnboardingScreenKt.b((PaddingValues) this.h, (Function0) this.f, this.e, (Composer) obj, iA11);
                break;
            case 11:
                ((Integer) obj2).getClass();
                int iA12 = RecomposeScopeImplKt.a(this.g | 1);
                VideoAdPlayerFunctionsKt.a(this.e, (Function1) this.f, (Modifier) this.h, (Composer) obj, iA12);
                break;
            case 12:
                ((Integer) obj2).getClass();
                int iA13 = RecomposeScopeImplKt.a(this.g | 1);
                LowestMarketPriceDescriptionKt.b((ProductCard) this.h, this.e, (Modifier) this.f, (Composer) obj, iA13);
                break;
            case 13:
                ((Integer) obj2).getClass();
                int iA14 = RecomposeScopeImplKt.a(this.g | 1);
                InsetBannerUiKt.a((InlineErrorCause.IconConfig) this.h, (InlineErrorDesign) this.f, this.e, (Composer) obj, iA14);
                break;
            case 14:
                ((Integer) obj2).getClass();
                int iA15 = RecomposeScopeImplKt.a(this.g | 1);
                CheckoutPromoCodeUiKt.a((CheckoutRewardsAndDiscount.PromoCode) this.h, this.e, (Function0) this.f, (Composer) obj, iA15);
                break;
            case 15:
                ((Integer) obj2).getClass();
                int iA16 = RecomposeScopeImplKt.a(this.g | 1);
                CheckoutRewardsUiKt.a((CheckoutRewardsAndDiscount.CheckoutRewards) this.h, this.e, (Function0) this.f, (Composer) obj, iA16);
                break;
            case 16:
                ((Integer) obj2).getClass();
                int iA17 = RecomposeScopeImplKt.a(this.g | 1);
                CheckoutStoreCreditUiKt.a((CheckoutRewardsAndDiscount.StoreCredit) this.h, this.e, (Function0) this.f, (Composer) obj, iA17);
                break;
            case 17:
                ((Integer) obj2).intValue();
                int iA18 = RecomposeScopeImplKt.a(this.g | 1);
                CheaperSubtitutesBannerKt.a((BroadcastBannerData) this.h, this.e, (Function1) this.f, (Composer) obj, iA18);
                break;
            case 18:
                ((Integer) obj2).getClass();
                int iA19 = RecomposeScopeImplKt.a(385);
                TimeSelectorFooterKt.c(this.e, (Modifier) this.h, (ComposableLambdaImpl) this.f, (Composer) obj, iA19, this.g);
                break;
            case 19:
                ((Integer) obj2).intValue();
                int iA20 = RecomposeScopeImplKt.a(this.g | 1);
                ListDetailsEmptyUiKt.b(this.e, (Function1) this.f, (Function0) this.h, (Composer) obj, iA20);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA21 = RecomposeScopeImplKt.a(this.g | 1);
                CodeBlock_androidKt.a((RichTextScope) this.h, this.e, (ComposableLambdaImpl) this.f, (Composer) obj, iA21);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ b(Object obj, boolean z, Object obj2, int i, int i2) {
        this.d = i2;
        this.h = obj;
        this.e = z;
        this.f = obj2;
        this.g = i;
    }

    public /* synthetic */ b(boolean z, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.d = 18;
        this.e = z;
        this.h = modifier;
        this.f = composableLambdaImpl;
        this.g = i2;
    }

    public /* synthetic */ b(boolean z, Function1 function1, Object obj, int i, int i2) {
        this.d = i2;
        this.e = z;
        this.f = function1;
        this.h = obj;
        this.g = i;
    }
}
