package au.com.woolworths.feature.rewards.card.unlock;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.experimental.coachmark.CoachMarkState;
import au.com.woolworths.feature.shop.contentpage.ui.VideoAdUnitContentUiKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapScreenKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.DirectionAndDistanceIndicatorData;
import au.com.woolworths.foundation.rewards.common.ui.buttons.FilterSelectorKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.models.VideoAdUnitCarousel;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.rewards.base.data.RewardsRedemptionUnlockConfirmation;
import au.com.woolworths.shop.buyagain.ui.composable.FilterChipsKt;
import au.com.woolworths.shop.cart.domain.model.PageResult;
import au.com.woolworths.shop.cart.ui.CartOptionsBottomSheetKt;
import au.com.woolworths.shop.cart.ui.productreview.ProductReviewScreenKt;
import au.com.woolworths.shop.cart.ui.productreview.ProductsReviewCallbacks;
import au.com.woolworths.shop.checkout.ui.components.compose.ProductSubstituteRowKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ a(InstoreMapCallbacks instoreMapCallbacks, InstoreMapContract.ViewState.MapData mapData, InstoreMapContract.ViewState.Content content, boolean z, Modifier modifier, int i) {
        this.d = 2;
        this.g = instoreMapCallbacks;
        this.h = mapData;
        this.i = content;
        this.e = z;
        this.j = modifier;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                UnlockChristmasFundBottomSheetKt.b((RewardsRedemptionUnlockConfirmation) this.g, this.e, (Function0) this.h, (Function0) this.i, (Modifier) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                VideoAdUnitContentUiKt.a((VideoAdUnitCarousel) this.g, (ProductCardConfig) this.h, (ProductClickListener) this.i, (List) this.j, this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                InstoreMapScreenKt.e((InstoreMapCallbacks) this.g, (InstoreMapContract.ViewState.MapData) this.h, (InstoreMapContract.ViewState.Content) this.i, this.e, (Modifier) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                InstoreMapScreenKt.l((ProductCard) this.g, (DirectionAndDistanceIndicatorData) this.i, this.e, (Function0) this.h, (Modifier) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                FilterSelectorKt.a((String) this.g, this.e, (Function0) this.h, (String) this.i, (Modifier) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                FilterChipsKt.a((List) this.g, (Function1) this.h, this.e, (CoachMarkState) this.i, (Modifier) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                CartOptionsBottomSheetKt.b(this.e, (String) this.g, (Function0) this.h, (String) this.j, (Function0) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ProductReviewScreenKt.c(this.e, (PageResult) this.g, (ProductsReviewCallbacks) this.j, (Function0) this.h, (Function0) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ProductSubstituteRowKt.c(this.e, (Function1) this.g, (String) this.i, (String) this.j, (Function0) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(ProductCard productCard, DirectionAndDistanceIndicatorData directionAndDistanceIndicatorData, boolean z, Function0 function0, Modifier modifier, int i) {
        this.d = 3;
        this.g = productCard;
        this.i = directionAndDistanceIndicatorData;
        this.e = z;
        this.h = function0;
        this.j = modifier;
        this.f = i;
    }

    public /* synthetic */ a(VideoAdUnitCarousel videoAdUnitCarousel, ProductCardConfig productCardConfig, ProductClickListener productClickListener, List list, boolean z, int i) {
        this.d = 1;
        this.g = videoAdUnitCarousel;
        this.h = productCardConfig;
        this.i = productClickListener;
        this.j = list;
        this.e = z;
        this.f = i;
    }

    public /* synthetic */ a(Object obj, boolean z, Function0 function0, Object obj2, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.g = obj;
        this.e = z;
        this.h = function0;
        this.i = obj2;
        this.j = modifier;
        this.f = i;
    }

    public /* synthetic */ a(List list, Function1 function1, boolean z, CoachMarkState coachMarkState, Modifier modifier, int i) {
        this.d = 5;
        this.g = list;
        this.h = function1;
        this.e = z;
        this.i = coachMarkState;
        this.j = modifier;
        this.f = i;
    }

    public /* synthetic */ a(boolean z, PageResult pageResult, ProductsReviewCallbacks productsReviewCallbacks, Function0 function0, Function0 function02, int i) {
        this.d = 7;
        this.e = z;
        this.g = pageResult;
        this.j = productsReviewCallbacks;
        this.h = function0;
        this.i = function02;
        this.f = i;
    }

    public /* synthetic */ a(boolean z, String str, Function0 function0, String str2, Function0 function02, int i) {
        this.d = 6;
        this.e = z;
        this.g = str;
        this.h = function0;
        this.j = str2;
        this.i = function02;
        this.f = i;
    }

    public /* synthetic */ a(boolean z, Function1 function1, String str, String str2, Function0 function0, int i) {
        this.d = 8;
        this.e = z;
        this.g = function1;
        this.i = str;
        this.j = str2;
        this.h = function0;
        this.f = i;
    }
}
