package me.oriient.internal.infra.observable;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class c extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24969a;
    public final /* synthetic */ FlowObservableProperty b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FlowObservableProperty flowObservableProperty, Continuation continuation) {
        super(continuation);
        this.b = flowObservableProperty;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24969a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.observe(null, this);
    }
}
