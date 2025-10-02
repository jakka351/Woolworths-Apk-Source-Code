package me.oriient.internal.services.sensorsManager;

import android.hardware.SensorManager;
import android.os.Handler;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import me.oriient.internal.infra.locationManager.SystemLocation;
import me.oriient.internal.infra.locationManager.SystemLocationManager;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.services.elog.ELog;
import org.jetbrains.annotations.NotNull;

/* renamed from: me.oriient.internal.services.sensorsManager.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1502p extends SensorWrapper {

    @NotNull
    public static final C1497k Companion = new C1497k();

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContextProvider f25588a;
    public final SystemLocationManager b;
    public final C1487a c;
    public final int d;
    public final ArrayList e;
    public final Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1502p(U u, ELog eLog, CoroutineContextProvider coroutineContextProvider, SystemLocationManager locationService) {
        super(-1, 5, u, 0, 1000, false, null, null, eLog);
        Intrinsics.h(eLog, "eLog");
        Intrinsics.h(coroutineContextProvider, "coroutineContextProvider");
        Intrinsics.h(locationService, "locationService");
        Intrinsics.e(u);
        this.f25588a = coroutineContextProvider;
        this.b = locationService;
        this.e = new ArrayList();
        this.f = new Object();
        this.receivedOneValue = true;
        this.d = -1;
        C1487a c1487a = new C1487a(5);
        this.c = c1487a;
        c1487a.f25565a = -1;
    }

    public final void a(SystemLocation systemLocation) {
        if (systemLocation != null) {
            Double verticalAccuracyMeters = systemLocation.getVerticalAccuracyMeters();
            float fDoubleValue = BitmapDescriptorFactory.HUE_RED;
            float fDoubleValue2 = verticalAccuracyMeters != null ? (float) verticalAccuracyMeters.doubleValue() : 0.0f;
            C1487a c1487a = this.c;
            float latitude = (float) systemLocation.getLatitude();
            float longitude = (float) systemLocation.getLongitude();
            Double altitude = systemLocation.getAltitude();
            if (altitude != null) {
                fDoubleValue = (float) altitude.doubleValue();
            }
            c1487a.c = new float[]{latitude, longitude, fDoubleValue, (float) systemLocation.getHorizontalAccuracy(), fDoubleValue2};
            this.c.b = systemLocation.getElapsedRealtimeNanos();
            this.c.f25565a = this.d;
        }
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorWrapper
    public final List getAndRemoveFirstEvents(int i) {
        throw new UnsupportedOperationException("location sensor can't provide more than one event");
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorWrapper
    public final C1487a getClosestEventAndRemovePriorEvents(long j) {
        return this.c;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorWrapper
    public final void turnOff() {
        this.b.stopLocationUpdates();
        synchronized (this.f) {
            try {
                Iterator it = this.e.iterator();
                while (it.hasNext()) {
                    ((Job) it.next()).cancel((CancellationException) null);
                }
                this.e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorWrapper
    public final void turnOn(SensorManager sensorManager, int i, Handler sensorsDataReceiver) {
        Intrinsics.h(sensorManager, "sensorManager");
        Intrinsics.h(sensorsDataReceiver, "sensorsDataReceiver");
        try {
            synchronized (this.f) {
                this.e.add(BuildersKt.c(CoroutineScopeKt.a(this.f25588a.getDefault()), null, null, new C1499m(this, null), 3));
                this.e.add(BuildersKt.c(CoroutineScopeKt.a(this.f25588a.getDefault()), null, null, new C1501o(this, null), 3));
            }
            a(this.b.getLastKnownLocation());
            this.b.startLocationUpdates(new me.oriient.internal.infra.locationManager.L());
        } catch (Exception e) {
            getELog().e("p", "turnOn: failed to start location service", MapsKt.i(new Pair("errorMessage", e.getMessage())));
        }
    }
}
