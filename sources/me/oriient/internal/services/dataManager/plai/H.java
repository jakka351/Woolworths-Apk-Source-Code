package me.oriient.internal.services.dataManager.plai;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class H extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public S f25280a;
    public /* synthetic */ Object b;
    public final /* synthetic */ S c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(S s, Continuation continuation) {
        super(continuation);
        this.c = s;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.cleanData(this);
    }
}
