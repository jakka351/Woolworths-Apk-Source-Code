package me.oriient.internal.infra.locationManager;

import android.location.Location;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: me.oriient.internal.infra.locationManager.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1194f extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FusedLocationManager f24948a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1194f(FusedLocationManager fusedLocationManager) {
        super(1);
        this.f24948a = fusedLocationManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Location location = (Location) obj;
        if (location != null) {
            SystemLocation systemLocationA = AbstractC1189a.a(location);
            this.f24948a._lastKnownLocation = systemLocationA;
            this.f24948a.getLocationUpdates().f(systemLocationA);
        }
        return Unit.f24250a;
    }
}
