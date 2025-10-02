package me.oriient.ipssdk.realtime.ips.proximity;

import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.dataModel.proximity.ProximityMetadataProvider;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.realtime.ips.proximity.ProximityStatsManager;
import me.oriient.ipssdk.realtime.ips.proximity.local.ProximityEventOrigin;
import me.oriient.ipssdk.realtime.ofs.X3;
import me.oriient.ipssdk.realtime.ofs.Y3;
import me.oriient.ipssdk.realtime.ofs.Z3;
import me.oriient.ipssdk.realtime.wrappers.ProximityWrapper;
import me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/proximity/ProximityStatsManagerImpl;", "Lme/oriient/ipssdk/realtime/ips/proximity/ProximityStatsManager;", "<init>", "()V", "Lme/oriient/ipssdk/realtime/ips/proximity/local/ProximityEventOrigin;", "origin", "", "newValue", "", "onNewTriggersCount", "(Lme/oriient/ipssdk/realtime/ips/proximity/local/ProximityEventOrigin;I)V", "", "isFirstTrigger", "Lme/oriient/ipssdk/realtime/ips/proximity/ProximityStatsManager$EventShape;", "eventShape", "onEventTriggered", "(Lme/oriient/ipssdk/realtime/ips/proximity/local/ProximityEventOrigin;ZLme/oriient/ipssdk/realtime/ips/proximity/ProximityStatsManager$EventShape;)V", "Lme/oriient/internal/services/dataModel/proximity/ProximityMetadataProvider$ProximityMetadata;", "getMetadataSnapshot", "()Lme/oriient/internal/services/dataModel/proximity/ProximityMetadataProvider$ProximityMetadata;", "Companion", "me/oriient/ipssdk/realtime/ofs/Y3", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ProximityStatsManagerImpl implements ProximityStatsManager {

    @NotNull
    private static final Y3 Companion = new Y3();

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f25889a;
    private final Lazy b;
    private final LinkedHashMap c;
    private boolean d;
    private Job e;

    public ProximityStatsManagerImpl() {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        di.inject(reflectionFactory.b(Logger.class));
        this.f25889a = DependencyInjectionKt.getDi().inject(reflectionFactory.b(ProximityWrapper.class));
        this.b = DependencyInjectionKt.getDi().inject(reflectionFactory.b(SupportPositioningEngineManager.class));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ProximityEventOrigin proximityEventOrigin : ProximityEventOrigin.values()) {
            linkedHashMap.put(proximityEventOrigin, new ProximityMetadataImpl(0, 0, 0, 0, 0, 0, 0, 127, null));
        }
        this.c = linkedHashMap;
        BuildersKt.c(((ProximityWrapper) this.f25889a.getD()).getProximityCoroutineScope(), null, null, new X3(this, null), 3);
    }

    private final void a() {
        for (ProximityEventOrigin proximityEventOrigin : ProximityEventOrigin.values()) {
            ProximityMetadataImpl proximityMetadataImpl = (ProximityMetadataImpl) this.c.get(proximityEventOrigin);
            if (proximityMetadataImpl != null) {
                ProximityMetadataImpl proximityMetadataImpl2 = new ProximityMetadataImpl(0, 0, 0, 0, 0, 0, 0, 127, null);
                proximityMetadataImpl2.setTriggersCreated(proximityMetadataImpl.getTriggersCreated());
                this.c.put(proximityEventOrigin, proximityMetadataImpl2);
            }
        }
    }

    public static final SupportPositioningEngineManager access$getEngineManager(ProximityStatsManagerImpl proximityStatsManagerImpl) {
        return (SupportPositioningEngineManager) proximityStatsManagerImpl.b.getD();
    }

    public static final void access$onPositioningSessionStarted(ProximityStatsManagerImpl proximityStatsManagerImpl) {
        if (proximityStatsManagerImpl.d) {
            return;
        }
        proximityStatsManagerImpl.d = true;
        proximityStatsManagerImpl.a();
    }

    public static final void access$onPositioningSessionStopped(ProximityStatsManagerImpl proximityStatsManagerImpl) {
        if (proximityStatsManagerImpl.d) {
            proximityStatsManagerImpl.d = false;
            proximityStatsManagerImpl.a();
        }
    }

    public static final void access$setEngineObserver(ProximityStatsManagerImpl proximityStatsManagerImpl, Job job) {
        Job job2 = proximityStatsManagerImpl.e;
        if (job2 != null) {
            job2.cancel((CancellationException) null);
        }
        proximityStatsManagerImpl.e = job;
    }

    @Override // me.oriient.internal.services.dataModel.proximity.ProximityMetadataProvider
    @NotNull
    public ProximityMetadataProvider.ProximityMetadata getMetadataSnapshot() {
        ProximityMetadataImpl proximityMetadataImpl;
        ProximityMetadataImpl proximityMetadataImpl2 = new ProximityMetadataImpl(0, 0, 0, 0, 0, 0, 0, 127, null);
        for (ProximityEventOrigin proximityEventOrigin : ProximityEventOrigin.values()) {
            if (proximityEventOrigin.getShouldReportStatistics() && (proximityMetadataImpl = (ProximityMetadataImpl) this.c.get(proximityEventOrigin)) != null) {
                proximityMetadataImpl2.setTriggersCreated(proximityMetadataImpl.getTriggersCreated() + proximityMetadataImpl2.getTriggersCreated());
                proximityMetadataImpl2.setTriggersTriggered(proximityMetadataImpl.getTriggersTriggered() + proximityMetadataImpl2.getTriggersTriggered());
                proximityMetadataImpl2.setTriggersTriggeredUnique(proximityMetadataImpl.getTriggersTriggeredUnique() + proximityMetadataImpl2.getTriggersTriggeredUnique());
                proximityMetadataImpl2.setTriggersTriggeredCircle(proximityMetadataImpl.getTriggersTriggeredCircle() + proximityMetadataImpl2.getTriggersTriggeredCircle());
                proximityMetadataImpl2.setTriggersTriggeredRectangle(proximityMetadataImpl.getTriggersTriggeredRectangle() + proximityMetadataImpl2.getTriggersTriggeredRectangle());
                proximityMetadataImpl2.setTriggersTriggeredPolygon(proximityMetadataImpl.getTriggersTriggeredPolygon() + proximityMetadataImpl2.getTriggersTriggeredPolygon());
                proximityMetadataImpl2.setTriggersTriggeredWalkingDistance(proximityMetadataImpl.getTriggersTriggeredWalkingDistance() + proximityMetadataImpl2.getTriggersTriggeredWalkingDistance());
            }
        }
        return proximityMetadataImpl2;
    }

    @Override // me.oriient.ipssdk.realtime.ips.proximity.ProximityStatsManager
    public void onEventTriggered(@NotNull ProximityEventOrigin origin, boolean isFirstTrigger, @NotNull ProximityStatsManager.EventShape eventShape) {
        Intrinsics.h(origin, "origin");
        Intrinsics.h(eventShape, "eventShape");
        BuildersKt.c(((ProximityWrapper) this.f25889a.getD()).getProximityCoroutineScope(), null, null, new a(this, origin, isFirstTrigger, eventShape, null), 3);
    }

    @Override // me.oriient.ipssdk.realtime.ips.proximity.ProximityStatsManager
    public void onNewTriggersCount(@NotNull ProximityEventOrigin origin, int newValue) {
        Intrinsics.h(origin, "origin");
        BuildersKt.c(((ProximityWrapper) this.f25889a.getD()).getProximityCoroutineScope(), null, null, new Z3(this, origin, newValue, null), 3);
    }
}
