package me.oriient.internal.services.dataManager.obstacles;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class x extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25265a;
    public final /* synthetic */ z b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, Continuation continuation) {
        super(continuation);
        this.b = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25265a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.getObstacles(null, null, 0.0d, this);
    }
}
