package au.com.woolworths.shop.cart.ui.cart;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.navigation.NavHostController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Function2 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ CartViewModel f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Object h;

    public /* synthetic */ i(NavHostController navHostController, boolean z, CartViewModel cartViewModel, Function0 function0, int i) {
        this.h = navHostController;
        this.e = z;
        this.f = cartViewModel;
        this.g = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                CartNavHostKt.a((NavHostController) this.h, this.e, this.f, this.g, (Composer) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(1);
                CartScreenKt.a(this.e, this.f, this.g, (Function1) this.h, (Composer) obj, iA2);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ i(boolean z, CartViewModel cartViewModel, Function0 function0, Function1 function1, int i) {
        this.e = z;
        this.f = cartViewModel;
        this.g = function0;
        this.h = function1;
    }
}
