package me.oriient.navigation.ondevice.navgraph;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: me.oriient.navigation.ondevice.navgraph.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1796b extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26308a;
    public final /* synthetic */ C1797c b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1796b(C1797c c1797c, Continuation continuation) {
        super(continuation);
        this.b = c1797c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26308a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
