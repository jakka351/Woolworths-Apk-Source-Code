package me.oriient.internal.services.auth;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: me.oriient.internal.services.auth.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1224p extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public D f25037a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ D d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1224p(D d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return D.a(this.d, null, this);
    }
}
