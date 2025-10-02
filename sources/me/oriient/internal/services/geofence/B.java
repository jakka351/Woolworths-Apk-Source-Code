package me.oriient.internal.services.geofence;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.locationManager.SystemLocation;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;

/* loaded from: classes7.dex */
public final class B extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C f25475a;
    public final /* synthetic */ SystemLocation b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C c, SystemLocation systemLocation) {
        super(1);
        this.f25475a = c;
        this.b = systemLocation;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GeofenceBuilding building = (GeofenceBuilding) obj;
        Intrinsics.h(building, "building");
        return new Pair(building, this.f25475a.a(building, this.b));
    }
}
