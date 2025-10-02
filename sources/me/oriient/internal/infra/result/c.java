package me.oriient.internal.infra.result;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class c extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f24983a;
    public /* synthetic */ Object b;
    public int c;

    public c(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        Object objM355onSuccessSuspendcztIqUw = OperationResultKt.m355onSuccessSuspendcztIqUw(null, null, this);
        return objM355onSuccessSuspendcztIqUw == CoroutineSingletons.d ? objM355onSuccessSuspendcztIqUw : OperationResult.m338boximpl(objM355onSuccessSuspendcztIqUw);
    }
}
