package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.data.HorizontalListDataInterface;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionClickListener;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionState;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasLandingFeed;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsViewModel;
import au.com.woolworths.feature.rewards.offers.points.ui.PointsScreenKt;
import au.com.woolworths.feature.shop.homepage.presentation.carousel.ProductCarouselUiKt;
import au.com.woolworths.feature.shop.wpay.ui.addgiftcard.AddGiftCardContentKt;
import au.com.woolworths.feature.shop.wpay.ui.addgiftcard.AddGiftCardContract;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage;
import au.com.woolworths.product.composeui.ProductCardButtonsHorizontalKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.product.ui.ProductCardButtonsState;
import au.com.woolworths.shop.checkout.domain.model.InputTextLimit;
import au.com.woolworths.shop.checkout.ui.components.compose.PreferenceTextUiKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Function2 {
    public final /* synthetic */ int d = 2;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ j(HorizontalListDataInterface horizontalListDataInterface, LazyListState lazyListState, HorizontalListActionState horizontalListActionState, HorizontalListActionClickListener horizontalListActionClickListener, ProductClickListener productClickListener, ProductCardConfig productCardConfig, boolean z, List list, Modifier modifier, int i) {
        this.l = horizontalListDataInterface;
        this.m = lazyListState;
        this.f = horizontalListActionState;
        this.h = horizontalListActionClickListener;
        this.i = productClickListener;
        this.j = productCardConfig;
        this.e = z;
        this.g = list;
        this.n = modifier;
        this.k = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                LandingScreenKt.b(this.e, (EverydayExtrasLandingFeed) this.l, (RewardsServiceMessage) this.m, (Function1) this.f, (Function0) this.g, (Function1) this.h, (Function1) this.i, (Function2) this.n, (Function1) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.k | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                PointsScreenKt.c((RewardsPointsViewModel) this.l, this.e, (Function1) this.f, (Function0) this.g, (Function1) this.h, (Function1) this.i, (Function0) this.m, (Function0) this.n, (Function1) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.k | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ProductCarouselUiKt.a((HorizontalListDataInterface) this.l, (LazyListState) this.m, (HorizontalListActionState) this.f, (HorizontalListActionClickListener) this.h, (ProductClickListener) this.i, (ProductCardConfig) this.j, this.e, (List) this.g, (Modifier) this.n, (Composer) obj, RecomposeScopeImplKt.a(this.k | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                AddGiftCardContentKt.a((AddGiftCardContract.ViewState) this.l, this.e, (String) this.m, (String) this.j, (Function1) this.f, (Function1) this.h, (Function0) this.g, (Function1) this.i, (Modifier) this.n, (Composer) obj, RecomposeScopeImplKt.a(this.k | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ProductCardButtonsHorizontalKt.a((ProductCard) this.l, (ProductCardButtonsState) this.m, (Function0) this.g, (Function0) this.f, (Function0) this.h, (Function0) this.i, (Function0) this.j, this.e, (Modifier) this.n, (Composer) obj, RecomposeScopeImplKt.a(this.k | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                PreferenceTextUiKt.c((String) this.l, (String) this.m, this.e, (InputTextLimit) this.h, (String) this.i, (String) this.j, (String) this.g, (String) this.n, (Function1) this.f, (Composer) obj, RecomposeScopeImplKt.a(this.k | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ j(RewardsPointsViewModel rewardsPointsViewModel, boolean z, Function1 function1, Function0 function0, Function1 function12, Function1 function13, Function0 function02, Function0 function03, Function1 function14, int i) {
        this.l = rewardsPointsViewModel;
        this.e = z;
        this.f = function1;
        this.g = function0;
        this.h = function12;
        this.i = function13;
        this.m = function02;
        this.n = function03;
        this.j = function14;
        this.k = i;
    }

    public /* synthetic */ j(AddGiftCardContract.ViewState viewState, boolean z, String str, String str2, Function1 function1, Function1 function12, Function0 function0, Function1 function13, Modifier modifier, int i) {
        this.l = viewState;
        this.e = z;
        this.m = str;
        this.j = str2;
        this.f = function1;
        this.h = function12;
        this.g = function0;
        this.i = function13;
        this.n = modifier;
        this.k = i;
    }

    public /* synthetic */ j(ProductCard productCard, ProductCardButtonsState productCardButtonsState, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, boolean z, Modifier modifier, int i) {
        this.l = productCard;
        this.m = productCardButtonsState;
        this.g = function0;
        this.f = function02;
        this.h = function03;
        this.i = function04;
        this.j = function05;
        this.e = z;
        this.n = modifier;
        this.k = i;
    }

    public /* synthetic */ j(String str, String str2, boolean z, InputTextLimit inputTextLimit, String str3, String str4, String str5, String str6, Function1 function1, int i) {
        this.l = str;
        this.m = str2;
        this.e = z;
        this.h = inputTextLimit;
        this.i = str3;
        this.j = str4;
        this.g = str5;
        this.n = str6;
        this.f = function1;
        this.k = i;
    }

    public /* synthetic */ j(boolean z, EverydayExtrasLandingFeed everydayExtrasLandingFeed, RewardsServiceMessage rewardsServiceMessage, Function1 function1, Function0 function0, Function1 function12, Function1 function13, Function2 function2, Function1 function14, int i) {
        this.e = z;
        this.l = everydayExtrasLandingFeed;
        this.m = rewardsServiceMessage;
        this.f = function1;
        this.g = function0;
        this.h = function12;
        this.i = function13;
        this.n = function2;
        this.j = function14;
        this.k = i;
    }
}
