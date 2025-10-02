package au.com.woolworths.feature.shop.homepage.presentation.rewards;

import androidx.compose.runtime.MutableState;
import au.com.woolworths.foundation.shop.olive.voice.ui.lottie.GlowMaskCoverLottiePhase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState f;

    public /* synthetic */ e(MutableState mutableState, MutableState mutableState2, int i) {
        this.d = i;
        this.e = mutableState;
        this.f = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                Boolean bool = Boolean.FALSE;
                this.e.setValue(bool);
                this.f.setValue(bool);
                break;
            default:
                this.e.setValue(Boolean.TRUE);
                this.f.setValue(GlowMaskCoverLottiePhase.Contract.f8843a);
                break;
        }
        return Unit.f24250a;
    }
}
