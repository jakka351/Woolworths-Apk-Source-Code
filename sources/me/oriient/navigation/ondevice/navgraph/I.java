package me.oriient.navigation.ondevice.navgraph;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class I extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Q f26299a;
    public w b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Q e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(Q q, Continuation continuation) {
        super(continuation);
        this.e = q;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.fetchData((w) null, this);
    }
}
