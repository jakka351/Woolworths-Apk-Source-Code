package au.com.woolworths.feature.shop.wpay.ui.wpay;

import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class WPayForOrderScreenKt$WPayForOrderScreen$11$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        WPayForOrderViewModel wPayForOrderViewModel = (WPayForOrderViewModel) this.receiver;
        MutableStateFlow mutableStateFlow = wPayForOrderViewModel.r;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value, null, null, null, null, null, null, null, null, false, null, null, null, null, 6143)));
        wPayForOrderViewModel.s.k(WPayForOrderContract.Action.LaunchCheckoutDetails.f8372a);
        return Unit.f24250a;
    }
}
