package androidx.navigation.compose;

import android.view.View;
import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.compose.foundation.lazy.grid.LazyGridSpanKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Modifier;
import androidx.paging.compose.LazyPagingItems;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.modules.checkout.ui.ProgressStepItemKt;
import au.com.woolworths.android.onesite.modules.main.MainActivity;
import au.com.woolworths.android.onesite.modules.main.MainContract;
import au.com.woolworths.android.onesite.modules.main.MainViewModel;
import au.com.woolworths.android.onesite.modules.main.tooltip.CoachMark;
import au.com.woolworths.android.onesite.modules.main.tooltip.CollectionModeHeaderCoachMark;
import au.com.woolworths.android.onesite.modules.main.tooltip.InstoreModeReminderCoachmark;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardData;
import au.com.woolworths.base.shopapp.databinding.SimpleCoachMarkContentBinding;
import au.com.woolworths.base.wallet.data.MessageModelCta;
import au.com.woolworths.base.wallet.termsandconditions.WalletTermsAndConditionsKt;
import au.com.woolworths.compose.utils.effect.ActionEffectKt;
import au.com.woolworths.design.core.ui.PreviewBackgroundColor;
import au.com.woolworths.design.core.ui.ThemeForPreviewKt;
import au.com.woolworths.design.wx.foundation.ThemeContext;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.product.list.ProductListClickHandler;
import au.com.woolworths.feature.product.list.ProductListOptionsViewModel;
import au.com.woolworths.feature.product.list.compose.filter.child.ProductListChildFilterScreenKt;
import au.com.woolworths.feature.product.list.compose.recipe.IngredientCardUiKt;
import au.com.woolworths.feature.product.list.data.IngredientCardApiData;
import au.com.woolworths.feature.product.list.v2.ProductListUiState;
import au.com.woolworths.feature.product.list.v2.ui.ProductsDisplayMode;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContentKt;
import au.com.woolworths.feature.rewards.account.preferences.data.PreferenceDetailsHeaderData;
import au.com.woolworths.feature.rewards.card.overlay.ui.RewardsCardOverlayScreenKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceBottomSheetViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui.FinalGlanceModalBottomSheetKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.BenefitsContentKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.OnboardingScreenKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasTab;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasTermsAndConditions;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasOnBoarding;
import au.com.woolworths.feature.rewards.offers.RewardsOffersViewModelLegacy;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferAnalyticsManager;
import au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData;
import au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData$Companion$rewardsCategoryOfferCtaButtonClick$1;
import au.com.woolworths.feature.rewards.offers.listpage.OfferListPageViewModel;
import au.com.woolworths.feature.rewards.offers.listpage.OfferListPageViewModelKt$createAnalyticsScreen$1;
import au.com.woolworths.feature.rewards.offers.listpage.ui.OfferListPageEmptyStateFullScreenKt;
import au.com.woolworths.feature.rewards.offers.ui.OfferDetailMechanicsCarouselKt;
import au.com.woolworths.feature.rewards.redemptionsettings.RedemptionItemClickListener;
import au.com.woolworths.feature.rewards.redemptionsettings.data.RewardsRedemptionAction;
import au.com.woolworths.feature.rewards.redemptionsettings.data.RewardsRedemptionActionsList;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecureDollarsContract;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesContract;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.SecureDollarsScreenKt;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.SecurePreferenceScreenKt;
import au.com.woolworths.feature.rewards.redemptionsettings.ui.RedemptionActionKt;
import au.com.woolworths.feature.rewards.redemptionsettings.ui.RedemptionBottomSheetContentKt;
import au.com.woolworths.feature.shared.instore.wifi.ui.JoinInStoreWifiScreenKt;
import au.com.woolworths.foundation.rewards.model.RewardsEmptyState;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItem;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferMechanics;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.checkout.domain.model.ProgressStep;
import com.dynatrace.android.callback.Callback;
import com.skydoves.balloon.Balloon;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                DialogHostKt.b((List) obj4, (Collection) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 1:
                ((Integer) obj2).getClass();
                NavBackStackEntryProviderKt.b((SaveableStateHolder) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 2:
                ((Integer) obj2).getClass();
                ProgressStepItemKt.a((ProgressStep) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 3:
                CoachMark coachMark = (CoachMark) obj3;
                SimpleCoachMarkContentBinding showSimpleCoachMark = (SimpleCoachMarkContentBinding) obj;
                final Balloon balloon = (Balloon) obj2;
                MainContract.MainPage mainPage = MainActivity.R;
                Intrinsics.h(showSimpleCoachMark, "$this$showSimpleCoachMark");
                Intrinsics.h(balloon, "balloon");
                showSimpleCoachMark.y.setOnClickListener(new View.OnClickListener() { // from class: au.com.woolworths.android.onesite.modules.main.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Balloon balloon2 = balloon;
                        MainContract.MainPage mainPage2 = MainActivity.R;
                        Callback.g(view);
                        try {
                            balloon2.c();
                        } finally {
                            Callback.h();
                        }
                    }
                });
                MainViewModel mainViewModelT4 = ((MainActivity) obj4).T4();
                Intrinsics.h(coachMark, "coachMark");
                mainViewModelT4.z = true;
                mainViewModelT4.A.remove(coachMark);
                if (coachMark instanceof CollectionModeHeaderCoachMark) {
                    androidx.constraintlayout.core.state.a.v(mainViewModelT4.m.f8864a.f8865a, "collection_mode_header_coach_mark_key", true);
                } else {
                    if (!(coachMark instanceof InstoreModeReminderCoachmark)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mainViewModelT4.p.c();
                }
                return unit;
            case 4:
                ((Integer) obj2).getClass();
                WalletTermsAndConditionsKt.a((MessageModelCta) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 5:
                ((Integer) obj2).getClass();
                ActionEffectKt.a(obj4, (Function3) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 6:
                ((Integer) obj2).getClass();
                ThemeForPreviewKt.a((PreviewBackgroundColor) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, RecomposeScopeImplKt.a(49));
                return unit;
            case 7:
                ((Integer) obj2).getClass();
                ThemeForPreviewKt.b((PreviewBackgroundColor) obj4, (Function2) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 8:
                ((Integer) obj2).getClass();
                ThemeKt.c((ThemeContext) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, RecomposeScopeImplKt.a(49));
                return unit;
            case 9:
                ((Integer) obj2).getClass();
                au.com.woolworths.design.wx.preview.ThemeForPreviewKt.b((au.com.woolworths.design.wx.preview.PreviewBackgroundColor) obj4, (Function2) obj3, (Composer) obj, RecomposeScopeImplKt.a(49));
                return unit;
            case 10:
                ((Integer) obj2).getClass();
                au.com.woolworths.design.wx.preview.ThemeForPreviewKt.a((au.com.woolworths.design.wx.preview.PreviewBackgroundColor) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, RecomposeScopeImplKt.a(49));
                return unit;
            case 11:
                ((Integer) obj2).getClass();
                ProductListChildFilterScreenKt.b((ProductListOptionsViewModel) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 12:
                ((Integer) obj2).getClass();
                IngredientCardUiKt.a((IngredientCardApiData) obj4, (ProductListClickHandler) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 13:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.product.list.legacy.compose.filter.child.ProductListChildFilterScreenKt.b((au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 14:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.product.list.legacy.compose.recipe.IngredientCardUiKt.a((au.com.woolworths.feature.product.list.legacy.data.IngredientCardApiData) obj4, (au.com.woolworths.feature.product.list.legacy.ProductListClickHandler) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 15:
                ProductListUiState productListUiState = (ProductListUiState) obj3;
                LazyGridItemSpanScope items = (LazyGridItemSpanScope) obj;
                int iIntValue = ((Integer) obj2).intValue();
                Intrinsics.h(items, "$this$items");
                boolean z = ((LazyPagingItems) obj4).c().get(iIntValue) instanceof ProductCard;
                return new GridItemSpan(LazyGridSpanKt.a((z && productListUiState.g == ProductsDisplayMode.e) ? 1 : (z && productListUiState.g == ProductsDisplayMode.d) ? items.a() : items.a()));
            case 16:
                ((Integer) obj2).getClass();
                RewardsPreferenceDetailsContentKt.h((PreferenceDetailsHeaderData) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 17:
                ((Integer) obj2).getClass();
                RewardsCardOverlayScreenKt.a((RewardsCardData) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 18:
                ((Integer) obj2).getClass();
                FinalGlanceModalBottomSheetKt.b((EverydayExtraFinalGlanceBottomSheetViewModel) obj4, (ModalBottomSheetState) obj3, (Composer) obj, RecomposeScopeImplKt.a(65));
                return unit;
            case 19:
                ((Integer) obj2).getClass();
                BenefitsContentKt.a((EverydayExtrasTab.EverydayExtrasKeyBenefitsTab) obj4, (EverydayExtrasTermsAndConditions) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 20:
                ((Integer) obj2).getClass();
                OnboardingScreenKt.c((EverydayExtrasOnBoarding) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 21:
                ContentCta cta = (ContentCta) obj2;
                Intrinsics.h((RewardsOfferData) obj, "<unused var>");
                Intrinsics.h(cta, "cta");
                ((RewardsOffersViewModelLegacy) obj4).p2(((OfferViewItem) obj3).b, cta);
                return unit;
            case 22:
                ((Integer) obj2).getClass();
                OfferListPageEmptyStateFullScreenKt.a((RewardsEmptyState) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(49));
                return unit;
            case 23:
                OfferListPageViewModel offerListPageViewModel = (OfferListPageViewModel) obj4;
                Function1 function1 = (Function1) obj3;
                RewardsOfferData offer = (RewardsOfferData) obj;
                ContentCta cta2 = (ContentCta) obj2;
                Intrinsics.h(offer, "offer");
                Intrinsics.h(cta2, "cta");
                String url = cta2.getUrl();
                if (url != null) {
                    String ctaLabel = cta2.getLabel();
                    Intrinsics.h(ctaLabel, "ctaLabel");
                    RewardsOfferAnalyticsManager rewardsOfferAnalyticsManager = offerListPageViewModel.r;
                    OfferListPageViewModelKt$createAnalyticsScreen$1 offerListPageViewModelKt$createAnalyticsScreen$1 = offerListPageViewModel.u;
                    RewardsPointsActionData.e.getClass();
                    rewardsOfferAnalyticsManager.p(offer, offerListPageViewModelKt$createAnalyticsScreen$1, url, new RewardsPointsActionData$Companion$rewardsCategoryOfferCtaButtonClick$1(ctaLabel));
                    function1.invoke(url);
                }
                return unit;
            case 24:
                ((Integer) obj2).getClass();
                OfferDetailMechanicsCarouselKt.a((RewardsOfferMechanics) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 25:
                ((Integer) obj2).getClass();
                SecureDollarsScreenKt.c((SecureDollarsContract.ViewState) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(49));
                return unit;
            case 26:
                ((Integer) obj2).getClass();
                SecurePreferenceScreenKt.b((SecurityPreferencesContract.ViewState) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(49));
                return unit;
            case 27:
                ((Integer) obj2).getClass();
                RedemptionActionKt.a((RewardsRedemptionAction) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 28:
                ((Integer) obj2).getClass();
                RedemptionBottomSheetContentKt.a((RewardsRedemptionActionsList) obj4, (RedemptionItemClickListener) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            default:
                ((Integer) obj2).getClass();
                JoinInStoreWifiScreenKt.e(RecomposeScopeImplKt.a(1), (Composer) obj, (String) obj3, (Function2) obj4);
                return unit;
        }
    }

    public /* synthetic */ d(Object obj, int i, int i2, Object obj2) {
        this.d = i2;
        this.e = obj;
        this.f = obj2;
    }
}
