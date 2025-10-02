package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.services.retryOperation.RetryOperation;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.realtime.ips.PositioningKotlinHelper;

/* loaded from: classes8.dex */
public final class A3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25910a;
    public final /* synthetic */ PositioningKotlinHelper b;
    public final /* synthetic */ IPSError c;
    public final /* synthetic */ RetryOperation d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A3(PositioningKotlinHelper positioningKotlinHelper, IPSError iPSError, RetryOperation retryOperation, Continuation continuation) {
        super(2, continuation);
        this.b = positioningKotlinHelper;
        this.c = iPSError;
        this.d = retryOperation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new A3(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((A3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25910a;
        if (i == 0) {
            ResultKt.b(obj);
            PositioningKotlinHelper.access$getLogger(this.b).d("PositioningKotlinHelper", "startPositioning try onError() called");
            this.b.e = this.c;
            RetryOperation retryOperation = this.d;
            this.f25910a = 1;
            if (retryOperation.operationFailed(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
