package au.com.woolworths.foundation.shop.olive.voice.ui.search;

import androidx.compose.runtime.MutableState;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchError;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.shop.olive.voice.ui.search.OliveVoiceSearchScreenKt$SearchScreen$1$1", f = "OliveVoiceSearchScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class OliveVoiceSearchScreenKt$SearchScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ VoiceSearchState p;
    public final /* synthetic */ Function1 q;
    public final /* synthetic */ MutableState r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OliveVoiceSearchScreenKt$SearchScreen$1$1(VoiceSearchState voiceSearchState, Function1 function1, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.p = voiceSearchState;
        this.q = function1;
        this.r = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OliveVoiceSearchScreenKt$SearchScreen$1$1(this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        OliveVoiceSearchScreenKt$SearchScreen$1$1 oliveVoiceSearchScreenKt$SearchScreen$1$1 = (OliveVoiceSearchScreenKt$SearchScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        oliveVoiceSearchScreenKt$SearchScreen$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        VoiceSearchState voiceSearchState = this.p;
        if (voiceSearchState instanceof VoiceSearchState.Failure) {
            VoiceSearchError voiceSearchError = ((VoiceSearchState.Failure) voiceSearchState).f8831a;
            if (!voiceSearchError.b()) {
                MutableState mutableState = this.r;
                mutableState.setValue(Integer.valueOf(((Number) mutableState.getD()).intValue() + 1));
                if (((Number) mutableState.getD()).intValue() >= 3) {
                    this.q.invoke(voiceSearchError);
                }
            }
        }
        return Unit.f24250a;
    }
}
