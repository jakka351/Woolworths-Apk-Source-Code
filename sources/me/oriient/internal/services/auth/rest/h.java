package me.oriient.internal.services.auth.rest;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class h extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public k f25049a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ k d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
