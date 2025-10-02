package me.oriient.internal.services.retryOperation;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class c extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public RetryOperation f25545a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ RetryOperation d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RetryOperation retryOperation, Continuation continuation) {
        super(continuation);
        this.d = retryOperation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.startImpl$internal_publishRelease(0L, this);
    }
}
