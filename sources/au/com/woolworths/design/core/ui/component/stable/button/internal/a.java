package au.com.woolworths.design.core.ui.component.stable.button.internal;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec;
import au.com.woolworths.feature.product.list.compose.FullScreenMessageContentKt;
import au.com.woolworths.feature.product.list.data.FullScreenMessage;
import au.com.woolworths.feature.rewards.account.settings.v2.ui.AccountBannerUiKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceBottomSheetViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui.FinalGlanceModalBottomSheetKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.EverydayExtraOnboardingViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.OnboardingScreenKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraChoosePlanBottomSheetViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.ChangePlanModalBottomSheetKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.SummaryScreenKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.summary.EverydayExtrasSummaryFooter;
import au.com.woolworths.feature.rewards.offers.SpinSurpriseBannerViewItem;
import au.com.woolworths.feature.rewards.offers.StandardBannerViewItem;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsContract;
import au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.RewardsBoostersListViewKt;
import au.com.woolworths.feature.rewards.offers.ui.SpinSurpriseBannerSectionKt;
import au.com.woolworths.feature.rewards.offers.ui.StandardBannerSectionKt;
import au.com.woolworths.feature.rewards.redemptionsettings.RedemptionItemClickListener;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsContract;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.UnlockFundsContentKt;
import au.com.woolworths.feature.rewards.redemptionsettings.ui.RedemptionBottomSheetContentKt;
import au.com.woolworths.feature.shared.instore.wifi.ui.JoinInStoreWifiScreenKt;
import au.com.woolworths.feature.shop.brandedshop.ui.product.ProductSectionImpressionKt;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsViewModel;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui.PromotionDetailsScreenKt;
import au.com.woolworths.feature.shop.contentpage.data.ContentPageHeaderData;
import au.com.woolworths.feature.shop.contentpage.data.infotile.InfoTileIconSlotSize;
import au.com.woolworths.feature.shop.contentpage.ui.ContentPageHeaderKt;
import au.com.woolworths.feature.shop.contentpage.ui.infotile.InfoTileIconKt;
import au.com.woolworths.feature.shop.homepage.data.FulfilmentStatusBannerData;
import au.com.woolworths.feature.shop.homepage.presentation.chatentrycard.ChatEntryCardV2Kt;
import au.com.woolworths.feature.shop.homepage.presentation.order.OrderCardUIKt;
import au.com.woolworths.feature.shop.homepage.presentation.quicklinks.HorizontalQuickLinkListKt;
import au.com.woolworths.feature.shop.inbox.InboxUiState;
import au.com.woolworths.feature.shop.inbox.domain.LastUnreadChatbotMessageItem;
import au.com.woolworths.feature.shop.inbox.ui.InboxScreenKt;
import au.com.woolworths.feature.shop.inbox.ui.MessageUsBannerKt;
import au.com.woolworths.feature.shop.instore.cart.InstoreCartViewModel;
import au.com.woolworths.feature.shop.instore.cart.ui.InstoreCartScreenKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapActivity;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapScreenKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$showUserPositionOnMap$lambda$16$lambda$15$$inlined$mapNotNull$1;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.dialog.DebugInfoDialogKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.UserPositionMarkerKt;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.ProductFinderOnboardingViewModel;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.ui.ProductFinderOnboardingScreenKt;
import au.com.woolworths.foundation.feature.analytics.list.ListItemsTrackerState;
import au.com.woolworths.foundation.rewards.banner.model.RewardsNotificationBannerApiData;
import au.com.woolworths.shop.aem.components.model.QuickLinkCard;
import au.com.woolworths.shop.aem.components.model.product.ProductSectionData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ a(Object obj, Modifier modifier, Function1 function1, int i, int i2) {
        this.d = i2;
        this.f = obj;
        this.e = modifier;
        this.g = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ButtonIconKt.a((ImageVector) this.f, (ButtonSpec.Size) this.g, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                FullScreenMessageContentKt.b((FullScreenMessage) this.f, (Modifier) this.e, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.product.list.legacy.compose.FullScreenMessageContentKt.b((au.com.woolworths.feature.product.list.legacy.data.FullScreenMessage) this.f, (Modifier) this.e, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                AccountBannerUiKt.a((RewardsNotificationBannerApiData) this.f, (Function1) this.g, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.a(9));
                break;
            case 4:
                ((Integer) obj2).getClass();
                FinalGlanceModalBottomSheetKt.c((EverydayExtraFinalGlanceBottomSheetViewModel) this.f, (Function1) this.g, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                OnboardingScreenKt.d((EverydayExtraOnboardingViewModel) this.f, (Function1) this.g, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ChangePlanModalBottomSheetKt.a((EverydayExtraChoosePlanBottomSheetViewModel) this.f, (ModalBottomSheetState) this.g, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.a(65));
                break;
            case 7:
                ((Integer) obj2).getClass();
                SummaryScreenKt.a((EverydayExtrasSummaryFooter) this.f, (StatefulButtonState) this.g, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                RewardsBoostersListViewKt.a((RewardsPointsContract.ViewState) this.f, (Function1) this.g, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(385));
                break;
            case 9:
                ((Integer) obj2).getClass();
                SpinSurpriseBannerSectionKt.a((SpinSurpriseBannerViewItem) this.f, (Function1) this.g, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                StandardBannerSectionKt.a((StandardBannerViewItem) this.f, (Function1) this.g, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                UnlockFundsContentKt.a((Function1) this.f, (Function1) this.g, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(3505));
                break;
            case 12:
                ((Integer) obj2).getClass();
                RedemptionBottomSheetContentKt.b((RewardsRedemptionSettingsContract.ViewState) this.f, (Function0) this.g, (RedemptionItemClickListener) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                JoinInStoreWifiScreenKt.g((Function2) this.f, (Function2) this.g, (String) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                JoinInStoreWifiScreenKt.h((Function0) this.f, (Function2) this.g, (String) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                ProductSectionImpressionKt.a((String) this.f, (ProductSectionData) this.g, (ListItemsTrackerState) this.e, (Composer) obj, RecomposeScopeImplKt.a(65));
                break;
            case 16:
                ((Integer) obj2).getClass();
                PromotionDetailsScreenKt.j((PromotionDetailsViewModel) this.f, (Function0) this.g, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                ContentPageHeaderKt.a((ContentPageHeaderData) this.f, (Function1) this.g, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                InfoTileIconKt.a((InfoTileIconSlotSize) this.f, (String) this.g, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                ChatEntryCardV2Kt.a((ArrayList) this.f, (Modifier) this.e, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                OrderCardUIKt.b((FulfilmentStatusBannerData) this.f, (Function0) this.g, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                HorizontalQuickLinkListKt.a((QuickLinkCard) this.f, (Function1) this.g, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(57));
                break;
            case 22:
                ((Integer) obj2).getClass();
                InboxScreenKt.a((InboxUiState.Content) this.f, (Function1) this.g, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.a(385));
                break;
            case 23:
                ((Integer) obj2).getClass();
                MessageUsBannerKt.a((LastUnreadChatbotMessageItem) this.f, (Function0) this.g, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                InstoreCartScreenKt.h((InstoreCartViewModel) this.f, (Function0) this.g, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                InstoreMapScreenKt.j((InstoreMapContract.ViewState.NavigationState) this.f, (Function0) this.g, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                InstoreMapScreenKt.b((InstoreMapActivity.AnonymousClass1.C01851.C01861) this.f, (InstoreMapViewModel) this.g, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                DebugInfoDialogKt.a((InstoreMapContract.ViewState.DebugInfo) this.f, (Function0) this.g, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                UserPositionMarkerKt.b((InstoreMapViewModel$showUserPositionOnMap$lambda$16$lambda$15$$inlined$mapNotNull$1) this.f, (Function1) this.g, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ProductFinderOnboardingScreenKt.a((ProductFinderOnboardingViewModel) this.f, (Function1) this.g, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(385));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.d = i2;
        this.f = obj;
        this.g = obj2;
        this.e = obj3;
    }
}
