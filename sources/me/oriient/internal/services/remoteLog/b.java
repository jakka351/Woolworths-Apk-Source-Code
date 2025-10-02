package me.oriient.internal.services.remoteLog;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class b extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public e f25524a;
    public me.oriient.internal.services.remoteLog.models.a b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ e e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a((me.oriient.internal.services.remoteLog.models.a) null, this);
    }
}
