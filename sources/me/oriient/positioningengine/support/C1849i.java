package me.oriient.positioningengine.support;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: me.oriient.positioningengine.support.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1849i extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26555a;
    public final /* synthetic */ C1852l b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1849i(C1852l c1852l, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c1852l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26555a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
