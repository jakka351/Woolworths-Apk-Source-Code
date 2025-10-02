package me.oriient.internal.infra.result;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class b extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f24982a;
    public /* synthetic */ Object b;
    public int c;

    public b(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        Object objM353onFailureSuspendcztIqUw = OperationResultKt.m353onFailureSuspendcztIqUw(null, null, this);
        return objM353onFailureSuspendcztIqUw == CoroutineSingletons.d ? objM353onFailureSuspendcztIqUw : OperationResult.m338boximpl(objM353onFailureSuspendcztIqUw);
    }
}
