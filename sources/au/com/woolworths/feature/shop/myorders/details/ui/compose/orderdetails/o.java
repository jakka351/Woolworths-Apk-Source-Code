package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.shop.checkout.ui.components.compose.ProductSubstituteRowKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ int i;

    public /* synthetic */ o(String str, String str2, String str3, Function0 function0, int i, int i2) {
        this.d = i2;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = function0;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                OrderProofOfDeliveryFullScreenKt.a(this.e, this.f, this.g, this.h, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ProductSubstituteRowKt.a(this.e, this.f, this.g, this.h, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1));
                break;
        }
        return Unit.f24250a;
    }
}
