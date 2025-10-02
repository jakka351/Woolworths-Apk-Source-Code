package me.oriient.internal.services.geofence;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.building.Building;
import me.oriient.internal.services.geofence.models.GeofenceBuildingKt;

/* loaded from: classes7.dex */
public final class A extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final A f25474a = new A();

    public A() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Building it = (Building) obj;
        Intrinsics.h(it, "it");
        return GeofenceBuildingKt.toGeofenceBuilding(it);
    }
}
