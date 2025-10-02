package au.com.woolworths.feature.rewards.offers.listpage.ui;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import au.com.woolworths.foundation.shop.olive.voice.ui.lottie.GlowMaskCoverLottiePhase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;

    public /* synthetic */ e(MutableState mutableState, int i) {
        this.d = i;
        this.e = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.setValue(Boolean.FALSE);
                break;
            case 1:
                this.e.setValue(Boolean.FALSE);
                break;
            case 2:
                this.e.setValue(Boolean.valueOf(!((Boolean) r0.getD()).booleanValue()));
                break;
            case 3:
                this.e.setValue(Boolean.FALSE);
                break;
            case 4:
                this.e.setValue(Boolean.TRUE);
                break;
            case 5:
                this.e.setValue(new TextFieldValue("", 0L, 6));
                break;
            case 6:
                this.e.setValue(Boolean.TRUE);
                break;
            case 7:
                this.e.setValue(Boolean.valueOf(!((Boolean) r0.getD()).booleanValue()));
                break;
            case 8:
                this.e.setValue(Boolean.TRUE);
                break;
            case 9:
                break;
            case 10:
                this.e.setValue(Boolean.FALSE);
                break;
            case 11:
                this.e.setValue(Boolean.TRUE);
                break;
            case 12:
                this.e.setValue(Boolean.FALSE);
                break;
            case 13:
                this.e.setValue(GlowMaskCoverLottiePhase.Expand.f8844a);
                break;
            case 14:
                Boolean bool = (Boolean) this.e.getD();
                bool.getClass();
                break;
            case 15:
                this.e.setValue(Boolean.FALSE);
                break;
            case 16:
                this.e.setValue(Boolean.FALSE);
                break;
            case 17:
                this.e.setValue(Boolean.valueOf(!((Boolean) r0.getD()).booleanValue()));
                break;
            case 18:
                this.e.setValue(Boolean.FALSE);
                break;
            case 19:
                this.e.setValue(Boolean.valueOf(!((Boolean) r0.getD()).booleanValue()));
                break;
            case 20:
                this.e.setValue(null);
                break;
            default:
                this.e.setValue(null);
                break;
        }
        return Unit.f24250a;
    }
}
