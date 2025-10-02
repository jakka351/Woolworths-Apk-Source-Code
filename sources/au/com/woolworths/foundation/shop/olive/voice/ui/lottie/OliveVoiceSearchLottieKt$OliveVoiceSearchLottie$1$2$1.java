package au.com.woolworths.foundation.shop.olive.voice.ui.lottie;

import androidx.compose.runtime.MutableState;
import au.com.woolworths.foundation.shop.olive.voice.ui.lottie.OliveVoiceSearchLottiePhase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.shop.olive.voice.ui.lottie.OliveVoiceSearchLottieKt$OliveVoiceSearchLottie$1$2$1", f = "OliveVoiceSearchLottie.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class OliveVoiceSearchLottieKt$OliveVoiceSearchLottie$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Function0 p;
    public final /* synthetic */ Function0 q;
    public final /* synthetic */ MutableState r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OliveVoiceSearchLottieKt$OliveVoiceSearchLottie$1$2$1(Function0 function0, Function0 function02, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.p = function0;
        this.q = function02;
        this.r = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OliveVoiceSearchLottieKt$OliveVoiceSearchLottie$1$2$1(this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        OliveVoiceSearchLottieKt$OliveVoiceSearchLottie$1$2$1 oliveVoiceSearchLottieKt$OliveVoiceSearchLottie$1$2$1 = (OliveVoiceSearchLottieKt$OliveVoiceSearchLottie$1$2$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        oliveVoiceSearchLottieKt$OliveVoiceSearchLottie$1$2$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        MutableState mutableState = this.r;
        if (((OliveVoiceSearchLottieState) mutableState.getD()).a() instanceof OliveVoiceSearchLottiePhase.Listening) {
            this.p.invoke();
        } else if (((OliveVoiceSearchLottieState) mutableState.getD()).a() instanceof OliveVoiceSearchLottiePhase.ThinkingIntro) {
            this.q.invoke();
        }
        return Unit.f24250a;
    }
}
