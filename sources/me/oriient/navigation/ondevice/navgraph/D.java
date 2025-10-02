package me.oriient.navigation.ondevice.navgraph;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class D extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26295a;
    public final /* synthetic */ G b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(G g, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26295a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
