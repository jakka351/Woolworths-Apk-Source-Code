package au.com.woolworths.feature.shop.storelocator.legacy.pickup.details;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ StoreDetailsContract.ViewState e;

    public /* synthetic */ b(StoreDetailsContract.ViewState viewState, int i, int i2) {
        this.d = i2;
        this.e = viewState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                StoreDetailsScreenKt.c(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            default:
                StoreDetailsScreenKt.l(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
