package au.com.woolworths.feature.shop.shippingcalculator;

import au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.StringsKt;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ShippingCalculatorActivity$setViewContent$1$1$3$1 extends FunctionReferenceImpl implements Function2<String, String, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        ShippingCalculatorViewModel shippingCalculatorViewModel = (ShippingCalculatorViewModel) this.receiver;
        if (str != null) {
            shippingCalculatorViewModel.getClass();
            if (str.length() != 0 && str2 != null && !StringsKt.D(str2)) {
                shippingCalculatorViewModel.e.d(str, str2);
            }
        }
        shippingCalculatorViewModel.i.f(ShippingCalculatorContract.Action.Finish.f8097a);
        return Unit.f24250a;
    }
}
