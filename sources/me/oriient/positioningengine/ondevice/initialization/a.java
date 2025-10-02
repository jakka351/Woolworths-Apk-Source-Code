package me.oriient.positioningengine.ondevice.initialization;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.DeviceIdProvider;
import me.oriient.internal.infra.utils.core.OsData;
import me.oriient.internal.services.dataManager.engine.EngineVersionProvider;
import me.oriient.internal.services.dataModel.engine.OnDeviceEngineCoreConfigProvider;
import me.oriient.positioningengine.common.DiKt;
import me.oriient.positioningengine.common.PositioningContext;
import me.oriient.positioningengine.ondevice.EngineSessionMetadata;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f26434a;
    public final OnDeviceEngineCoreConfigProvider b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;

    public a(String spaceId, OnDeviceEngineCoreConfigProvider engineConfigProvider) {
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(engineConfigProvider, "engineConfigProvider");
        this.f26434a = spaceId;
        this.b = engineConfigProvider;
        DependencyInjection di = DiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.c = di.inject(reflectionFactory.b(DeviceIdProvider.class));
        this.d = DiKt.getDi().inject(reflectionFactory.b(OsData.class));
        this.e = DiKt.getDi().inject(reflectionFactory.b(EngineVersionProvider.class));
        this.f = DiKt.getDi().inject(reflectionFactory.b(me.oriient.positioningengine.common.config.c.class));
    }

    public final EngineSessionMetadata a(PositioningContext context) {
        Intrinsics.h(context, "context");
        return new EngineSessionMetadata(context.getStartTimeMillis(), context.getStartTimeMillis(), ((OsData) this.d.getD()).getDeviceDescription(), "Android", false, this.f26434a, context.getSessionId(), ((DeviceIdProvider) this.c.getD()).getDeviceId(), ((EngineVersionProvider) this.e.getD()).getVersion(), context.getEngineSession().getId(), context.getEngineSession().getExpirationTimeStamp(), ((me.oriient.positioningengine.common.config.a) ((me.oriient.positioningengine.common.config.d) ((me.oriient.positioningengine.common.config.c) this.f.getD())).f26374a.getValue()).g, this.b.configForBuilding(context.getBuildingId()).getRtEngine().getFlipAxes());
    }
}
