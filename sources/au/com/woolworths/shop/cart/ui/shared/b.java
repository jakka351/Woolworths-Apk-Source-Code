package au.com.woolworths.shop.cart.ui.shared;

import androidx.compose.runtime.MutableState;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantityInfo;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ double e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ b(double d, Object obj, Object obj2, int i) {
        this.d = i;
        this.e = d;
        this.f = obj;
        this.g = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                CartProductQuantityInfo cartProductQuantityInfo = (CartProductQuantityInfo) this.f;
                Function1 function1 = (Function1) this.g;
                BigDecimal bigDecimalSubtract = new BigDecimal(String.valueOf(this.e)).subtract(new BigDecimal(String.valueOf(cartProductQuantityInfo.c)));
                Intrinsics.g(bigDecimalSubtract, "subtract(...)");
                function1.invoke(Double.valueOf(Math.min(cartProductQuantityInfo.b, bigDecimalSubtract.doubleValue())));
                break;
            case 1:
                CartProductQuantityInfo cartProductQuantityInfo2 = (CartProductQuantityInfo) this.f;
                Function1 function12 = (Function1) this.g;
                BigDecimal bigDecimalAdd = new BigDecimal(String.valueOf(this.e)).add(new BigDecimal(String.valueOf(cartProductQuantityInfo2.c)));
                Intrinsics.g(bigDecimalAdd, "add(...)");
                function12.invoke(Double.valueOf(bigDecimalAdd.doubleValue()));
                break;
            default:
                Function0 function0 = (Function0) this.f;
                MutableState mutableState = (MutableState) this.g;
                if (this.e == 0.0d) {
                    mutableState.setValue(Boolean.TRUE);
                }
                function0.invoke();
                break;
        }
        return Unit.f24250a;
    }
}
