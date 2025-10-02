package me.oriient.positioningengine.ondevice.debugging;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class k extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public n f26425a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ n d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, Continuation continuation) {
        super(continuation);
        this.d = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return n.a(this.d, false, this);
    }
}
