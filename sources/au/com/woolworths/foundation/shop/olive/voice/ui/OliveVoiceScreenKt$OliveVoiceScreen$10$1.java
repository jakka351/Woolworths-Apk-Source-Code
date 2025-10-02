package au.com.woolworths.foundation.shop.olive.voice.ui;

import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceContract;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class OliveVoiceScreenKt$OliveVoiceScreen$10$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        MutableStateFlow mutableStateFlow = ((OliveVoiceViewModel) this.receiver).l;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, OliveVoiceContract.ViewState.Onboarding.f8800a));
        return Unit.f24250a;
    }
}
