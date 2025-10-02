package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.geofence.BuildingGeofenceManagerImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.i4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1665i4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1665i4 f26089a = new C1665i4();

    public C1665i4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new BuildingGeofenceManagerImpl();
    }
}
