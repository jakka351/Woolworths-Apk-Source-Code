package me.oriient.internal.services.geofence;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes7.dex */
public final class r extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BuildingGeofenceManagerImpl f25496a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(BuildingGeofenceManagerImpl buildingGeofenceManagerImpl) {
        super(0);
        this.f25496a = buildingGeofenceManagerImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        x geofenceStrategyFactory = this.f25496a.getGeofenceStrategyFactory();
        CoroutineScope coroutineScope = this.f25496a.geofenceCoroutineScope;
        geofenceStrategyFactory.getClass();
        Intrinsics.h(coroutineScope, "coroutineScope");
        return new me.oriient.internal.services.geofence.strategy.z(coroutineScope);
    }
}
