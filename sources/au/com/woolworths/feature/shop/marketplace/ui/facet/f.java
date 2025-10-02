package au.com.woolworths.feature.shop.marketplace.ui.facet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.shop.cart.ui.productreview.LoadingScreenKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function2 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Function g;

    public /* synthetic */ f(int i, int i2, Function1 function1) {
        this.e = i;
        this.g = function1;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(this.f | 1);
                FacetSearchBarKt.a(this.e, (Function1) this.g, (Composer) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                LoadingScreenKt.a((Function3) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1), this.f);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ f(Function3 function3, int i, int i2) {
        this.g = function3;
        this.e = i;
        this.f = i2;
    }
}
