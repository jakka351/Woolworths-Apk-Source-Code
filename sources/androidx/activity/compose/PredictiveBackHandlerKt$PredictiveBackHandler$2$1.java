package androidx.activity.compose;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$2$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PredictiveBackHandlerKt$PredictiveBackHandler$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ PredictiveBackHandlerCallback p;
    public final /* synthetic */ boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PredictiveBackHandlerKt$PredictiveBackHandler$2$1(PredictiveBackHandlerCallback predictiveBackHandlerCallback, boolean z, Continuation continuation) {
        super(2, continuation);
        this.p = predictiveBackHandlerCallback;
        this.q = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PredictiveBackHandlerKt$PredictiveBackHandler$2$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        PredictiveBackHandlerKt$PredictiveBackHandler$2$1 predictiveBackHandlerKt$PredictiveBackHandler$2$1 = (PredictiveBackHandlerKt$PredictiveBackHandler$2$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        predictiveBackHandlerKt$PredictiveBackHandler$2$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OnBackInstance onBackInstance;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        PredictiveBackHandlerCallback predictiveBackHandlerCallback = this.p;
        boolean z = this.q;
        if (!z && !predictiveBackHandlerCallback.g && predictiveBackHandlerCallback.f56a && (onBackInstance = predictiveBackHandlerCallback.f) != null) {
            onBackInstance.a();
        }
        predictiveBackHandlerCallback.i(z);
        return Unit.f24250a;
    }
}
