package me.oriient.positioningengine.ondevice.util.locationReporter;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorKt;
import me.oriient.internal.infra.rest.OriientApiProvider;
import me.oriient.internal.infra.utils.core.DeviceIdProvider;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.eventManager.EventManager;
import me.oriient.internal.services.eventManager.EventManagerFactory;
import me.oriient.positioningengine.common.DiKt;
import me.oriient.positioningengine.common.PositioningEngine;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class h implements LocationReporter {

    @NotNull
    private static final a Companion = new a();

    /* renamed from: a, reason: collision with root package name */
    public final PositioningEngine f26489a;
    public final LocationReporterConfig b;
    public final EventManagerFactory c;
    public final DeviceIdProvider d;
    public final TimeProvider e;
    public final OriientApiProvider f;
    public String g;
    public boolean h;
    public final CoroutineScope i;
    public EventManager j;
    public final Lazy k;
    public volatile long l;

    public h(PositioningEngine engine, LocationReporterConfig config, EventManagerFactory factory, DeviceIdProvider deviceIdProvider, TimeProvider timeProvider, OriientApiProvider oriientApiProvider, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.h(engine, "engine");
        Intrinsics.h(config, "config");
        Intrinsics.h(factory, "factory");
        Intrinsics.h(deviceIdProvider, "deviceIdProvider");
        Intrinsics.h(timeProvider, "timeProvider");
        Intrinsics.h(oriientApiProvider, "oriientApiProvider");
        Intrinsics.h(coroutineContextProvider, "coroutineContextProvider");
        this.f26489a = engine;
        this.b = config;
        this.c = factory;
        this.d = deviceIdProvider;
        this.e = timeProvider;
        this.f = oriientApiProvider;
        this.i = CoroutineScopeKt.a(coroutineContextProvider.getIo().plus(SupervisorKt.b()));
        this.k = DiKt.getDi().inject(Reflection.f24268a.b(Logger.class));
    }

    @Override // me.oriient.positioningengine.ondevice.util.locationReporter.LocationReporter
    public final String getUserId() {
        return this.g;
    }

    @Override // me.oriient.positioningengine.ondevice.util.locationReporter.LocationReporter
    public final boolean isEnabled() {
        return this.h;
    }

    @Override // me.oriient.positioningengine.ondevice.util.locationReporter.LocationReporter
    public final void setEnabled(boolean z) {
        this.h = z;
        JobKt.d(this.i.getD());
        if (z) {
            ((Logger) this.k.getD()).d("LocationReporter", "setupReporting() called");
            BuildersKt.c(this.i, null, null, new g(this, null), 3);
            return;
        }
        ((Logger) this.k.getD()).d("LocationReporter", "tearDownReporting() called");
        EventManager eventManager = this.j;
        if (eventManager != null) {
            eventManager.disconnect();
        }
        this.j = null;
    }

    @Override // me.oriient.positioningengine.ondevice.util.locationReporter.LocationReporter
    public final void setUserId(String str) {
        EventManager eventManager = this.j;
        if (eventManager != null) {
            eventManager.setSenderName(str);
        }
        this.g = str;
    }
}
