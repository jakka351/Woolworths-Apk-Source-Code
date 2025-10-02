package me.oriient.internal.services.geofence.strategy;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.internal.infra.locationManager.SystemLocation;

/* loaded from: classes7.dex */
public final class g extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public p f25502a;
    public SystemLocation b;
    public /* synthetic */ Object c;
    public final /* synthetic */ p d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p pVar, Continuation continuation) {
        super(continuation);
        this.d = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return p.a(this.d, null, null, this);
    }
}
