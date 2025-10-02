package au.com.woolworths.feature.rewards.card.unlock;

import au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsContractV2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class UnlockChristmasFundBottomSheetKt$UnlockChristmasFundModalBottomSheet$1$6$1$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        MutableStateFlow mutableStateFlow = ((UnlockChristmasFundsViewModelV2) this.receiver).h;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, UnlockChristmasFundsContractV2.ViewState.a((UnlockChristmasFundsContractV2.ViewState) value, null, false, false, false, false, 47)));
        return Unit.f24250a;
    }
}
