package au.com.woolworths.feature.product.list.compose.filter;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.feature.product.list.ProductListOptionsContract;
import au.com.woolworths.feature.product.list.legacy.ProductListOptionsContract;
import au.com.woolworths.feature.shop.myorders.details.models.CurrentPickupOrderOverview;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.CurrentPickupOrderOverviewItemKt;
import au.com.woolworths.shop.checkout.ui.substitution.SubstitutionContract;
import au.com.woolworths.shop.checkout.ui.substitution.component.PreferenceOptionSectionKt;
import au.com.woolworths.shop.checkout.ui.substitution.component.SubstitutionScreenKt;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Function l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ i(ButtonApiData buttonApiData, ButtonApiData buttonApiData2, ButtonApiData buttonApiData3, ButtonApiData buttonApiData4, Function1 function1, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i) {
        this.d = 3;
        this.n = buttonApiData;
        this.f = buttonApiData2;
        this.g = buttonApiData3;
        this.k = buttonApiData4;
        this.e = function1;
        this.h = function0;
        this.i = function02;
        this.j = function03;
        this.l = function04;
        this.m = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ProductListOptionsScreenKt.a((ProductListOptionsContract.ViewState) this.n, this.e, (Function1) this.f, (Function1) this.g, this.h, (Function0) this.i, (Function0) this.j, (Function1) this.k, (Function0) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.m | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.product.list.legacy.compose.filter.ProductListOptionsScreenKt.a((ProductListOptionsContract.ViewState) this.n, this.e, (Function1) this.f, (Function1) this.g, this.h, (Function0) this.i, (Function0) this.j, (Function1) this.k, (Function0) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.m | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                CurrentPickupOrderOverviewItemKt.d((CurrentPickupOrderOverview) this.n, this.e, (Function2) this.g, (Function1) this.f, this.h, (Function0) this.i, (Function0) this.j, (Function0) this.l, (Function0) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.m | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                CurrentPickupOrderOverviewItemKt.c((ButtonApiData) this.n, (ButtonApiData) this.f, (ButtonApiData) this.g, (ButtonApiData) this.k, this.e, this.h, (Function0) this.i, (Function0) this.j, (Function0) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.m | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                PreferenceOptionSectionKt.b((String) this.n, (InsetBannerData) this.f, (List) this.g, (String) this.k, this.e, (List) this.i, (Map) this.j, (Function2) this.l, this.h, (Composer) obj, RecomposeScopeImplKt.a(this.m | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                SubstitutionScreenKt.a((SubstitutionContract.ViewState) this.n, (Flow) this.g, this.e, this.h, (Function2) this.k, (Function0) this.i, (Function0) this.j, (Function1) this.f, (Function0) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.m | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ i(CurrentPickupOrderOverview currentPickupOrderOverview, Function1 function1, Function2 function2, Function1 function12, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i) {
        this.d = 2;
        this.n = currentPickupOrderOverview;
        this.e = function1;
        this.g = function2;
        this.f = function12;
        this.h = function0;
        this.i = function02;
        this.j = function03;
        this.l = function04;
        this.k = function05;
        this.m = i;
    }

    public /* synthetic */ i(SubstitutionContract.ViewState viewState, Flow flow, Function1 function1, Function0 function0, Function2 function2, Function0 function02, Function0 function03, Function1 function12, Function0 function04, int i) {
        this.d = 5;
        this.n = viewState;
        this.g = flow;
        this.e = function1;
        this.h = function0;
        this.k = function2;
        this.i = function02;
        this.j = function03;
        this.f = function12;
        this.l = function04;
        this.m = i;
    }

    public /* synthetic */ i(Object obj, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Function0 function02, Function0 function03, Function1 function14, Function0 function04, int i, int i2) {
        this.d = i2;
        this.n = obj;
        this.e = function1;
        this.f = function12;
        this.g = function13;
        this.h = function0;
        this.i = function02;
        this.j = function03;
        this.k = function14;
        this.l = function04;
        this.m = i;
    }

    public /* synthetic */ i(String str, InsetBannerData insetBannerData, List list, String str2, Function1 function1, List list2, Map map, Function2 function2, Function0 function0, int i) {
        this.d = 4;
        this.n = str;
        this.f = insetBannerData;
        this.g = list;
        this.k = str2;
        this.e = function1;
        this.i = list2;
        this.j = map;
        this.l = function2;
        this.h = function0;
        this.m = i;
    }
}
