package me.oriient.positioningengine.ondevice.models;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.services.elog.ELog;
import me.oriient.positioningengine.common.DiKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class c implements EngineSessionInfo {

    @NotNull
    private static final b Companion = new b();
    public boolean d;
    public Double e;
    public long g;
    public long h;
    public boolean k;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f26471a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public EnginePerformanceReport f = new a();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final Lazy l = DiKt.getDi().inject(Reflection.f24268a.b(ELog.class));

    @Override // me.oriient.positioningengine.ondevice.models.EngineSessionInfo
    public final List getFloors() {
        return this.f26471a;
    }

    @Override // me.oriient.positioningengine.ondevice.models.EngineSessionInfo
    public final List getFloorsDataVersions() {
        return this.c;
    }

    @Override // me.oriient.positioningengine.ondevice.models.EngineSessionInfo
    public final List getFloorsLoadingTimestamps() {
        return this.j;
    }

    @Override // me.oriient.positioningengine.ondevice.models.EngineSessionInfo
    public final List getMappingDataVersions() {
        return this.b;
    }

    @Override // me.oriient.positioningengine.ondevice.models.EngineSessionInfo
    public final List getMapsLoadingTimestamps() {
        return this.i;
    }

    @Override // me.oriient.positioningengine.ondevice.models.EngineSessionInfo
    public final EnginePerformanceReport getPerformanceReport() {
        return this.f;
    }

    @Override // me.oriient.positioningengine.ondevice.models.EngineSessionInfo
    public final boolean getStartFromContinousCalibration() {
        return this.d;
    }

    @Override // me.oriient.positioningengine.ondevice.models.EngineSessionInfo
    public final long getTimeDwellingLockedMillis() {
        return this.h;
    }

    @Override // me.oriient.positioningengine.ondevice.models.EngineSessionInfo
    public final Double getTimeToStartPositioningSeconds() {
        return this.e;
    }

    @Override // me.oriient.positioningengine.ondevice.models.EngineSessionInfo
    public final long getTimeWalkingLockedMillis() {
        return this.g;
    }
}
