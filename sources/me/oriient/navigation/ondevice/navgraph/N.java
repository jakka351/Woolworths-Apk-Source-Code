package me.oriient.navigation.ondevice.navgraph;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class N extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public NavGraphRecord f26304a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Q c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(Q q, Continuation continuation) {
        super(continuation);
        this.c = q;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.getCacheStatus((NavGraphRecord) null, this);
    }
}
