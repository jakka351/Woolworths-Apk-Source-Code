package me.oriient.internal.infra.locationManager;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class z extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24964a;
    public int b;
    public final /* synthetic */ A c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(A a2, Continuation continuation) {
        super(continuation);
        this.c = a2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24964a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
