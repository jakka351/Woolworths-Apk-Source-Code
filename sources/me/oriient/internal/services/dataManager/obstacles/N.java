package me.oriient.internal.services.dataManager.obstacles;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class N extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public U f25239a;
    public C1349u b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ U e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(U u, Continuation continuation) {
        super(continuation);
        this.e = u;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.fetchData((C1349u) null, (Continuation) this);
    }
}
