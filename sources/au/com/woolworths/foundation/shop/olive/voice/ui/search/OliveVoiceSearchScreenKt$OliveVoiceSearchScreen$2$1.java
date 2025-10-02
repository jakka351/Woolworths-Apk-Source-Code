package au.com.woolworths.foundation.shop.olive.voice.ui.search;

import com.google.accompanist.permissions.PermissionState;
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
@DebugMetadata(c = "au.com.woolworths.foundation.shop.olive.voice.ui.search.OliveVoiceSearchScreenKt$OliveVoiceSearchScreen$2$1", f = "OliveVoiceSearchScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class OliveVoiceSearchScreenKt$OliveVoiceSearchScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ PermissionState p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OliveVoiceSearchScreenKt$OliveVoiceSearchScreen$2$1(PermissionState permissionState, Continuation continuation) {
        super(2, continuation);
        this.p = permissionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OliveVoiceSearchScreenKt$OliveVoiceSearchScreen$2$1(this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        OliveVoiceSearchScreenKt$OliveVoiceSearchScreen$2$1 oliveVoiceSearchScreenKt$OliveVoiceSearchScreen$2$1 = (OliveVoiceSearchScreenKt$OliveVoiceSearchScreen$2$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        oliveVoiceSearchScreenKt$OliveVoiceSearchScreen$2$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.p.a();
        return Unit.f24250a;
    }
}
