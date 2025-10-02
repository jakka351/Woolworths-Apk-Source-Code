package au.com.woolworths.foundation.shop.olive.voice.ui;

import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class OliveVoiceScreenKt$OliveVoiceScreen$9$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        OliveVoiceViewModel oliveVoiceViewModel = (OliveVoiceViewModel) this.receiver;
        oliveVoiceViewModel.p6().g("continue");
        androidx.constraintlayout.core.state.a.v(oliveVoiceViewModel.e.f8803a.f8804a, "oliveVoicePermissionOnboardingShown", true);
        return Unit.f24250a;
    }
}
