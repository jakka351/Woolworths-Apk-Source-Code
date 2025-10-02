package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.services.geofence.BuildingGeofenceManager;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;

/* renamed from: me.oriient.ipssdk.realtime.ofs.j4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1671j4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1671j4 f26095a = new C1671j4();

    public C1671j4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return (BuildingGeofenceManager) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(BuildingGeofenceManager.class));
    }
}
