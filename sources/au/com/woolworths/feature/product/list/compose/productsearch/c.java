package au.com.woolworths.feature.product.list.compose.productsearch;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.paging.compose.LazyPagingItems;
import au.com.woolworths.android.onesite.appdata.AppEnvironment;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetState;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationViewModelNew;
import au.com.woolworths.feature.rewards.account.authentication.ui.RewardsSignUpScreenKt;
import au.com.woolworths.feature.rewards.account.authentication.ui.RewardsSignUpWebViewKt;
import au.com.woolworths.feature.shared.web.file.uploader.permission.CameraPermissionActivityKt;
import au.com.woolworths.feature.shared.web.file.uploader.permission.CameraPermissionViewModel;
import au.com.woolworths.feature.shop.brandedshop.BrandedShopViewModel;
import au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopHomeKt;
import au.com.woolworths.feature.shop.bundles.data.BundlesData;
import au.com.woolworths.feature.shop.bundles.data.BundlesProductCardConfig;
import au.com.woolworths.feature.shop.bundles.ui.BundlesPageKt;
import au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingContract;
import au.com.woolworths.feature.shop.catalogue.listing.category.ui.CategoryListingScreenKt;
import au.com.woolworths.feature.shop.countryselector.CountrySelectorViewModel;
import au.com.woolworths.feature.shop.countryselector.ui.CountrySelectorScreenKt;
import au.com.woolworths.feature.shop.homepage.data.RewardsBalanceCardData;
import au.com.woolworths.feature.shop.homepage.presentation.rewards.RewardsBalanceCardUiKt;
import au.com.woolworths.foundation.feature.app.AppIdentifier;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.shop.cart.ui.shared.InfoModalKt;
import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentBottomSheet;
import au.com.woolworths.shop.checkout.ui.content.ModalBottomSheetData;
import au.com.woolworths.shop.checkout.ui.summary.rewards.RewardsQuantitySelectorModalKt;
import au.com.woolworths.shop.checkout.ui.timeselector.compose.suggestedtimeslot.SuggestedTimeSlotsKt;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsDisclaimer;
import au.com.woolworths.shop.lists.ui.substitutions.SimilarProductsScreenKt;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ c(AppEnvironment appEnvironment, Function0 function0, Function3 function3, RewardsAuthenticationViewModelNew rewardsAuthenticationViewModelNew, Function0 function02, Function1 function1, int i) {
        this.d = 1;
        this.h = appEnvironment;
        this.e = function0;
        this.i = function3;
        this.j = rewardsAuthenticationViewModelNew;
        this.f = function02;
        this.g = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                SearchTilesSectionKt.f((Function0) this.e, (Function0) this.f, (Function0) this.h, (Function0) this.i, (Function1) this.g, (Modifier) this.j, (Composer) obj, RecomposeScopeImplKt.a(224695));
                break;
            case 1:
                ((Integer) obj2).getClass();
                RewardsSignUpScreenKt.a((AppEnvironment) this.h, (Function0) this.e, (Function3) this.i, (RewardsAuthenticationViewModelNew) this.j, (Function0) this.f, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                RewardsSignUpWebViewKt.a((String) this.f, (String) this.h, (String) this.i, (AppEnvironment) this.j, (Function0) this.e, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                CameraPermissionActivityKt.a((Function0) this.e, (Function0) this.f, (Function0) this.h, (Function0) this.i, (CameraPermissionViewModel) this.g, (AppIdentifier) this.j, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                BrandedShopHomeKt.d((Function0) this.e, (Function0) this.f, (Function0) this.h, (Function1) this.g, (Function1) this.i, (BrandedShopViewModel) this.j, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                BundlesPageKt.a((Map) this.e, (BundlesProductCardConfig) this.f, (BundlesData) this.h, (Function1) this.g, (LazyPagingItems) this.i, (Modifier) this.j, (Composer) obj, RecomposeScopeImplKt.a(32769));
                break;
            case 6:
                ((Integer) obj2).getClass();
                BundlesPageKt.b((BundlesData) this.e, (Map) this.f, (BundlesProductCardConfig) this.h, (Function1) this.g, (Function1) this.i, (LazyPagingItems) this.j, (Composer) obj, RecomposeScopeImplKt.a(286721));
                break;
            case 7:
                ((Integer) obj2).getClass();
                CategoryListingScreenKt.a((CategoryListingContract.ViewState) this.i, (Function0) this.e, (Function0) this.f, (ProductClickListener) this.j, (Function0) this.h, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                CountrySelectorScreenKt.a((CountrySelectorViewModel) this.j, (Function0) this.e, (Function1) this.g, (Function0) this.f, (Function0) this.h, (Function0) this.i, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                RewardsBalanceCardUiKt.a((RewardsBalanceCardData) this.i, (Function0) this.e, (Function0) this.f, (Function0) this.h, (Modifier) this.j, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                InfoModalKt.a((String) this.h, (String) this.i, (String) this.g, (Function0) this.e, (Function0) this.f, (Modifier) this.j, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                RewardsQuantitySelectorModalKt.b((ModalBottomSheetData.RewardsQuantitySelector) this.f, (HorizontalSelectorViewListener) this.h, (Function0) this.e, (Modifier) this.j, (SheetState) this.i, (Function3) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                SuggestedTimeSlotsKt.a((String) this.e, (FulfilmentBottomSheet) this.f, (List) this.h, (Function1) this.g, (Function1) this.i, (Modifier) this.j, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            default:
                ((Integer) obj2).getClass();
                SimilarProductsScreenKt.o((String) this.f, (Function0) this.e, (Modifier) this.j, (String) this.h, (AlternativeProductsDisclaimer) this.i, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ c(CategoryListingContract.ViewState viewState, Function0 function0, Function0 function02, ProductClickListener productClickListener, Function0 function03, Function1 function1, int i) {
        this.d = 7;
        this.i = viewState;
        this.e = function0;
        this.f = function02;
        this.j = productClickListener;
        this.h = function03;
        this.g = function1;
    }

    public /* synthetic */ c(CountrySelectorViewModel countrySelectorViewModel, Function0 function0, Function1 function1, Function0 function02, Function0 function03, Function0 function04, int i) {
        this.d = 8;
        this.j = countrySelectorViewModel;
        this.e = function0;
        this.g = function1;
        this.f = function02;
        this.h = function03;
        this.i = function04;
    }

    public /* synthetic */ c(RewardsBalanceCardData rewardsBalanceCardData, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, Function1 function1, int i) {
        this.d = 9;
        this.i = rewardsBalanceCardData;
        this.e = function0;
        this.f = function02;
        this.h = function03;
        this.j = modifier;
        this.g = function1;
    }

    public /* synthetic */ c(ModalBottomSheetData.RewardsQuantitySelector rewardsQuantitySelector, HorizontalSelectorViewListener horizontalSelectorViewListener, Function0 function0, Modifier modifier, SheetState sheetState, Function3 function3, int i) {
        this.d = 11;
        this.f = rewardsQuantitySelector;
        this.h = horizontalSelectorViewListener;
        this.e = function0;
        this.j = modifier;
        this.i = sheetState;
        this.g = function3;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Function1 function1, Object obj4, Object obj5, int i, int i2) {
        this.d = i2;
        this.e = obj;
        this.f = obj2;
        this.h = obj3;
        this.g = function1;
        this.i = obj4;
        this.j = obj5;
    }

    public /* synthetic */ c(String str, String str2, String str3, AppEnvironment appEnvironment, Function0 function0, Function1 function1, int i) {
        this.d = 2;
        this.f = str;
        this.h = str2;
        this.i = str3;
        this.j = appEnvironment;
        this.e = function0;
        this.g = function1;
    }

    public /* synthetic */ c(String str, String str2, String str3, Function0 function0, Function0 function02, Modifier modifier, int i) {
        this.d = 10;
        this.h = str;
        this.i = str2;
        this.g = str3;
        this.e = function0;
        this.f = function02;
        this.j = modifier;
    }

    public /* synthetic */ c(String str, Function0 function0, Modifier modifier, String str2, AlternativeProductsDisclaimer alternativeProductsDisclaimer, Function1 function1, int i) {
        this.d = 13;
        this.f = str;
        this.e = function0;
        this.j = modifier;
        this.h = str2;
        this.i = alternativeProductsDisclaimer;
        this.g = function1;
    }

    public /* synthetic */ c(Function0 function0, Function0 function02, Function0 function03, Function0 function04, Object obj, Object obj2, int i, int i2) {
        this.d = i2;
        this.e = function0;
        this.f = function02;
        this.h = function03;
        this.i = function04;
        this.g = obj;
        this.j = obj2;
    }
}
