package me.oriient.internal.services.dataManager.plai;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class O extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public S f25285a;
    public String b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ S e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(S s, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = s;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return S.a(this.e, null, null, this);
    }
}
