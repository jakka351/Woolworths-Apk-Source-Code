package au.com.woolworths.feature.rewards.account.settings.v2;

import au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class AccountSettingsActivity$onCreate$1$2$5$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        MutableStateFlow mutableStateFlow = ((AccountSettingsViewModel) this.receiver).k;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, AccountSettingsContract.ViewState.a((AccountSettingsContract.ViewState) value, false, false, null, null, false, false, false, 191)));
        return Unit.f24250a;
    }
}
