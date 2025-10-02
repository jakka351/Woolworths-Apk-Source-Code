package au.com.woolworths.design.core.ui.component.stable.loadingbutton;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec;
import au.com.woolworths.feature.rewards.offers.ProductOfferTile;
import au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.OfferCarouselViewKt;
import au.com.woolworths.feature.shop.brandedshop.ViewState;
import au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopHomeKt;
import au.com.woolworths.feature.shop.bundles.BundlesViewModel;
import au.com.woolworths.feature.shop.bundles.ui.BundlesScreenKt;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferTileKt;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.shop.cart.ui.CartOptionsBottomSheetKt;
import au.com.woolworths.shop.checkout.ui.compose.FulfilmentSelectionOptionsUiKt;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Function h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ a(ProductOfferTile productOfferTile, boolean z, Function1 function1, Function1 function12, Function2 function2, Function1 function13, int i) {
        this.d = 1;
        this.f = productOfferTile;
        this.e = z;
        this.g = function1;
        this.h = function12;
        this.i = function2;
        this.j = function13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(3073);
                SecondaryLoadingButtonKt.a((String) this.f, (Function0) this.h, this.e, (Modifier) this.i, (String) this.g, (ButtonSpec.Size) this.j, (Composer) obj, iA);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(1);
                OfferCarouselViewKt.b((ProductOfferTile) this.f, this.e, (Function1) this.g, (Function1) this.h, (Function2) this.i, (Function1) this.j, (Composer) obj, iA2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iA3 = RecomposeScopeImplKt.a(1);
                BrandedShopHomeKt.a((ViewState) this.f, this.e, (ProductClickListener) this.g, (Function1) this.h, (Function1) this.j, (Modifier) this.i, (Composer) obj, iA3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iA4 = RecomposeScopeImplKt.a(1);
                BundlesScreenKt.a(this.e, (BundlesViewModel) this.f, (Function0) this.h, (Function0) this.g, (Function1) this.i, (Function1) this.j, (Composer) obj, iA4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iA5 = RecomposeScopeImplKt.a(1);
                RewardsOfferTileKt.c((RewardsOfferData) this.f, (StatefulButtonState) this.g, this.e, (Function2) this.h, (Function1) this.j, (Modifier) this.i, (Composer) obj, iA5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iA6 = RecomposeScopeImplKt.a(1);
                CartOptionsBottomSheetKt.a(this.e, (String) this.f, (au.com.woolworths.shop.cart.ui.cart.a) this.i, (String) this.g, (au.com.woolworths.shop.cart.ui.cart.a) this.j, (Function0) this.h, (Composer) obj, iA6);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA7 = RecomposeScopeImplKt.a(1);
                FulfilmentSelectionOptionsUiKt.c((String) this.f, this.e, (List) this.g, (Function0) this.h, (Function1) this.j, (Modifier) this.i, (Composer) obj, iA7);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(RewardsOfferData rewardsOfferData, StatefulButtonState statefulButtonState, boolean z, Function2 function2, Function1 function1, Modifier modifier, int i) {
        this.d = 4;
        this.f = rewardsOfferData;
        this.g = statefulButtonState;
        this.e = z;
        this.h = function2;
        this.j = function1;
        this.i = modifier;
    }

    public /* synthetic */ a(Object obj, boolean z, Object obj2, Function function, Function1 function1, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.f = obj;
        this.e = z;
        this.g = obj2;
        this.h = function;
        this.j = function1;
        this.i = modifier;
    }

    public /* synthetic */ a(String str, Function0 function0, boolean z, Modifier modifier, String str2, ButtonSpec.Size size, int i) {
        this.d = 0;
        this.f = str;
        this.h = function0;
        this.e = z;
        this.i = modifier;
        this.g = str2;
        this.j = size;
    }

    public /* synthetic */ a(boolean z, BundlesViewModel bundlesViewModel, Function0 function0, Function0 function02, Function1 function1, Function1 function12, int i) {
        this.d = 3;
        this.e = z;
        this.f = bundlesViewModel;
        this.h = function0;
        this.g = function02;
        this.i = function1;
        this.j = function12;
    }

    public /* synthetic */ a(boolean z, String str, au.com.woolworths.shop.cart.ui.cart.a aVar, String str2, au.com.woolworths.shop.cart.ui.cart.a aVar2, Function0 function0, int i) {
        this.d = 5;
        this.e = z;
        this.f = str;
        this.i = aVar;
        this.g = str2;
        this.j = aVar2;
        this.h = function0;
    }
}
