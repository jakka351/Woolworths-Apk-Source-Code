package au.com.woolworths.feature.shop.countryselector.ui;

import au.com.woolworths.feature.shop.countryselector.CountrySelectorContract;
import au.com.woolworths.feature.shop.countryselector.CountrySelectorViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class CountrySelectorScreenKt$CountrySelectorScreen$3$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CountrySelectorViewModel countrySelectorViewModel = (CountrySelectorViewModel) this.receiver;
        MutableStateFlow mutableStateFlow = countrySelectorViewModel.g;
        mutableStateFlow.setValue(CountrySelectorContract.ViewState.a((CountrySelectorContract.ViewState) mutableStateFlow.getValue(), null, false, false, 55));
        countrySelectorViewModel.q6();
        return Unit.f24250a;
    }
}
