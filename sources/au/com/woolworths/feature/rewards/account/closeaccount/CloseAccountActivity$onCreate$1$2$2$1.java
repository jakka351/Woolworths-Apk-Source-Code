package au.com.woolworths.feature.rewards.account.closeaccount;

import au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class CloseAccountActivity$onCreate$1$2$2$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object objB;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        MutableStateFlow mutableStateFlow = ((CloseAccountViewModel) this.receiver).f;
        do {
            value = mutableStateFlow.getValue();
            objB = (CloseAccountContract.ViewState) value;
            if (objB instanceof CloseAccountContract.ViewState.ConsentPage) {
                objB = CloseAccountContract.ViewState.ConsentPage.b((CloseAccountContract.ViewState.ConsentPage) objB, zBooleanValue, false, 5);
            }
        } while (!mutableStateFlow.d(value, objB));
        return Unit.f24250a;
    }
}
