package me.oriient.internal.services.dataManager.obstacles;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class S extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public w f25243a;
    public /* synthetic */ Object b;
    public final /* synthetic */ U c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(U u, Continuation continuation) {
        super(continuation);
        this.c = u;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.getCacheStatus((w) null, (Continuation) this);
    }
}
