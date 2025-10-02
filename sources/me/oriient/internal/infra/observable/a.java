package me.oriient.internal.infra.observable;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class a extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24967a;
    public final /* synthetic */ FlowObservableEvent b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FlowObservableEvent flowObservableEvent, Continuation continuation) {
        super(continuation);
        this.b = flowObservableEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24967a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.observe(null, this);
    }
}
