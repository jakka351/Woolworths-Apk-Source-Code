package androidx.lifecycle.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.LifecycleOwner;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.base.wallet.data.PrivacyPolicyContent;
import au.com.woolworths.base.wallet.termsandconditions.WalletTermsAndConditionsKt;
import au.com.woolworths.design.core.ui.component.experimental.coachmark.CoachMarkKt;
import au.com.woolworths.design.core.ui.component.experimental.coachmark.CoachMarkPopupDirection;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertKt;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle;
import au.com.woolworths.design.core.ui.component.stable.corerow.impl.CoreRowImplKt;
import au.com.woolworths.dynamic.page.data.CampaignCardCarouselData;
import au.com.woolworths.dynamic.page.data.CampaignCardData;
import au.com.woolworths.dynamic.page.data.CampaignCardListData;
import au.com.woolworths.dynamic.page.data.CategoryTileListData;
import au.com.woolworths.dynamic.page.data.ContentListData;
import au.com.woolworths.dynamic.page.data.ContentListItemData;
import au.com.woolworths.dynamic.page.data.DynamicPageFooterData;
import au.com.woolworths.dynamic.page.data.QuickLinkListData;
import au.com.woolworths.dynamic.page.ui.content.CardCarouselUiKt;
import au.com.woolworths.dynamic.page.ui.content.CardListUiKt;
import au.com.woolworths.dynamic.page.ui.content.CategoryTileListUiKt;
import au.com.woolworths.dynamic.page.ui.content.ContentListUiKt;
import au.com.woolworths.dynamic.page.ui.content.QuickLinkListUiKt;
import au.com.woolworths.dynamic.page.ui.content.ScreenContentKt;
import au.com.woolworths.feature.product.list.ProductListFragment;
import au.com.woolworths.feature.product.list.ProductListOptionsContract;
import au.com.woolworths.feature.product.list.ProductListViewModel;
import au.com.woolworths.feature.product.list.VideoAdUnitComposeViewKt;
import au.com.woolworths.feature.product.list.compose.filter.EverydayMarketSwitchKt;
import au.com.woolworths.feature.product.list.compose.filter.FilterSortItemKt;
import au.com.woolworths.feature.product.list.compose.filter.ProductListOptionsContentSkeletonKt;
import au.com.woolworths.feature.product.list.compose.filter.child.ProductListOptionsChildFilterKt;
import au.com.woolworths.feature.product.list.data.ProductFilterSwitch;
import au.com.woolworths.feature.product.list.legacy.ProductListOptionsContract;
import au.com.woolworths.feature.product.list.legacy.compose.errorscreen.ProductListErrorScreenKt;
import au.com.woolworths.feature.product.list.legacy.data.ProductListZeroResults;
import au.com.woolworths.feature.product.list.ui.FilterMenuItem;
import au.com.woolworths.feature.product.list.ui.ProductListOptionsSortOptionItem;
import au.com.woolworths.feature.product.list.v2.data.ProductListZeroResults;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContentKt;
import au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundBottomSheetKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.BenefitsComparisonTableKt;
import au.com.woolworths.product.models.DietaryDisclaimer;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.models.VideoAdUnitData;
import au.com.woolworths.rewards.base.data.RewardsRedemptionUnlockConfirmation;
import au.com.woolworths.rewards.base.data.RewardsWebLink;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ c(int i, int i2, int i3, Modifier modifier, Object obj, Object obj2) {
        this.d = i3;
        this.e = obj;
        this.h = modifier;
        this.f = obj2;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        int i2 = this.g;
        Unit unit = Unit.f24250a;
        Object obj3 = this.f;
        Object obj4 = this.h;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                LifecycleEffectKt.b((LifecycleOwner) obj5, (LifecycleResumePauseEffectScope) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                LifecycleEffectKt.d((LifecycleOwner) obj5, (LifecycleStartStopEffectScope) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                WalletTermsAndConditionsKt.b((Function2) obj5, (Modifier) obj4, (PrivacyPolicyContent) obj3, (Composer) obj, RecomposeScopeImplKt.a(55), this.g);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                CoachMarkKt.d((CoachMarkPopupDirection) obj5, this.g, (Modifier) obj4, (Function2) obj3, (Composer) obj, iA);
                break;
            case 4:
                ((Integer) obj2).getClass();
                AlertKt.b((AlertStyle) obj5, (String) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                CoreRowImplKt.b((String) obj5, (String) obj4, (String) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                CardCarouselUiKt.b((CampaignCardCarouselData) obj5, (Modifier) obj4, (Function2) obj3, (Composer) obj, RecomposeScopeImplKt.a(1), this.g);
                break;
            case 7:
                ((Integer) obj2).getClass();
                CardListUiKt.b((CampaignCardListData) obj5, (Modifier) obj4, (Function2) obj3, (Composer) obj, RecomposeScopeImplKt.a(1), this.g);
                break;
            case 8:
                ((Integer) obj2).getClass();
                CardListUiKt.a((CampaignCardData) obj5, (Modifier) obj4, (Function2) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                CategoryTileListUiKt.a((CategoryTileListData) obj5, (Modifier) obj4, (Function2) obj3, (Composer) obj, RecomposeScopeImplKt.a(1), this.g);
                break;
            case 10:
                ((Integer) obj2).getClass();
                ContentListUiKt.b((ContentListData) obj5, (Modifier) obj4, (Function2) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ContentListUiKt.a((ContentListItemData) obj5, (Modifier) obj4, (Function2) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                QuickLinkListUiKt.a((QuickLinkListData) obj5, (Modifier) obj4, (Function2) obj3, (Composer) obj, RecomposeScopeImplKt.a(1), this.g);
                break;
            case 13:
                ((Integer) obj2).intValue();
                ScreenContentKt.b((DynamicPageFooterData) obj5, (String) obj4, (Function2) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                float f = ProductListFragment.u;
                int iA2 = RecomposeScopeImplKt.a(1);
                ((ProductListFragment) obj5).u2((String) obj4, (InsetBannerApiData) obj3, this.g, (Composer) obj, iA2);
                break;
            case 15:
                ((Integer) obj2).getClass();
                float f2 = ProductListFragment.u;
                ((ProductListFragment) obj5).I1((String) obj4, (DietaryDisclaimer) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                VideoAdUnitComposeViewKt.b((VideoAdUnitData) obj5, (ProductCardConfig) obj4, (ProductListViewModel) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                EverydayMarketSwitchKt.a((ProductFilterSwitch) obj5, (Function1) obj3, (Function0) obj4, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                FilterSortItemKt.a((ProductListOptionsSortOptionItem) obj5, (Function0) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                ProductListOptionsContentSkeletonKt.a((ProductListOptionsContract.ViewState) obj5, (Function0) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                ProductListOptionsChildFilterKt.a((FilterMenuItem) obj5, (Function1) obj3, (Function2) obj4, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                ProductListErrorScreenKt.a((ProductListZeroResults.ProductListFullScreenError) obj5, (Function2) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.product.list.legacy.compose.filter.EverydayMarketSwitchKt.a((au.com.woolworths.feature.product.list.legacy.data.ProductFilterSwitch) obj5, (Function1) obj3, (Function0) obj4, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.product.list.legacy.compose.filter.FilterSortItemKt.a((au.com.woolworths.feature.product.list.legacy.ui.ProductListOptionsSortOptionItem) obj5, (Function0) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.product.list.legacy.compose.filter.ProductListOptionsContentSkeletonKt.a((ProductListOptionsContract.ViewState) obj5, (Function0) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.product.list.legacy.compose.filter.child.ProductListOptionsChildFilterKt.a((au.com.woolworths.feature.product.list.legacy.ui.FilterMenuItem) obj5, (Function1) obj3, (Function2) obj4, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.product.list.v2.ui.ProductListErrorScreenKt.a((ProductListZeroResults.ProductListFullScreenError) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).intValue();
                RewardsPreferenceDetailsContentKt.f((String) obj5, (RewardsWebLink) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                UnlockChristmasFundBottomSheetKt.a((RewardsRedemptionUnlockConfirmation) obj5, (Function0) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                BenefitsComparisonTableKt.b((BiasAlignment.Horizontal) obj5, (String) obj4, (String) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
        }
        return unit;
    }

    public /* synthetic */ c(int i, int i2, Object obj, Object obj2, Function1 function1) {
        this.d = i2;
        this.e = obj;
        this.f = function1;
        this.h = obj2;
        this.g = i;
    }

    public /* synthetic */ c(CoachMarkPopupDirection coachMarkPopupDirection, int i, Modifier modifier, Function2 function2, int i2) {
        this.d = 3;
        this.e = coachMarkPopupDirection;
        this.g = i;
        this.h = modifier;
        this.f = function2;
    }

    public /* synthetic */ c(ProductListFragment productListFragment, String str, InsetBannerApiData insetBannerApiData, int i, int i2) {
        this.d = 14;
        this.e = productListFragment;
        this.h = str;
        this.f = insetBannerApiData;
        this.g = i;
    }

    public /* synthetic */ c(VideoAdUnitData videoAdUnitData, ProductCardConfig productCardConfig, ProductListViewModel productListViewModel, int i) {
        this.d = 16;
        this.e = videoAdUnitData;
        this.h = productCardConfig;
        this.f = productListViewModel;
        this.g = i;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.d = i2;
        this.e = obj;
        this.h = obj2;
        this.f = obj3;
        this.g = i;
    }
}
