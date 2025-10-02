package au.com.woolworths.feature.shop.myorders.details.infomodal;

import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageAnalysisConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.core.view.KeyEventDispatcher;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.remoteconfig.ShopRemoteConfig;
import au.com.woolworths.feature.shop.myorders.details.location.PickupOrderLocationTrackingConfig;
import au.com.woolworths.feature.shop.myorders.details.location.PickupOrderLocationTrackingService;
import au.com.woolworths.feature.shop.myorders.details.models.DeliveryMethodsTooltip;
import au.com.woolworths.feature.shop.myorders.details.pickupeta.PickupEtaSelectorBottomSheet;
import au.com.woolworths.feature.shop.myorders.details.pickupeta.PickupEtaSelectorViewModel;
import au.com.woolworths.feature.shop.myorders.details.proofofdelivery.ProofOfDeliveryActivity;
import au.com.woolworths.feature.shop.myorders.orders.list.OrdersListFragment;
import au.com.woolworths.feature.shop.recipes.feature.RecipesFeature;
import au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentViewModel;
import au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeViewModel;
import au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListActivity;
import au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListEpoxyController;
import au.com.woolworths.feature.shop.recipes.search.RecipeSearchActivity;
import au.com.woolworths.feature.shop.recipes.search.RecipeSearchViewModel;
import au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorActivity;
import au.com.woolworths.feature.shop.storelocator.details.StoreDetailsContract;
import au.com.woolworths.feature.shop.storelocator.details.StoreDetailsScreenKt;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsContract;
import au.com.woolworths.feature.shop.video.FullPageVideoPlayerActivity;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderFragment;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayNavigation;
import au.com.woolworths.foundation.barcode.reader.mlkit.MlKitBarcodeImageAnalyzer;
import au.com.woolworths.foundation.barcode.reader.mlkit.MlKitBarcodeScannerView;
import au.com.woolworths.foundation.feature.analytics.list.ItemsSeenState;
import au.com.woolworths.foundation.feature.analytics.list.ListItemsTrackerState;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessageInteractorImpl;
import au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetContract;
import au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetFragment;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetEpoxyController;
import au.com.woolworths.pagingutils.PageKeyedPagingSourceFactory;
import au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment;
import au.com.woolworths.product.deliveryaddressprompt.AddDeliveryAddressBottomSheetContract;
import au.com.woolworths.product.deliveryaddressprompt.AddDeliveryAddressBottomSheetFragment;
import au.com.woolworths.product.deliveryaddressprompt.AddDeliveryAddressBottomSheetViewModel;
import au.com.woolworths.rewards.base.featuretoggles.RewardsRemoteConfig;
import au.com.woolworths.shop.buyagain.ui.BuyAgainActivity;
import au.com.woolworths.shop.buyagain.ui.legacy.quantityselector.BuyAgainQuantitySelectorFragment;
import au.com.woolworths.shop.cart.ui.CartBadgeActionView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.gson.Gson;
import com.woolworths.R;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((ApplicableDeliveryMethodActivity) obj).finish();
                return unit;
            case 1:
                ((ProgressStepperInfoUpliftActivity) obj).finish();
                return unit;
            case 2:
                int i2 = PickupOrderLocationTrackingService.q;
                Gson gson = new Gson();
                FeatureToggleManager featureToggleManager = ((PickupOrderLocationTrackingService) obj).k;
                if (featureToggleManager != null) {
                    return (PickupOrderLocationTrackingConfig) gson.d(PickupOrderLocationTrackingConfig.class, featureToggleManager.e(ShopRemoteConfig.j, false));
                }
                Intrinsics.p("featureToggleManager");
                throw null;
            case 3:
                PickupEtaSelectorBottomSheet pickupEtaSelectorBottomSheet = (PickupEtaSelectorBottomSheet) obj;
                Object parentFragment = pickupEtaSelectorBottomSheet.getParentFragment();
                if (parentFragment == null) {
                    parentFragment = pickupEtaSelectorBottomSheet.getActivity();
                }
                Intrinsics.f(parentFragment, "null cannot be cast to non-null type au.com.woolworths.feature.shop.myorders.details.pickupeta.PickupEtaSelectorBottomSheet.BottomSheetHost");
                return (PickupEtaSelectorBottomSheet.BottomSheetHost) parentFragment;
            case 4:
                MutableStateFlow mutableStateFlow = ((PickupEtaSelectorViewModel) obj).h;
                if (mutableStateFlow != null) {
                    return FlowKt.b(mutableStateFlow);
                }
                Intrinsics.p("mutableViewState");
                throw null;
            case 5:
                ((ProofOfDeliveryActivity) obj).finish();
                return unit;
            case 6:
                return Integer.valueOf(((DeliveryMethodsTooltip) obj).f.size());
            case 7:
                OrdersListFragment.Companion companion = OrdersListFragment.p;
                ((OrdersListFragment) obj).Q1().r6();
                return unit;
            case 8:
                return Boolean.valueOf(((FreshMagContentViewModel) obj).g.c(RecipesFeature.d));
            case 9:
                return Boolean.valueOf(((FreshMagHomeViewModel) obj).h.c(RecipesFeature.d));
            case 10:
                int i3 = RecipeListActivity.C;
                return new RecipeListEpoxyController(((RecipeListActivity) obj).O4());
            case 11:
                ((RecipeSearchActivity) obj).finish();
                return unit;
            case 12:
                ((RecipeSearchViewModel) obj).p6();
                return unit;
            case 13:
                ((ShippingCalculatorActivity) obj).finish();
                return unit;
            case 14:
                int i4 = StoreDetailsScreenKt.f8144a;
                ((StoreDetailsContract.ViewState) obj).h.invoke(StoreDetailsContract.ViewModelAction.RetryOnError.f8142a);
                return unit;
            case 15:
                int i5 = au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsScreenKt.f8201a;
                ((StoreDetailsContract.ViewState) obj).h.invoke(StoreDetailsContract.ViewModelAction.RetryOnError.f8199a);
                return unit;
            case 16:
                FullPageVideoPlayerActivity fullPageVideoPlayerActivity = (FullPageVideoPlayerActivity) obj;
                fullPageVideoPlayerActivity.O4(0L, fullPageVideoPlayerActivity.getString(R.string.unable_to_play_video));
                return unit;
            case 17:
                KeyEventDispatcher.Component componentRequireActivity = ((WPayForOrderFragment) obj).requireActivity();
                WPayNavigation wPayNavigation = componentRequireActivity instanceof WPayNavigation ? (WPayNavigation) componentRequireActivity : null;
                if (wPayNavigation == null) {
                    throw new IllegalStateException("Parent Activity must implement WPayNavigation");
                }
                wPayNavigation.n2();
                return unit;
            case 18:
                MlKitBarcodeScannerView mlKitBarcodeScannerView = (MlKitBarcodeScannerView) obj;
                int i6 = MlKitBarcodeScannerView.m;
                ImageAnalysis.Builder builder = new ImageAnalysis.Builder();
                Config.Option option = ImageAnalysisConfig.H;
                MutableOptionsBundle mutableOptionsBundle = builder.f404a;
                mutableOptionsBundle.G(option, 0);
                ImageAnalysisConfig imageAnalysisConfig = new ImageAnalysisConfig(OptionsBundle.U(mutableOptionsBundle));
                ImageOutputConfig.J(imageAnalysisConfig);
                ImageAnalysis imageAnalysis = new ImageAnalysis(imageAnalysisConfig);
                ExecutorService executorService = mlKitBarcodeScannerView.h;
                MlKitBarcodeImageAnalyzer mlKitBarcodeImageAnalyzer = mlKitBarcodeScannerView.k;
                if (mlKitBarcodeImageAnalyzer != null) {
                    imageAnalysis.G(executorService, mlKitBarcodeImageAnalyzer);
                    return imageAnalysis;
                }
                Intrinsics.p("barcodeImageAnalyzer");
                throw null;
            case 19:
                return ((ItemsSeenState) obj).f8491a.j();
            case 20:
                return ((ListItemsTrackerState) obj).f8493a.j();
            case 21:
                FeatureToggleManager featureToggleManager2 = ((RewardsServiceMessageInteractorImpl) obj).f8655a;
                RewardsRemoteConfig rewardsRemoteConfig = RewardsRemoteConfig.e;
                return featureToggleManager2.b();
            case 22:
                BaseBottomSheetFragment baseBottomSheetFragment = (BaseBottomSheetFragment) obj;
                BaseBottomSheetContract.ViewState viewState = (BaseBottomSheetContract.ViewState) baseBottomSheetFragment.R1().e.e();
                return new BottomSheetEpoxyController(viewState != null ? viewState.d : false, baseBottomSheetFragment.R1(), baseBottomSheetFragment.R1(), baseBottomSheetFragment.R1());
            case 23:
                ((PageKeyedPagingSourceFactory) obj).f9176a = null;
                return unit;
            case 24:
                AddToCartBottomSheetFragment addToCartBottomSheetFragment = (AddToCartBottomSheetFragment) obj;
                Object parentFragment2 = addToCartBottomSheetFragment.getParentFragment();
                if (parentFragment2 == null) {
                    parentFragment2 = addToCartBottomSheetFragment.getActivity();
                }
                if (parentFragment2 instanceof AddToCartBottomSheetFragment.BottomSheetHost) {
                    return (AddToCartBottomSheetFragment.BottomSheetHost) parentFragment2;
                }
                return null;
            case 25:
                AddDeliveryAddressBottomSheetFragment addDeliveryAddressBottomSheetFragment = (AddDeliveryAddressBottomSheetFragment) obj;
                ((AddDeliveryAddressBottomSheetViewModel) addDeliveryAddressBottomSheetFragment.i.getD()).e.f(AddDeliveryAddressBottomSheetContract.Actions.OnAddDeliveryAddress.f9281a);
                addDeliveryAddressBottomSheetFragment.dismiss();
                return unit;
            case 26:
                ((LottieAnimationView) obj).g();
                return unit;
            case 27:
                ((BuyAgainActivity) obj).finish();
                return unit;
            case 28:
                BuyAgainQuantitySelectorFragment buyAgainQuantitySelectorFragment = (BuyAgainQuantitySelectorFragment) obj;
                Object parentFragment3 = buyAgainQuantitySelectorFragment.getParentFragment();
                if (parentFragment3 == null) {
                    parentFragment3 = buyAgainQuantitySelectorFragment.getActivity();
                }
                Intrinsics.f(parentFragment3, "null cannot be cast to non-null type au.com.woolworths.shop.buyagain.ui.legacy.quantityselector.BuyAgainQuantitySelectorFragment.BottomSheetHost");
                return (BuyAgainQuantitySelectorFragment.BottomSheetHost) parentFragment3;
            default:
                int i7 = CartBadgeActionView.l;
                return ((CartBadgeActionView) obj).getActivity$shop_cart_release().getDefaultViewModelProviderFactory();
        }
    }
}
