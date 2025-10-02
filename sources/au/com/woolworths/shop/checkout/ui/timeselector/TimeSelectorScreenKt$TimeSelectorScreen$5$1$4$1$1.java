package au.com.woolworths.shop.checkout.ui.timeselector;

import au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class TimeSelectorScreenKt$TimeSelectorScreen$5$1$4$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MutableStateFlow mutableStateFlow = ((TimeSelectorViewModel) this.receiver).i;
        mutableStateFlow.setValue(TimeSelectorContract.ViewState.a((TimeSelectorContract.ViewState) mutableStateFlow.getValue(), null, null, null, null, null, 63));
        return Unit.f24250a;
    }
}
