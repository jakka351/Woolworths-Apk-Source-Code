package au.com.woolworths.feature.shop.contentpage.ui;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.android.onesite.data.HorizontalListDataInterface;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionClickListener;
import au.com.woolworths.feature.shop.contentpage.data.infotile.InfoTileCta;
import au.com.woolworths.feature.shop.homepage.analytics.HomePageActions;
import au.com.woolworths.feature.shop.homepage.data.ChatEntryCardCta;
import au.com.woolworths.feature.shop.homepage.data.MyShoppingListItemData;
import au.com.woolworths.feature.shop.homepage.data.MyShoppingListsData;
import au.com.woolworths.feature.shop.homepage.data.RewardsBalanceCardData;
import au.com.woolworths.feature.shop.homepage.presentation.HomeController;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageContract;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel;
import au.com.woolworths.feature.shop.homepage.presentation.rewards.ProgressBarAnimationConfig;
import au.com.woolworths.feature.shop.instore.navigation.map.data.Floor;
import au.com.woolworths.feature.shop.instore.navigation.map.data.proximity.LocalProximityEventSpec;
import au.com.woolworths.feature.shop.instore.navigation.map.data.proximity.LocalProximityEventTriggerSpec;
import au.com.woolworths.feature.shop.instore.navigation.map.data.proximity.ProximityEvent;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.ProximityInteractorImpl;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.ProductFinderOnboardingContract;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.ProductFinderOnboardingViewModel;
import au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderContract;
import au.com.woolworths.feature.shop.marketplace.data.models.InfoHeader;
import au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedEpoxyController;
import au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedViewModel;
import au.com.woolworths.feature.shop.modeselector.ModeSelectorContract;
import au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel;
import au.com.woolworths.feature.shop.modeselector.model.Item;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeButton;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSection;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelectorErrorResponse;
import au.com.woolworths.feature.shop.modeselector.ui.ShoppingModeOptionKt;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsContract;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsController;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsViewModel;
import au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpItemData;
import au.com.woolworths.feature.shop.myorders.details.models.OrderCollectionDetails;
import au.com.woolworths.feature.shop.myorders.details.models.OrderCollectionParkingDetails;
import au.com.woolworths.feature.shop.myorders.details.models.OrderNumberDetails;
import au.com.woolworths.feature.shop.myorders.details.models.OrderProofOfDeliveryDetailsData;
import au.com.woolworths.feature.shop.myorders.details.models.OrderStoreDetails;
import au.com.woolworths.feature.shop.myorders.details.models.StepsToolTip;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import au.com.woolworths.shop.aem.components.model.link.LinkData;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object dwellRegion;
        Object value;
        int i = this.d;
        int iIndexOf = 0;
        Unit unit = Unit.f24250a;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj2;
                LinkData linkData = (LinkData) obj;
                if (function1 != null) {
                    function1.invoke(linkData);
                }
                return unit;
            case 1:
                ((Function1) obj2).invoke(((InfoTileCta) obj).b);
                return unit;
            case 2:
                ((Function1) obj2).invoke((Region) obj);
                return unit;
            case 3:
                return HomeController.buildGoogleAdBannerCard$lambda$20$lambda$19((HomeController) obj2, (GoogleAdBannerCard) obj);
            case 4:
                return HomeController.buildActionableCard$lambda$18$lambda$17((HomeController) obj2, (ActionableCard) obj);
            case 5:
                HomePageViewModel homePageViewModel = ((HomeController) obj2).viewModel;
                String str = ((RewardsBalanceCardData) obj).e;
                homePageViewModel.f.c(HomePageActions.RewardsPointsClick.e);
                homePageViewModel.w6(new HomePageContract.Actions.LaunchDeepLink(str));
                return unit;
            case 6:
                ((HorizontalListActionClickListener) obj2).G0((HorizontalListDataInterface) obj);
                return unit;
            case 7:
                ((Function1) obj2).invoke((ChatEntryCardCta) obj);
                return unit;
            case 8:
                ((Function1) obj2).invoke(((ArrayList) obj).get(0));
                return unit;
            case 9:
                ((Function1) obj2).invoke((MyShoppingListsData) obj);
                return unit;
            case 10:
                ((Function1) obj2).invoke((MyShoppingListItemData) obj);
                return unit;
            case 11:
                ((MutableState) obj).setValue(Boolean.TRUE);
                ProgressBarAnimationConfig.f7254a = ((RewardsBalanceCardData) obj2).c;
                return unit;
            case 12:
                return Integer.valueOf(((WindowInsets) obj2).a((Density) obj));
            case 13:
                ProximityInteractorImpl proximityInteractorImpl = (ProximityInteractorImpl) obj2;
                LocalProximityEventSpec localProximityEventSpec = (LocalProximityEventSpec) obj;
                LocalProximityEventTriggerSpec localProximityEventTriggerSpec = localProximityEventSpec.c;
                String str2 = localProximityEventSpec.e;
                if (localProximityEventTriggerSpec instanceof LocalProximityEventTriggerSpec.Enter) {
                    dwellRegion = new ProximityEvent.EnterRegion(str2);
                } else if (localProximityEventTriggerSpec instanceof LocalProximityEventTriggerSpec.Exit) {
                    dwellRegion = new ProximityEvent.ExitRegion(str2);
                } else {
                    if (!(localProximityEventTriggerSpec instanceof LocalProximityEventTriggerSpec.Dwell)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dwellRegion = new ProximityEvent.DwellRegion(str2);
                }
                proximityInteractorImpl.d.f(dwellRegion);
                return unit;
            case 14:
                Floor floor = (Floor) obj2;
                List list = (List) obj;
                if (CollectionsKt.t(list, floor)) {
                    Intrinsics.h(list, "<this>");
                    iIndexOf = list.indexOf(floor);
                }
                return Integer.valueOf(iIndexOf);
            case 15:
                ((Function1) obj2).invoke((Floor) obj);
                return unit;
            case 16:
                ((ProductFinderOnboardingViewModel) obj2).q6(new ProductFinderOnboardingContract.OnboardingEvent.OnNextButtonClick((String) obj));
                return unit;
            case 17:
                ((Function1) obj2).invoke((ProductFinderContract.LocationServicesUnavailableState) obj);
                return unit;
            case 18:
                return MarketplacePersonalisedEpoxyController.buildUi$lambda$1$lambda$0((MarketplacePersonalisedEpoxyController) obj2, (InfoHeader) obj);
            case 19:
                ((MarketplacePersonalisedViewModel) obj2).r6((InfoSection) obj);
                return unit;
            case 20:
                ModeSelectorViewModel modeSelectorViewModel = (ModeSelectorViewModel) obj2;
                ShoppingModeSelectorErrorResponse shoppingModeSelectorErrorResponse = (ShoppingModeSelectorErrorResponse) obj;
                MutableStateFlow mutableStateFlow = modeSelectorViewModel.l;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value, ModeSelectorContract.ViewState.a((ModeSelectorContract.ViewState) value, false, null, null, null, null, null, null, null, null, null, null, 2043)));
                String str3 = shoppingModeSelectorErrorResponse.f7539a;
                if (str3 != null) {
                    modeSelectorViewModel.x6(str3);
                }
                return unit;
            case 21:
                ShoppingModeButton shoppingModeButton = (ShoppingModeButton) obj;
                Function1 function12 = (Function1) obj2;
                if (!shoppingModeButton.b) {
                    function12.invoke(shoppingModeButton.f7530a);
                }
                return unit;
            case 22:
                ShoppingModeSection.ShoppingModeSelectorOptionsSection shoppingModeSelectorOptionsSection = ShoppingModeOptionKt.f7549a;
                ((Function1) obj2).invoke((Item) obj);
                return unit;
            case 23:
                ((OrderDetailsController) obj2).viewModel.G0((HorizontalListData) obj);
                return unit;
            case 24:
                OrderDetailsController orderDetailsController = (OrderDetailsController) obj;
                OrderCollectionParkingDetails orderCollectionParkingDetails = ((OrderCollectionDetails) obj2).d;
                if (orderCollectionParkingDetails != null) {
                    orderDetailsController.viewModel.A4(orderCollectionParkingDetails);
                }
                return unit;
            case 25:
                OrderDetailsController orderDetailsController2 = (OrderDetailsController) obj;
                String str4 = ((OrderStoreDetails) obj2).c;
                if (str4 != null) {
                    orderDetailsController2.viewModel.R3(str4);
                }
                return unit;
            case 26:
                ((OrderDetailsController) obj2).viewModel.G3(((OrderNumberDetails) obj).b);
                return unit;
            case 27:
                OrderProofOfDeliveryDetailsData orderProofOfDeliveryDetailsData = (OrderProofOfDeliveryDetailsData) obj;
                OrderDetailsViewModel orderDetailsViewModel = ((OrderDetailsController) obj2).viewModel;
                String str5 = orderProofOfDeliveryDetailsData.f7768a;
                String str6 = orderProofOfDeliveryDetailsData.c;
                String str7 = orderProofOfDeliveryDetailsData.d;
                orderDetailsViewModel.getClass();
                orderDetailsViewModel.u.f(new OrderDetailsContract.Actions.ShowProofOfDeliveryScreen(str5, str6, str7));
                return unit;
            case 28:
                ((Function1) obj2).invoke((OrderHelpItemData) obj);
                return unit;
            default:
                ((Function1) obj2).invoke((StepsToolTip) obj);
                return unit;
        }
    }

    public /* synthetic */ n(ShoppingModeButton shoppingModeButton, Function1 function1) {
        this.d = 21;
        this.f = shoppingModeButton;
        this.e = function1;
    }
}
