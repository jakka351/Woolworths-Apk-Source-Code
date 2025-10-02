package me.oriient.internal.infra.utils.core;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class h extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public SingleInstanceExecutor f25007a;
    public /* synthetic */ Object b;
    public final /* synthetic */ SingleInstanceExecutor c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SingleInstanceExecutor singleInstanceExecutor, Continuation continuation) {
        super(continuation);
        this.c = singleInstanceExecutor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.run(null, this);
    }
}
