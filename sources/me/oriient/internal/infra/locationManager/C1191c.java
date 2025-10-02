package me.oriient.internal.infra.locationManager;

import android.location.Location;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: me.oriient.internal.infra.locationManager.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1191c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FusedLocationManager f24945a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1191c(FusedLocationManager fusedLocationManager) {
        super(1);
        this.f24945a = fusedLocationManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Location location = (Location) obj;
        this.f24945a._lastKnownLocation = location != null ? AbstractC1189a.a(location) : null;
        return Unit.f24250a;
    }
}
