package au.com.woolworths.feature.shop.marketplace.ui.personalised;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceViewModel;
import au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel;
import au.com.woolworths.feature.shop.modeselector.ui.ModeSelectorScreenKt;
import au.com.woolworths.feature.shop.myorders.details.location.RequestLocationPermissionPrimingDialogContentKt;
import au.com.woolworths.feature.shop.myorders.details.models.ProgressStepper;
import au.com.woolworths.feature.shop.myorders.details.models.StepsToolTip;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.CurrentDeliveryOrderOverviewItemKt;
import au.com.woolworths.feature.shop.product.availability.domain.StoreProductAvailabilityData;
import au.com.woolworths.feature.shop.product.availability.ui.NearbyStoresSectionUiKt;
import au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesScreenKt;
import au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesViewModel;
import au.com.woolworths.feature.shop.signup.data.SignUpError;
import au.com.woolworths.feature.shop.signup.ui.SignUpScreenKt;
import au.com.woolworths.feature.shop.voc.freetext.VocFreeTextContract;
import au.com.woolworths.feature.shop.voc.freetext.VocFreeTextScreenKt;
import au.com.woolworths.foundation.rewards.common.ui.CircularProgressIndicatorBoxedKt;
import au.com.woolworths.foundation.rewards.common.ui.errors.FullPageErrorContentKt;
import au.com.woolworths.foundation.rewards.common.ui.errors.data.FullPageError;
import au.com.woolworths.foundation.rewards.common.ui.info.banner.RewardsInfoBannerData;
import au.com.woolworths.foundation.rewards.common.ui.info.banner.RewardsInfoBannerUiKt;
import au.com.woolworths.foundation.rewards.common.ui.modal.RewardsModalScreenData;
import au.com.woolworths.foundation.rewards.common.ui.modal.RewardsModalScreenKt;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchState;
import au.com.woolworths.foundation.shop.olive.voice.ui.search.OliveStateKt;
import au.com.woolworths.sdui.common.alert.StandardAlertKt;
import au.com.woolworths.sdui.common.alert.model.BasicInsetAlertModel;
import au.com.woolworths.sdui.legacy.scrollablelist.ScrollableListActionState;
import au.com.woolworths.sdui.legacy.scrollablelist.ScrollableListUiKt;
import au.com.woolworths.sdui.rewards.broadcastbanner.BroadcastBannerKt;
import au.com.woolworths.sdui.rewards.model.broadcastbanner.BasicCoreBroadcastBannerModel;
import au.com.woolworths.shared.ui.compose.dynamicsizecard.DynamicSizeCardKt;
import au.com.woolworths.shop.aem.components.model.PillData;
import au.com.woolworths.shop.aem.components.model.buttonsection.ButtonSectionData;
import au.com.woolworths.shop.aem.components.model.contentcard.ContentCardData;
import au.com.woolworths.shop.aem.components.model.contentcard.ContentCardTextComponentType;
import au.com.woolworths.shop.aem.components.model.contentcard.ContentCardTextHeightType;
import au.com.woolworths.shop.aem.components.model.contentcard.FullWidthContentCardData;
import au.com.woolworths.shop.aem.components.ui.CenteredTextKt;
import au.com.woolworths.shop.aem.components.ui.PillKt;
import au.com.woolworths.shop.aem.components.ui.buttonsection.ButtonSectionKt;
import au.com.woolworths.shop.aem.components.ui.contentcard.ContentCardKt;
import au.com.woolworths.shop.aem.components.ui.contentcard.FullWidthContentCardKt;
import au.com.woolworths.shop.cart.domain.model.ProductReviewAlternativeResponseData;
import au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeScreenKt;
import au.com.woolworths.shop.cart.ui.productalternative.ProductsReviewAlternativeCallbacks;
import au.com.woolworths.shop.checkout.domain.model.substitution.CheckoutProductSubstitutionPreference;
import au.com.woolworths.shop.checkout.ui.components.compose.ProductSubstituteRowKt;
import au.com.woolworths.shop.checkout.ui.content.ModalBottomSheetData;
import au.com.woolworths.shop.checkout.ui.substitution.component.ProductSubstituteItemKt;
import au.com.woolworths.shop.checkout.ui.summary.rewards.RewardsQuantitySelectorModalKt;
import au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorContract;
import au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorErrorScreenKt;
import au.com.woolworths.shop.lists.ui.magicmatch.ui.OnboardingBottomSheetKt;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.d = i2;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                MarketplacePersonalisedScreenKt.a((MarketplacePersonalisedViewModel) this.e, (MarketplaceViewModel) this.f, (FeatureToggleManager) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ModeSelectorScreenKt.b((ModeSelectorViewModel) this.e, (Function0) this.f, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 2:
                List list = (List) this.e;
                String str = (String) this.f;
                Function1 function1 = (Function1) this.g;
                ((Integer) obj2).getClass();
                RequestLocationPermissionPrimingDialogContentKt.d(RecomposeScopeImplKt.a(1), (Composer) obj, str, list, function1);
                break;
            case 3:
                ((Integer) obj2).getClass();
                CurrentDeliveryOrderOverviewItemKt.d((ProgressStepper) this.e, (StepsToolTip) this.f, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                NearbyStoresSectionUiKt.a((StoreProductAvailabilityData) this.e, (Function1) this.f, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(385));
                break;
            case 5:
                ((Integer) obj2).getClass();
                SavedRecipesScreenKt.e((SavedRecipesViewModel) this.e, (Function0) this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                SavedRecipesScreenKt.c((SavedRecipesViewModel) this.e, (Modifier) this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                SignUpScreenKt.a((SignUpError) this.e, (Function1) this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                VocFreeTextScreenKt.a((VocFreeTextContract.ViewState) this.e, (Function1) this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                CircularProgressIndicatorBoxedKt.a((Modifier) this.e, (PaddingValues) this.f, (Alignment) this.g, (Composer) obj, RecomposeScopeImplKt.a(7));
                break;
            case 10:
                ((Integer) obj2).getClass();
                FullPageErrorContentKt.a((FullPageError) this.e, (Modifier) this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                RewardsInfoBannerUiKt.c((String) this.e, (RewardsInfoBannerData.MessageData) this.f, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                RewardsModalScreenKt.b((RewardsModalScreenData) this.e, (Modifier) this.f, (List) this.g, (Composer) obj, RecomposeScopeImplKt.a(9));
                break;
            case 13:
                ((Integer) obj2).getClass();
                OliveStateKt.d((VoiceSearchState) this.e, (Function0) this.f, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                StandardAlertKt.a((BasicInsetAlertModel) this.e, (Function1) this.f, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(393));
                break;
            case 15:
                ((Integer) obj2).getClass();
                ScrollableListUiKt.a((ScrollableListActionState) this.e, (Function0) this.f, (String) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                BroadcastBannerKt.a((BasicCoreBroadcastBannerModel) this.e, (Function1) this.f, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(385));
                break;
            case 17:
                ((Integer) obj2).getClass();
                DynamicSizeCardKt.a((String) this.e, (String) this.f, (ContentScale) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                CenteredTextKt.a((String) this.e, (TextStyle) this.f, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(3457));
                break;
            case 19:
                ((Integer) obj2).getClass();
                PillKt.a((PillData) this.e, (Modifier) this.f, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.a(57));
                break;
            case 20:
                ((Integer) obj2).getClass();
                ButtonSectionKt.a((ButtonSectionData) this.e, (Function1) this.f, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(393));
                break;
            case 21:
                ((Integer) obj2).getClass();
                ContentCardKt.f((ContentCardData) this.e, (ContentCardTextHeightType) this.f, (ContentCardTextComponentType) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                ContentCardKt.g((String) this.e, (ContentCardTextHeightType) this.f, (ContentCardTextComponentType) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                FullWidthContentCardKt.b((FullWidthContentCardData) this.e, (Function1) this.f, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                ProductReviewAlternativeScreenKt.a((ProductReviewAlternativeResponseData) this.e, (ProductsReviewAlternativeCallbacks) this.f, (ComposableLambdaImpl) this.g, (Composer) obj, RecomposeScopeImplKt.a(385));
                break;
            case 25:
                ((Integer) obj2).getClass();
                ProductSubstituteRowKt.b((CheckoutProductSubstitutionPreference) this.e, (Function1) this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                ProductSubstituteItemKt.b((List) this.e, (Map) this.f, (Function2) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                RewardsQuantitySelectorModalKt.a((ModalBottomSheetData.RewardsQuantitySelector) this.e, (HorizontalSelectorViewListener) this.f, (Function3) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                TimeSelectorErrorScreenKt.a((TimeSelectorContract.TimeSelectorErrorState) this.e, (Function0) this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            default:
                ((Integer) obj2).getClass();
                OnboardingBottomSheetKt.b((Function0) this.e, (Function0) this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
