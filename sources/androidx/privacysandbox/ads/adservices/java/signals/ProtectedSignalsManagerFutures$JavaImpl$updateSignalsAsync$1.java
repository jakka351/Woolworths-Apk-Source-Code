package androidx.privacysandbox.ads.adservices.java.signals;

import androidx.privacysandbox.ads.adservices.java.signals.ProtectedSignalsManagerFutures;
import androidx.privacysandbox.ads.adservices.signals.UpdateSignalsRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.privacysandbox.ads.adservices.java.signals.ProtectedSignalsManagerFutures$JavaImpl$updateSignalsAsync$1", f = "ProtectedSignalsManagerFutures.kt", l = {111}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ProtectedSignalsManagerFutures$JavaImpl$updateSignalsAsync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ProtectedSignalsManagerFutures.JavaImpl q;
    public final /* synthetic */ UpdateSignalsRequest r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProtectedSignalsManagerFutures$JavaImpl$updateSignalsAsync$1(ProtectedSignalsManagerFutures.JavaImpl javaImpl, UpdateSignalsRequest updateSignalsRequest, Continuation continuation) {
        super(2, continuation);
        this.q = javaImpl;
        this.r = updateSignalsRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProtectedSignalsManagerFutures$JavaImpl$updateSignalsAsync$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ProtectedSignalsManagerFutures$JavaImpl$updateSignalsAsync$1 protectedSignalsManagerFutures$JavaImpl$updateSignalsAsync$1 = (ProtectedSignalsManagerFutures$JavaImpl$updateSignalsAsync$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        protectedSignalsManagerFutures$JavaImpl$updateSignalsAsync$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return Unit.f24250a;
        }
        ResultKt.b(obj);
        Intrinsics.e(null);
        this.p = 1;
        throw null;
    }
}
