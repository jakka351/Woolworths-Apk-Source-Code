package me.oriient.internal.services.auth;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: me.oriient.internal.services.auth.u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1228u extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public D f25056a;
    public /* synthetic */ Object b;
    public final /* synthetic */ D c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1228u(D d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return D.a(this.c, null, null, this);
    }
}
