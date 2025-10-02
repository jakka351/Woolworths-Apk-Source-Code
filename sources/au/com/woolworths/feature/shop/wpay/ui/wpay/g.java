package au.com.woolworths.feature.shop.wpay.ui.wpay;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContentKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Throwable e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ int g;

    public /* synthetic */ g(Throwable th, Function0 function0, int i, int i2) {
        this.d = i2;
        this.e = th;
        this.f = function0;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                WPayForOrderContentKt.b(this.e, this.f, composer, RecomposeScopeImplKt.a(this.g | 1));
                break;
            default:
                PaymentContentKt.b(this.e, this.f, composer, RecomposeScopeImplKt.a(this.g | 1));
                break;
        }
        return Unit.f24250a;
    }
}
