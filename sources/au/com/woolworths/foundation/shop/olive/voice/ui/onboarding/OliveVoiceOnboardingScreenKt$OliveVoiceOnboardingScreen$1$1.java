package au.com.woolworths.foundation.shop.olive.voice.ui.onboarding;

import android.content.Context;
import android.speech.SpeechRecognizer;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.shop.olive.voice.ui.onboarding.OliveVoiceOnboardingScreenKt$OliveVoiceOnboardingScreen$1$1", f = "OliveVoiceOnboardingScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class OliveVoiceOnboardingScreenKt$OliveVoiceOnboardingScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Context p;
    public final /* synthetic */ MutableState q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OliveVoiceOnboardingScreenKt$OliveVoiceOnboardingScreen$1$1(Context context, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.p = context;
        this.q = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OliveVoiceOnboardingScreenKt$OliveVoiceOnboardingScreen$1$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        OliveVoiceOnboardingScreenKt$OliveVoiceOnboardingScreen$1$1 oliveVoiceOnboardingScreenKt$OliveVoiceOnboardingScreen$1$1 = (OliveVoiceOnboardingScreenKt$OliveVoiceOnboardingScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        oliveVoiceOnboardingScreenKt$OliveVoiceOnboardingScreen$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        if (!SpeechRecognizer.isRecognitionAvailable(this.p)) {
            this.q.setValue(Boolean.TRUE);
        }
        return Unit.f24250a;
    }
}
