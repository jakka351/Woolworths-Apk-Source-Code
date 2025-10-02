package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;

/* renamed from: me.oriient.ipssdk.realtime.ofs.c2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1627c2 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GeofenceBuilding f26054a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1627c2(GeofenceBuilding geofenceBuilding) {
        super(0);
        this.f26054a = geofenceBuilding;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return androidx.constraintlayout.core.state.a.s("buildingId", this.f26054a.getId());
    }
}
