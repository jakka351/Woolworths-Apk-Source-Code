package au.com.woolworths.foundation.shop.olive.voice.ui.search;

import androidx.compose.runtime.MutableState;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchError;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchState;
import au.com.woolworths.foundation.shop.olive.voice.ui.dialog.DialogType;
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
@DebugMetadata(c = "au.com.woolworths.foundation.shop.olive.voice.ui.search.OliveVoiceSearchScreenKt$OliveVoiceSearchScreen$3$1", f = "OliveVoiceSearchScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class OliveVoiceSearchScreenKt$OliveVoiceSearchScreen$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ VoiceSearchState p;
    public final /* synthetic */ MutableState q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OliveVoiceSearchScreenKt$OliveVoiceSearchScreen$3$1(VoiceSearchState voiceSearchState, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.p = voiceSearchState;
        this.q = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OliveVoiceSearchScreenKt$OliveVoiceSearchScreen$3$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        OliveVoiceSearchScreenKt$OliveVoiceSearchScreen$3$1 oliveVoiceSearchScreenKt$OliveVoiceSearchScreen$3$1 = (OliveVoiceSearchScreenKt$OliveVoiceSearchScreen$3$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        oliveVoiceSearchScreenKt$OliveVoiceSearchScreen$3$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        VoiceSearchState voiceSearchState = this.p;
        if (voiceSearchState instanceof VoiceSearchState.Failure) {
            VoiceSearchError voiceSearchError = ((VoiceSearchState.Failure) voiceSearchState).f8831a;
            if (voiceSearchError.b()) {
                this.q.setValue(voiceSearchError instanceof VoiceSearchError.InsufficientDeviceLevelPermissions ? DialogType.NoDeviceLevelPermissionDialog.f8840a : voiceSearchError instanceof VoiceSearchError.LanguageNotAvailable ? DialogType.LanguageUnavailableDialog.f8839a : voiceSearchError instanceof VoiceSearchError.UnsupportedLanguage ? DialogType.NoSupportedLanguageDialog.f8842a : null);
            }
        }
        return Unit.f24250a;
    }
}
