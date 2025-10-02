package me.oriient.internal.services.geofence.strategy;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class m extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public p f25508a;
    public /* synthetic */ Object b;
    public final /* synthetic */ p c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return p.a(this.c, this);
    }
}
