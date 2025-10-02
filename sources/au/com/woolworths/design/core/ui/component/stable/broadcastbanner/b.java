package au.com.woolworths.design.core.ui.component.stable.broadcastbanner;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerSpec;
import au.com.woolworths.feature.shared.force.upgrade.ConfigActionContract;
import au.com.woolworths.feature.shared.force.upgrade.ui.ConfigActionScreenKt;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsContract;
import au.com.woolworths.feature.shop.myorders.details.models.DriverRating;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.DriverRatingSectionItemKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.YourGroceriesListKt;
import au.com.woolworths.product.composeui.ProductCardButtonsVerticalKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.ui.ProductCardButtonsState;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Function i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Function l;
    public final /* synthetic */ Object m;

    public /* synthetic */ b(BroadcastBannerType broadcastBannerType, String str, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, BannerTagSpec bannerTagSpec, Function0 function0, String str2, BroadcastBannerSpec.Action action, int i) {
        this.d = 0;
        this.f = broadcastBannerType;
        this.g = str;
        this.i = composableLambdaImpl;
        this.j = modifier;
        this.k = bannerTagSpec;
        this.l = function0;
        this.h = str2;
        this.m = action;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                BroadcastBannerKt.b((BroadcastBannerType) this.f, (String) this.g, (ComposableLambdaImpl) this.i, (Modifier) this.j, (BannerTagSpec) this.k, (Function0) this.l, (String) this.h, (BroadcastBannerSpec.Action) this.m, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ConfigActionScreenKt.a((ConfigActionContract.ViewState) this.f, (ApplicationType) this.g, (Function1) this.h, (Function2) this.i, (Function2) this.j, (Function2) this.k, (Function1) this.l, (Function2) this.m, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                DriverRatingSectionItemKt.a((OrderDetailsContract.DriverRatingState) this.f, (DriverRating) this.g, (Function1) this.h, (Function1) this.i, (Function1) this.j, (Function1) this.k, (Function1) this.l, (Function1) this.m, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                YourGroceriesListKt.a((List) this.f, (Function1) this.g, (Function1) this.h, (Function1) this.i, (Function1) this.j, (Function2) this.k, (Map) this.m, (Function0) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ProductCardButtonsVerticalKt.a((ProductCard) this.f, (ProductCardButtonsState) this.g, (Function0) this.l, (Function0) this.h, (Function0) this.i, (Function0) this.k, (Function0) this.m, (Modifier) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ b(ProductCard productCard, ProductCardButtonsState productCardButtonsState, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Modifier modifier, int i) {
        this.d = 4;
        this.f = productCard;
        this.g = productCardButtonsState;
        this.l = function0;
        this.h = function02;
        this.i = function03;
        this.k = function04;
        this.m = function05;
        this.j = modifier;
        this.e = i;
    }

    public /* synthetic */ b(Object obj, Object obj2, Function1 function1, Function function, Function function2, Function function3, Function1 function12, Function function4, int i, int i2) {
        this.d = i2;
        this.f = obj;
        this.g = obj2;
        this.h = function1;
        this.i = function;
        this.j = function2;
        this.k = function3;
        this.l = function12;
        this.m = function4;
        this.e = i;
    }

    public /* synthetic */ b(List list, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function2 function2, Map map, Function0 function0, int i) {
        this.d = 3;
        this.f = list;
        this.g = function1;
        this.h = function12;
        this.i = function13;
        this.j = function14;
        this.k = function2;
        this.m = map;
        this.l = function0;
        this.e = i;
    }
}
