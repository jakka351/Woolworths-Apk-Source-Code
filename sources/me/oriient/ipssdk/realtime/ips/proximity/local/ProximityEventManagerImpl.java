package me.oriient.ipssdk.realtime.ips.proximity.local;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.internal.ContextScope;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager;
import me.oriient.ipssdk.ips.IPSLocalProximityEvent;
import me.oriient.ipssdk.realtime.ips.proximity.ProximityStatsManager;
import me.oriient.ipssdk.realtime.ofs.I3;
import me.oriient.ipssdk.realtime.ofs.J3;
import me.oriient.ipssdk.realtime.ofs.O3;
import me.oriient.ipssdk.realtime.ofs.Q3;
import me.oriient.ipssdk.realtime.ofs.S3;
import me.oriient.ipssdk.realtime.wrappers.PositioningWrapper;
import me.oriient.positioningengine.common.PositioningEngineState;
import me.oriient.positioningengine.common.PositioningUpdate;
import me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u001d\u0010\u0012\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/proximity/local/ProximityEventManagerImpl;", "Lme/oriient/ipssdk/realtime/ips/proximity/local/ProximityEventManager;", "Lme/oriient/ipssdk/realtime/ips/proximity/local/ProximityEventOrigin;", "origin", "<init>", "(Lme/oriient/ipssdk/realtime/ips/proximity/local/ProximityEventOrigin;)V", "", "Lme/oriient/ipssdk/ips/IPSLocalProximityEvent;", "toAdd", "", "addProximityEvents", "(Ljava/util/List;)V", "newEvents", "setProximityEvents", "toRemove", "removeProximityEvents", "", "groupIds", "removeProximityEventsByGroupIds", "removeAllProximityEvents", "()V", "Companion", "me/oriient/ipssdk/realtime/ofs/J3", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ProximityEventManagerImpl implements ProximityEventManager {

    @NotNull
    private static final J3 Companion = new J3();

    /* renamed from: a, reason: collision with root package name */
    private final ProximityEventOrigin f25902a;
    private final Lazy b;
    private final Lazy c;
    private final Lazy d;
    private final Lazy e;
    private final Lazy f;
    private final Lazy g;
    private final CoroutineScope h;
    private final CoroutineScope i;
    private final LinkedHashSet j;
    private final ArrayList k;
    private String l;
    private long m;

    public ProximityEventManagerImpl(@NotNull ProximityEventOrigin origin) {
        Intrinsics.h(origin, "origin");
        this.f25902a = origin;
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.b = di.inject(reflectionFactory.b(Logger.class));
        this.c = DependencyInjectionKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.d = DependencyInjectionKt.getDi().inject(reflectionFactory.b(SupportPositioningEngineManager.class));
        Lazy lazyInject = DependencyInjectionKt.getDi().inject(reflectionFactory.b(CoroutineContextProvider.class));
        this.e = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RemoteConfigManager.class));
        this.f = DependencyInjectionKt.getDi().inject(reflectionFactory.b(PositioningWrapper.class));
        this.g = DependencyInjectionKt.getDi().inject(reflectionFactory.b(ProximityStatsManager.class));
        this.h = CoroutineScopeKt.a(((CoroutineContextProvider) lazyInject.getD()).getMain());
        ContextScope contextScopeA = CoroutineScopeKt.a(((CoroutineContextProvider) lazyInject.getD()).newSingleThreadCoroutineContext());
        this.i = contextScopeA;
        this.j = new LinkedHashSet();
        this.k = new ArrayList();
        BuildersKt.c(contextScopeA, null, null, new I3(this, null), 3);
    }

    public static final ELog access$getELog(ProximityEventManagerImpl proximityEventManagerImpl) {
        return (ELog) proximityEventManagerImpl.c.getD();
    }

    public static final SupportPositioningEngineManager access$getEngineManager(ProximityEventManagerImpl proximityEventManagerImpl) {
        return (SupportPositioningEngineManager) proximityEventManagerImpl.d.getD();
    }

    public static final Logger access$getLogger(ProximityEventManagerImpl proximityEventManagerImpl) {
        return (Logger) proximityEventManagerImpl.b.getD();
    }

    public static final ProximityStatsManager access$getProximityStatsManager(ProximityEventManagerImpl proximityEventManagerImpl) {
        return (ProximityStatsManager) proximityEventManagerImpl.g.getD();
    }

    public static final void access$onNewEngineState(ProximityEventManagerImpl proximityEventManagerImpl, PositioningEngineState positioningEngineState) {
        proximityEventManagerImpl.getClass();
        if (positioningEngineState instanceof PositioningEngineState.Positioning) {
            proximityEventManagerImpl.l = ((PositioningEngineState.Positioning) positioningEngineState).getContext().getBuildingId();
            return;
        }
        proximityEventManagerImpl.l = null;
        proximityEventManagerImpl.m = 0L;
        Iterator it = proximityEventManagerImpl.j.iterator();
        while (it.hasNext()) {
            ((LocalProximityEventWrapper) it.next()).reset();
        }
    }

    public static final void access$onNewPosition(ProximityEventManagerImpl proximityEventManagerImpl, PositioningUpdate positioningUpdate) {
        ((Logger) proximityEventManagerImpl.b.getD()).d("LocalProximityManager", "onNewPosition() called with: positioningUpdate = " + positioningUpdate);
        if (Math.abs(positioningUpdate.getStartTimeMillis() - proximityEventManagerImpl.m) < ((RemoteConfigManager) proximityEventManagerImpl.e.getD()).getRealTimeConfig().getProximityConfig().getPositionUpdatesThrottlingMillis()) {
            ((Logger) proximityEventManagerImpl.b.getD()).d("LocalProximityManager", "onNewPosition: throttled. doing nothing...");
            return;
        }
        String str = proximityEventManagerImpl.l;
        if (str == null) {
            ((Logger) proximityEventManagerImpl.b.getD()).d("LocalProximityManager", "no building id");
            return;
        }
        if (positioningUpdate.getLockProgress() < ((PositioningWrapper) proximityEventManagerImpl.f.getD()).getLockThreshold()) {
            ((Logger) proximityEventManagerImpl.b.getD()).d("LocalProximityManager", "position is not locked.");
            return;
        }
        proximityEventManagerImpl.m = positioningUpdate.getStartTimeMillis();
        Iterator it = proximityEventManagerImpl.j.iterator();
        while (it.hasNext()) {
            ((LocalProximityEventWrapper) it.next()).onNewPosition(positioningUpdate, str);
        }
    }

    public static final boolean access$verifyOrigin(ProximityEventManagerImpl proximityEventManagerImpl, List list) {
        proximityEventManagerImpl.getClass();
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((IPSLocalProximityEvent) it.next()).getOrigin() != proximityEventManagerImpl.f25902a) {
                return false;
            }
        }
        return true;
    }

    @Override // me.oriient.ipssdk.realtime.ips.proximity.local.ProximityEventManager
    public void addProximityEvents(@NotNull List<IPSLocalProximityEvent> toAdd) {
        Intrinsics.h(toAdd, "toAdd");
        BuildersKt.c(this.i, null, null, new a(this, toAdd, null), 3);
    }

    @Override // me.oriient.ipssdk.realtime.ips.proximity.local.ProximityEventManager
    public void removeAllProximityEvents() {
        BuildersKt.c(this.i, null, null, new O3(this, null), 3);
    }

    @Override // me.oriient.ipssdk.realtime.ips.proximity.local.ProximityEventManager
    public void removeProximityEvents(@NotNull List<IPSLocalProximityEvent> toRemove) {
        Intrinsics.h(toRemove, "toRemove");
        BuildersKt.c(this.i, null, null, new Q3(this, toRemove, null), 3);
    }

    @Override // me.oriient.ipssdk.realtime.ips.proximity.local.ProximityEventManager
    public void removeProximityEventsByGroupIds(@NotNull List<String> groupIds) {
        Intrinsics.h(groupIds, "groupIds");
        BuildersKt.c(this.i, null, null, new S3(this, groupIds, null), 3);
    }

    @Override // me.oriient.ipssdk.realtime.ips.proximity.local.ProximityEventManager
    public void setProximityEvents(@NotNull List<IPSLocalProximityEvent> newEvents) {
        Intrinsics.h(newEvents, "newEvents");
        BuildersKt.c(this.i, null, null, new b(this, newEvents, null), 3);
    }
}
