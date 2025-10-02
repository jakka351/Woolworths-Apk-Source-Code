package au.com.woolworths.foundation.shop.olive.voice.ui;

import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceInteractorImpl;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceViewModel;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class OliveVoiceScreenKt$OliveVoiceScreen$5$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        OliveVoiceViewModel oliveVoiceViewModel = (OliveVoiceViewModel) this.receiver;
        OliveVoiceInteractorImpl oliveVoiceInteractorImpl = oliveVoiceViewModel.e;
        oliveVoiceViewModel.p6().f("continue");
        if (oliveVoiceViewModel.n) {
            androidx.constraintlayout.core.state.a.v(oliveVoiceInteractorImpl.f8803a.f8804a, "oliveVoiceSearchOnboardingShown", true);
        } else {
            androidx.constraintlayout.core.state.a.v(oliveVoiceInteractorImpl.f8803a.f8804a, "oliveVoiceOnboardingShown", true);
        }
        oliveVoiceViewModel.s6(VoiceSearchState.Listening.f8833a);
        return Unit.f24250a;
    }
}
