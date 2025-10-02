package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ int g;

    public /* synthetic */ e(String str, Function2 function2, int i, int i2) {
        this.d = i2;
        this.e = str;
        this.f = function2;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                CurrentDeliveryOrderOverviewItemKt.e(RecomposeScopeImplKt.a(this.g | 1), composer, this.e, this.f);
                break;
            case 1:
                CurrentDeliveryOrderOverviewItemKt.g(RecomposeScopeImplKt.a(this.g | 1), composer, this.e, this.f);
                break;
            case 2:
                CurrentPickupOrderOverviewItemKt.f(RecomposeScopeImplKt.a(this.g | 1), composer, this.e, this.f);
                break;
            default:
                CurrentPickupOrderOverviewItemKt.e(RecomposeScopeImplKt.a(this.g | 1), composer, this.e, this.f);
                break;
        }
        return Unit.f24250a;
    }
}
