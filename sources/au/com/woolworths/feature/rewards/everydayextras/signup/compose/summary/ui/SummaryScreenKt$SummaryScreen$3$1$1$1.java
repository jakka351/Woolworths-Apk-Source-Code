package au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui;

import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class SummaryScreenKt$SummaryScreen$3$1$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        EverydayExtraSummaryViewModel everydayExtraSummaryViewModel = (EverydayExtraSummaryViewModel) this.receiver;
        everydayExtraSummaryViewModel.n.f(EverydayExtraSummaryContract.Action.ClearWPayFramesForm.f6120a);
        MutableStateFlow mutableStateFlow = everydayExtraSummaryViewModel.p;
        EverydayExtraSummaryContract.ViewState viewState = (EverydayExtraSummaryContract.ViewState) mutableStateFlow.getValue();
        if (viewState instanceof EverydayExtraSummaryContract.ViewState.Content) {
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, EverydayExtraSummaryContract.ViewState.Content.c((EverydayExtraSummaryContract.ViewState.Content) viewState, null, false, null, null, null, false, false, false, null, null, 1007)));
        }
        return Unit.f24250a;
    }
}
