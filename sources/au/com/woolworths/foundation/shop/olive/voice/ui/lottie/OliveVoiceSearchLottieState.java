package au.com.woolworths.foundation.shop.olive.voice.ui.lottie;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/ui/lottie/OliveVoiceSearchLottieState;", "", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class OliveVoiceSearchLottieState {

    /* renamed from: a, reason: collision with root package name */
    public final float f8855a;
    public final MutableState b;

    public OliveVoiceSearchLottieState(float f, OliveVoiceSearchLottiePhase oliveVoiceSearchLottiePhase) {
        this.f8855a = f;
        this.b = SnapshotStateKt.f(oliveVoiceSearchLottiePhase);
    }

    public final OliveVoiceSearchLottiePhase a() {
        return (OliveVoiceSearchLottiePhase) ((SnapshotMutableStateImpl) this.b).getD();
    }
}
