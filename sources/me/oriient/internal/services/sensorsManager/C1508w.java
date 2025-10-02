package me.oriient.internal.services.sensorsManager;

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
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.sensorsManager.OriientSensorWrapper;
import org.jetbrains.annotations.NotNull;

/* renamed from: me.oriient.internal.services.sensorsManager.w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1508w extends OriientSensorWrapper {

    @NotNull
    public static final r Companion = new r();

    /* renamed from: a, reason: collision with root package name */
    public final SystemLocationManager f25608a;
    public final CoroutineContextProvider b;
    public final C1487a c;
    public final ArrayList d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1508w(boolean z, ELog eLog, SystemLocationManager locationService, CoroutineContextProvider coroutineContextProvider, Logger logger, TimeProvider timeProvider) {
        super(-1, OriientSensorWrapper.a.NON_CRITICAL, 5, 0, 1000, z, null, eLog, logger, timeProvider);
        Intrinsics.h(eLog, "eLog");
        Intrinsics.h(locationService, "locationService");
        Intrinsics.h(coroutineContextProvider, "coroutineContextProvider");
        Intrinsics.h(logger, "logger");
        Intrinsics.h(timeProvider, "timeProvider");
        this.f25608a = locationService;
        this.b = coroutineContextProvider;
        this.d = new ArrayList();
        this.e = new Object();
        this.receivedOneValue = true;
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
            this.c.f25565a = getType();
        }
    }

    @Override // me.oriient.internal.services.sensorsManager.OriientSensorWrapper
    public final List getAndRemoveFirstEvents(int i) {
        throw new UnsupportedOperationException("location sensor can't provide more than one event");
    }

    @Override // me.oriient.internal.services.sensorsManager.OriientSensorWrapper
    public final C1487a getClosestEventAndRemovePriorEvents(long j) {
        return this.c;
    }

    @Override // me.oriient.internal.services.sensorsManager.OriientSensorWrapper
    public final void turnOff(boolean z) {
        this.f25608a.stopLocationUpdates();
        synchronized (this.e) {
            try {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    ((Job) it.next()).cancel((CancellationException) null);
                }
                this.d.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // me.oriient.internal.services.sensorsManager.OriientSensorWrapper
    public final boolean turnOn(SystemSensorManager sensorManager, int i, Handler sensorsDataReceiver) {
        Intrinsics.h(sensorManager, "sensorManager");
        Intrinsics.h(sensorsDataReceiver, "sensorsDataReceiver");
        try {
            synchronized (this.e) {
                this.d.add(BuildersKt.c(CoroutineScopeKt.a(this.b.getDefault()), null, null, new C1505t(this, null), 3));
                this.d.add(BuildersKt.c(CoroutineScopeKt.a(this.b.getDefault()), null, null, new C1507v(this, null), 3));
            }
            a(this.f25608a.getLastKnownLocation());
            this.f25608a.startLocationUpdates(new me.oriient.internal.infra.locationManager.L());
            return true;
        } catch (Exception e) {
            getELog().e("LocationSensorWrapper", "turnOn: failed to start location service", MapsKt.i(new Pair("errorMessage", e.getMessage())));
            return false;
        }
    }
}
