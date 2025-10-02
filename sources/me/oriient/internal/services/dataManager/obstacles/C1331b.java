package me.oriient.internal.services.dataManager.obstacles;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: me.oriient.internal.services.dataManager.obstacles.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1331b extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25246a;
    public final /* synthetic */ C1332c b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1331b(C1332c c1332c, Continuation continuation) {
        super(continuation);
        this.b = c1332c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25246a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
