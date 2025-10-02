package me.oriient.internal.services.retryOperation;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes7.dex */
public final class d implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f25546a;
    public final /* synthetic */ RetryOperation b;

    public d(Ref.BooleanRef booleanRef, RetryOperation retryOperation) {
        this.f25546a = booleanRef;
        this.b = retryOperation;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        JobKt.e(continuation.getE());
        Ref.BooleanRef booleanRef = this.f25546a;
        if (!booleanRef.d && zBooleanValue) {
            booleanRef.d = true;
            this.b.getLogger().d("RetryOperation", "startImpl: Has connection - trying...");
            Object objInvoke = this.b.operation.invoke(this.b, continuation);
            if (objInvoke == CoroutineSingletons.d) {
                return objInvoke;
            }
        }
        return Unit.f24250a;
    }
}
