package au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui;

import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class SummaryScreenKt$SummaryScreen$3$1$3$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        EverydayExtraSummaryViewModel everydayExtraSummaryViewModel = (EverydayExtraSummaryViewModel) this.receiver;
        EverydayExtraSummaryContract.ViewState viewState = (EverydayExtraSummaryContract.ViewState) everydayExtraSummaryViewModel.p.getValue();
        MutableStateFlow mutableStateFlow = everydayExtraSummaryViewModel.p;
        if (viewState instanceof EverydayExtraSummaryContract.ViewState.Content) {
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, EverydayExtraSummaryContract.ViewState.Content.c((EverydayExtraSummaryContract.ViewState.Content) viewState, null, false, null, null, null, false, zBooleanValue, false, null, null, 831)));
        }
        return Unit.f24250a;
    }
}
