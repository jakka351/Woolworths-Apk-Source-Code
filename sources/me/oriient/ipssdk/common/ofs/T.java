package me.oriient.ipssdk.common.ofs;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.ipssdk.common.services.geofencing.LiveGeofenceManagerImpl;

/* loaded from: classes2.dex */
public final class T extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public LiveGeofenceManagerImpl f25731a;
    public /* synthetic */ Object b;
    public final /* synthetic */ LiveGeofenceManagerImpl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(LiveGeofenceManagerImpl liveGeofenceManagerImpl, Continuation continuation) {
        super(continuation);
        this.c = liveGeofenceManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return LiveGeofenceManagerImpl.access$enableCorrectStrategyIfNeeded(this.c, false, this);
    }
}
