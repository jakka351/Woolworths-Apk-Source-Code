package me.oriient.internal.services.geofence;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.internal.infra.locationManager.SystemLocation;

/* loaded from: classes7.dex */
public final class z extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C f25523a;
    public SystemLocation b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, this);
    }
}
